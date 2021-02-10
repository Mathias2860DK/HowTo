package CSV;

public class Fruit {
    String name;
    double price;
    int barcode;


    public Fruit(String name, double price, int barcode){
        this.name = name;
        this.barcode = barcode;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ".... " + price + " kr." + "\n"; //barcode is not printed, because it's not important.
        //Maybe you want to access the product via the barcode
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
