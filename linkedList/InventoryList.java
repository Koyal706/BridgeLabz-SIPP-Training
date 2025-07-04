class InventoryList {
    private static class Node {
        String itemName;
        int itemId;
        int quantity;
        double price;
        Node next;

        Node(String itemName, int itemId, int quantity, double price) {
            this.itemName = itemName;
            this.itemId = itemId;
            this.quantity = quantity;
            this.price = price;
        }
    }

    private Node head;

    public void addAtBeginning(String name, int id, int qty, double price) {
        Node newNode = new Node(name, id, qty, price);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(String name, int id, int qty, double price) {
        Node newNode = new Node(name, id, qty, price);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public void addAtPosition(int pos, String name, int id, int qty, double price) {
        if (pos <= 0 || head == null) {
            addAtBeginning(name, id, qty, price);
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(name, id, qty, price);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public boolean removeById(int id) {
        if (head == null) return false;
        if (head.itemId == id) {
            head = head.next;
            return true;
        }
        Node prev = head, curr = head.next;
        while (curr != null) {
            if (curr.itemId == id) {
                prev.next = curr.next;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }

    public boolean updateQuantity(int id, int newQty) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void searchByIdOrName(String keyword) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (String.valueOf(temp.itemId).equals(keyword) || temp.itemName.equalsIgnoreCase(keyword)) {
                System.out.printf("Item: %s | ID: %d | Qty: %d | Price: %.2f\n",
                        temp.itemName, temp.itemId, temp.quantity, temp.price);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("Item not found.");
    }

    public void displayInventory() {
        Node temp = head;
        System.out.println("Inventory List:");
        while (temp != null) {
            System.out.printf("%s | ID:%d | Qty:%d | Price:%.2f\n",
                    temp.itemName, temp.itemId, temp.quantity, temp.price);
            temp = temp.next;
        }
    }

    public void calculateTotalValue() {
        double total = 0;
        Node temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.printf("Total Inventory Value: %.2f\n", total);
    }

    public void sortBy(String field, boolean ascending) {
        if (head == null || head.next == null) return;
        head = mergeSort(head, field, ascending);
    }

    private Node mergeSort(Node head, String field, boolean ascending) {
        if (head == null || head.next == null) return head;
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(head, field, ascending);
        Node right = mergeSort(nextOfMiddle, field, ascending);

        return sortedMerge(left, right, field, ascending);
    }

    private Node sortedMerge(Node a, Node b, String field, boolean ascending) {
        if (a == null) return b;
        if (b == null) return a;

        boolean compare;
        if (field.equalsIgnoreCase("name")) {
            compare = ascending ? a.itemName.compareTo(b.itemName) <= 0 : a.itemName.compareTo(b.itemName) > 0;
        } else {
            compare = ascending ? a.price <= b.price : a.price > b.price;
        }

        Node result;
        if (compare) {
            result = a;
            result.next = sortedMerge(a.next, b, field, ascending);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, field, ascending);
        }
        return result;
    }

    private Node getMiddle(Node head) {
        if (head == null) return head;
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}