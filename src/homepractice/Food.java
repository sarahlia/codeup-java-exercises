package homepractice;

import homepractice.Item;

public class Food extends Item {

    protected double price;

    public Food(String name, int quantity, double price) {
        super(name, quantity);
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return this.name + "--quantity: " + this.quantity + "--price:$" + this.price;
    }

    public static void main(String[] args) {
        Food rice = new Food("rice", 1, 19.99);
        System.out.println(rice);
    }
}
