import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String name, double price, int quantity) {
        this.itemName = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotal() {
        return price * quantity;
    }

    void displayItem() {
        System.out.println(itemName + " - ₹" + price + " x " + quantity + " = ₹" + getTotal());
    }
}

class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    void addItem(CartItem item) {
        items.add(item);
    }

    void removeItem(String name) {
        items.removeIf(item -> item.itemName.equalsIgnoreCase(name));
    }

    void displayTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            item.displayItem();
            total += item.getTotal();
        }
        System.out.println("Total Cost: ₹" + total);
    }
}

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("Laptop", 40000, 1));
        cart.addItem(new CartItem("Mouse", 500, 2));
        cart.removeItem("Mouse");
        cart.displayTotalCost();
    }
}
