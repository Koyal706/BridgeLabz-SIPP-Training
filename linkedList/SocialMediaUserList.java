class SocialMediaUserList {
    static class UserNode {
        int userId;
        String name;
        int age;
        int[] friendIds;
        UserNode next;

        UserNode(int userId, String name, int age, int[] friendIds) {
            this.userId = userId;
            this.name = name;
            this.age = age;
            this.friendIds = friendIds;
        }
    }

    private UserNode head;

    public void addUser(int id, String name, int age, int[] friends) {
        UserNode newNode = new UserNode(id, name, age, friends);
        newNode.next = head;
        head = newNode;
    }

    public void displayFriends(int userId) {
        UserNode curr = head;
        while (curr != null) {
            if (curr.userId == userId) {
                System.out.println("Friends of " + curr.name + ":");
                for (int id : curr.friendIds)
                    System.out.print(id + " ");
                System.out.println();
                return;
            }
            curr = curr.next;
        }
        System.out.println("User not found.");
    }

    public void searchUser(String keyword) {
        UserNode curr = head;
        while (curr != null) {
            if (curr.name.equalsIgnoreCase(keyword) || String.valueOf(curr.userId).equals(keyword)) {
                System.out.printf("User: %s (ID: %d, Age: %d)\n", curr.name, curr.userId, curr.age);
                return;
            }
            curr = curr.next;
        }
        System.out.println("User not found.");
    }

    public void mutualFriends(int user1Id, int user2Id) {
        UserNode u1 = null, u2 = null;
        for (UserNode curr = head; curr != null; curr = curr.next) {
            if (curr.userId == user1Id) u1 = curr;
            if (curr.userId == user2Id) u2 = curr;
        }
        if (u1 == null || u2 == null) {
            System.out.println("One or both users not found.");
            return;
        }
        System.out.print("Mutual Friends: ");
        for (int id1 : u1.friendIds) {
            for (int id2 : u2.friendIds) {
                if (id1 == id2) System.out.print(id1 + " ");
            }
        }
        System.out.println();
    }

    public void countFriendsForEach() {
        UserNode curr = head;
        while (curr != null) {
            System.out.printf("%s has %d friends.\n", curr.name, curr.friendIds.length);
            curr = curr.next;
        }
    }
}

// 8. Undo/Redo Functionality (Doubly Linked List)
class TextEditorHistory {
    static class Node {
        String text;
        Node prev, next;

        Node(String text) {
            this.text = text;
        }
    }

    private Node current;
    private int size = 0;
    private final int LIMIT = 10;

    public void type(String newText) {
        Node newNode = new Node(newText);
        if (current != null) {
            newNode.prev = current;
            current.next = newNode;
        }
        current = newNode;
        size++;
        if (size > LIMIT) {
            // Trim oldest state
            Node temp = current;
            while (temp.prev != null && size > LIMIT) {
                temp = temp.prev;
                size--;
            }
            temp.prev = null;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No more undo.");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("No more redo.");
        }
    }

    public void displayCurrent() {
        if (current != null)
            System.out.println("Current Text: " + current.text);
        else
            System.out.println("No content.");
    }
}

// 9. Online Ticket Reservation System (Circular Linked List)
class TicketReservationSystem {
    static class TicketNode {
        int ticketId;
        String customerName, movieName;
        int seatNumber;
        String bookingTime;
        TicketNode next;

        TicketNode(int id, String customer, String movie, int seat, String time) {
            ticketId = id;
            customerName = customer;
            movieName = movie;
            seatNumber = seat;
            bookingTime = time;
        }
    }

    private TicketNode head = null;

    public void bookTicket(int id, String customer, String movie, int seat, String time) {
        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        TicketNode temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }

    public boolean cancelTicket(int id) {
        if (head == null) return false;
        TicketNode curr = head, prev = null;
        do {
            if (curr.ticketId == id) {
                if (prev != null) prev.next = curr.next;
                else {
                    TicketNode tail = head;
                    while (tail.next != head) tail = tail.next;
                    head = head.next;
                    tail.next = head;
                }
                return true;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
        return false;
    }

    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        TicketNode curr = head;
        do {
            System.out.printf("Ticket #%d | %s | %s | Seat: %d | Time: %s\n",
                    curr.ticketId, curr.customerName, curr.movieName,
                    curr.seatNumber, curr.bookingTime);
            curr = curr.next;
        } while (curr != head);
    }

    public void searchTicket(String keyword) {
        if (head == null) return;
        TicketNode curr = head;
        do {
            if (curr.customerName.equalsIgnoreCase(keyword) || curr.movieName.equalsIgnoreCase(keyword)) {
                System.out.printf("Ticket #%d | %s | %s | Seat: %d | Time: %s\n",
                        curr.ticketId, curr.customerName, curr.movieName,
                        curr.seatNumber, curr.bookingTime);
            }
            curr = curr.next;
        } while (curr != head);
    }

    public int countTickets() {
        if (head == null) return 0;
        int count = 0;
        TicketNode curr = head;
        do {
            count++;
            curr = curr.next;
        } while (curr != head);
        return count;
    }
}
