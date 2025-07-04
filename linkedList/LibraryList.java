class LibraryList {
    static class Node {
        String title, author, genre;
        int bookId;
        boolean available;
        Node next, prev;

        Node(String title, String author, String genre, int bookId, boolean available) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.bookId = bookId;
            this.available = available;
        }
    }

    Node head, tail;

    public void addAtEnd(String title, String author, String genre, int id, boolean available) {
        Node newNode = new Node(title, author, genre, id, available);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public boolean removeById(int bookId) {
        Node curr = head;
        while (curr != null) {
            if (curr.bookId == bookId) {
                if (curr.prev != null) curr.prev.next = curr.next;
                else head = curr.next;
                if (curr.next != null) curr.next.prev = curr.prev;
                else tail = curr.prev;
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public void search(String keyword) {
        Node curr = head;
        while (curr != null) {
            if (curr.title.equalsIgnoreCase(keyword) || curr.author.equalsIgnoreCase(keyword)) {
                System.out.printf("%s by %s [%s] - %s\n",
                        curr.title, curr.author, curr.genre, curr.available ? "Available" : "Not Available");
            }
            curr = curr.next;
        }
    }

    public boolean updateAvailability(int bookId, boolean newStatus) {
        Node curr = head;
        while (curr != null) {
            if (curr.bookId == bookId) {
                curr.available = newStatus;
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public void displayForward() {
        Node curr = head;
        while (curr != null) {
            System.out.printf("%s [%d] by %s (%s)\n",
                    curr.title, curr.bookId, curr.author,
                    curr.available ? "Available" : "Unavailable");
            curr = curr.next;
        }
    }

    public void displayReverse() {
        Node curr = tail;
        while (curr != null) {
            System.out.printf("%s [%d] by %s (%s)\n",
                    curr.title, curr.bookId, curr.author,
                    curr.available ? "Available" : "Unavailable");
            curr = curr.prev;
        }
    }

    public int countBooks() {
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }
}

// 6. Round Robin Scheduling Algorithm (Circular Linked List)
class RoundRobinScheduler {
    static class Node {
        int processId, burstTime, priority;
        Node next;

        Node(int pid, int bt, int pr) {
            processId = pid;
            burstTime = bt;
            priority = pr;
        }
    }

    private Node head = null;

    public void addProcess(int pid, int burst, int priority) {
        Node newNode = new Node(pid, burst, priority);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }

    public void removeProcess(int pid) {
        if (head == null) return;
        Node prev = null, curr = head;
        do {
            if (curr.processId == pid) {
                if (prev != null) prev.next = curr.next;
                else {
                    Node tail = head;
                    while (tail.next != head) tail = tail.next;
                    head = curr.next;
                    tail.next = head;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    public void simulate(int quantum) {
        if (head == null) return;
        Node curr = head;
        int time = 0;
        while (true) {
            boolean allDone = true;
            Node start = curr;
            do {
                if (curr.burstTime > 0) {
                    allDone = false;
                    int used = Math.min(quantum, curr.burstTime);
                    System.out.printf("P%d runs for %d units.\n", curr.processId, used);
                    curr.burstTime -= used;
                    time += used;
                }
                curr = curr.next;
            } while (curr != start);
            if (allDone) break;
        }
        System.out.printf("Total time taken: %d units.\n", time);
    }
}