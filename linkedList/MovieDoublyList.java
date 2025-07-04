class MovieDoublyList {
    private static class Node {
        String title;
        String director;
        int year;
        double rating;
        Node next, prev;

        Node(String title, String director, int year, double rating) {
            this.title = title;
            this.director = director;
            this.year = year;
            this.rating = rating;
        }
    }

    private Node head, tail;
    private int size = 0;

    /* Insert Operations */
    public void addAtBeginning(String title, String director, int year, double rating) {
        Node newNode = new Node(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addAtEnd(String title, String director, int year, double rating) {
        Node newNode = new Node(title, director, year, rating);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 0 || head == null) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        if (position >= size) {
            addAtEnd(title, director, year, rating);
            return;
        }
        Node curr = head;
        for (int i = 0; i < position; i++) curr = curr.next;
        Node newNode = new Node(title, director, year, rating);
        newNode.next = curr;
        newNode.prev = curr.prev;
        curr.prev.next = newNode;
        curr.prev = newNode;
        size++;
    }

    /* Remove */
    public boolean removeByTitle(String title) {
        Node curr = head;
        while (curr != null && !curr.title.equalsIgnoreCase(title)) curr = curr.next;
        if (curr == null) return false;
        if (curr.prev != null) curr.prev.next = curr.next;
        else head = curr.next;
        if (curr.next != null) curr.next.prev = curr.prev;
        else tail = curr.prev;
        size--;
        return true;
    }

    /* Search */
    public void searchByDirector(String director) {
        Node curr = head;
        System.out.printf("Movies directed by %s:%n", director);
        while (curr != null) {
            if (curr.director.equalsIgnoreCase(director)) {
                System.out.printf("%s (%d) Rating: %.1f%n", curr.title, curr.year, curr.rating);
            }
            curr = curr.next;
        }
    }

    public void searchByRating(double minRating) {
        Node curr = head;
        System.out.printf("Movies with rating >= %.1f:%n", minRating);
        while (curr != null) {
            if (curr.rating >= minRating) {
                System.out.printf("%s (%d) Rating: %.1f%n", curr.title, curr.year, curr.rating);
            }
            curr = curr.next;
        }
    }

    /* Update */
    public boolean updateRating(String title, double newRating) {
        Node curr = head;
        while (curr != null) {
            if (curr.title.equalsIgnoreCase(title)) {
                curr.rating = newRating;
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    /* Display */
    public void displayForward() {
        Node curr = head;
        System.out.println("Movies (forward):");
        while (curr != null) {
            System.out.printf("%s | %s | %d | %.1f%n", curr.title, curr.director, curr.year, curr.rating);
            curr = curr.next;
        }
    }

    public void displayReverse() {
        Node curr = tail;
        System.out.println("Movies (reverse):");
        while (curr != null) {
            System.out.printf("%s | %s | %d | %.1f%n", curr.title, curr.director, curr.year, curr.rating);
            curr = curr.prev;
        }
    }
}
