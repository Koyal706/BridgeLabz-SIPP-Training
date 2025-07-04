class StudentRecordList {
    private static class Node {
        int rollNumber;
        String name;
        int age;
        char grade;
        Node next;

        Node(int rollNumber, String name, int age, char grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;
        }
    }

    private Node head;

    /* Insert Operations */
    public void addAtBeginning(int roll, String name, int age, char grade) {
        Node newNode = new Node(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(int roll, String name, int age, char grade) {
        Node newNode = new Node(roll, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) curr = curr.next;
        curr.next = newNode;
    }

    public void addAtPosition(int position, int roll, String name, int age, char grade) {
        if (position <= 0 || head == null) {
            addAtBeginning(roll, name, age, grade);
            return;
        }
        Node curr = head;
        for (int i = 0; i < position - 1 && curr.next != null; i++) {
            curr = curr.next;
        }
        Node newNode = new Node(roll, name, age, grade);
        newNode.next = curr.next;
        curr.next = newNode;
    }

    /* Delete */
    public boolean deleteByRoll(int roll) {
        if (head == null) return false;
        if (head.rollNumber == roll) {
            head = head.next;
            return true;
        }
        Node prev = head;
        Node curr = head.next;
        while (curr != null && curr.rollNumber != roll) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) return false; // not found
        prev.next = curr.next;
        return true;
    }

    /* Search */
    public Node search(int roll) {
        Node curr = head;
        while (curr != null) {
            if (curr.rollNumber == roll) return curr;
            curr = curr.next;
        }
        return null;
    }

    /* Update */
    public boolean updateGrade(int roll, char newGrade) {
        Node node = search(roll);
        if (node == null) return false;
        node.grade = newGrade;
        return true;
    }

    /* Display */
    public void display() {
        Node curr = head;
        System.out.println("Student Records:");
        while (curr != null) {
            System.out.printf("Roll: %d, Name: %s, Age: %d, Grade: %c%n",
                    curr.rollNumber, curr.name, curr.age, curr.grade);
            curr = curr.next;
        }
    }
}