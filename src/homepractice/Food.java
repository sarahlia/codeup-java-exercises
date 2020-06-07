package homepractice;

import java.util.ArrayList;

public class Food extends Item {

    protected ArrayList<Double> prices;

    public Food(String name, int quantity) {
        super(name, quantity);
        this.prices = new ArrayList<>();
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

    public void addPrice(double price) {
        this.prices.add(price);
    }

    public double getPrice() {
        double aPrice = 0;
        for (double price: this.prices) {
            aPrice = price;
        }
        return aPrice;
    }

    public double getTotalPrice() {
        double aPrice = 0;
        for (double price: this.prices) {
            aPrice = aPrice + price;
        }
        return aPrice;
    }

    public String toString() {
        return this.name + "--quantity: " + this.quantity + "--price:$" + this.prices;
    }

    public static void main(String[] args) {
//        Food rice = new Food("rice", 1, 19.99);
//        System.out.println(rice);
//        System.out.println(rice.getName());

    }
}
