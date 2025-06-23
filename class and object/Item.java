class Item {
    int itemCode;
    String itemName;
    double price;

    void displayItemDetails(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: ₹" + price);
        System.out.println("Total Cost for " + quantity + " items: ₹" + (price * quantity));
    }
}

public class Main {
    public static void main(String[] args) {
        Item item = new Item();
        item.itemCode = 201;
        item.itemName = "Pen";
        item.price = 10;
        item.displayItemDetails(5);
    }
}
