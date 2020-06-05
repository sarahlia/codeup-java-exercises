package homepractice;

public class Cleaner extends Item{

    protected double price;

    public Cleaner(String name, int quantity, double price) {
        super(name, quantity);
        this.price = price;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }

    public String toString() {
        return this.name + "--quantity: " + this.quantity + "--price:$" + this.price;
    }

    public static void main(String[] args) {
        Cleaner windex = new Cleaner("windex", 1, 4.99);
        System.out.println(windex);
    }
}
