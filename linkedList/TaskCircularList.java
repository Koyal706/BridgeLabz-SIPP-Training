class TaskCircularList {
    private static class Node {
        int id;
        String name;
        int priority;
        String dueDate; // for simplicity, store as string
        Node next;

        Node(int id, String name, int priority, String dueDate) {
            this.id = id;
            this.name = name;
            this.priority = priority;
            this.dueDate = dueDate;
        }
    }

    private Node head = null;
    private Node current = null; // pointer to current task

    /* Insert */
    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        Node newNode = new Node(id, name, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = newNode;
            current = head;
            return;
        }
        Node tail = head;
        while (tail.next != head) tail = tail.next;
        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    public void addAtEnd(int id, String name, int priority, String dueDate) {
        if (head == null) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }
        Node newNode = new Node(id, name, priority, dueDate);
        Node tail = head;
        while (tail.next != head) tail = tail.next;
        tail.next = newNode;
        newNode.next = head;
    }

    public void addAtPosition(int position, int id, String name, int priority, String dueDate) {
        if (head == null || position <= 0) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }
        Node curr = head;
        for (int i = 0; i < position - 1 && curr.next != head; i++) curr = curr.next;
        Node newNode = new Node(id, name, priority, dueDate);
        newNode.next = curr.next;
        curr.next = newNode;
    }

    /* Remove */
    public boolean removeById(int id) {
        if (head == null) return false;
        if (head.id == id && head.next == head) { // single node
            head = current = null;
            return true;
        }
        Node prev = null, curr = head;
        do {
            if (curr.id == id) {
                if (prev != null) prev.next = curr.next;
                if (curr == head) head = curr.next;
                // update tail if needed
                Node tail = head;
                while (tail.next != curr) tail = tail.next;
                tail.next = head;
                if (current == curr) current = curr.next;
                return true;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
        return false;
    }

    /* View current & move */
    public Node nextTask() {
        if (current == null) return null;
        Node temp = current;
        current = current.next;
        return temp;
    }

    /* Display all */
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks scheduled.");
            return;
        }
        Node curr = head;
        System.out.println("Tasks:");
        do {
            System.out.printf("ID:%d Name:%s Priority:%d Due:%s%n",
                    curr.id, curr.name, curr.priority, curr.dueDate);
            curr = curr.next;
        } while (curr != head);
    }

    /* Search by priority */
    public void searchByPriority(int desiredPriority) {
        if (head == null) return;
        Node curr = head;
        System.out.printf("Tasks with priority %d:%n", desiredPriority);
        do {
            if (curr.priority == desiredPriority) {
                System.out.printf("ID:%d Name:%s Due:%s%n", curr.id, curr.name, curr.dueDate);
            }
            curr = curr.next;
        } while (curr != head);
    }
}
