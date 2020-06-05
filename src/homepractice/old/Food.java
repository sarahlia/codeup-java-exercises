package homepractice.old;

import homepractice.Item;

public class Food extends Item {

    public Food(String name, int quantity) {
        super(name, quantity);
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
        return this.name + "--quantity: " + this.quantity;
    }

}
