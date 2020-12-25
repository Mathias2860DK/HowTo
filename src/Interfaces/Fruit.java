package Interfaces;

public class Fruit implements Comparable <Fruit> {

    /*
    Let's say we want to sort the fruit-objects by the price. So the lowest fruits appear first.
    This means we have to add a few Fruit objects (in this example in the Main-method) to an ArrayList.

     */
    String name;
    double price;
    int barcode;

    public Fruit(String name, double price, int barcode) {
        this.name = name;
        this.price = price;
        this.barcode = barcode;
    }

    public double getPrice() {
        return price;
    }
/*
public int compareTo(Object obj): It is used to compare the current object with the specified object. It returns

positive integer, if the current object is greater than the specified object.
negative integer, if the current object is less than the specified object.
zero, if the current object is equal to the specified object.
 */
    @Override
    public int compareTo(Fruit o) {
        return (int) (this.price - (o.getPrice()));
    }

    @Override
    public String toString() {
        return  name + "....." + price +" DKK" + "\n";
    }
}
