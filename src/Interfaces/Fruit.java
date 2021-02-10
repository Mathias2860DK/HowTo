package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Fruit implements Comparable <Fruit> {

    /*
    Let's say we want to sort the fruit-objects by the price. So the lowest fruits appear first.
    This means we have to add a few Fruit objects (in this example in the Main-method) to an ArrayList.

     */
    String name;
    double price;
    int barcode;
public Fruit (){

}


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
        //return (int) (this.price - (o.getPrice())); //This will return an int. If the number is 2,5 or
        //2,6 -> 2 will be the compared number in both cases.
        return Double.compare(this.price,o.price); // 2,5 and 2,6 in this case will sort the list properly.
    }
public void printFruitList(List<Fruit> fruitList){
    for (Fruit fruit1: fruitList) {
        System.out.println(fruit1);

    }
}
   /* @Override
    public int compareTo(Fruit o) {
        //If you want sort the list alphabetically
        return this.name.compareTo(o.name);
    }*/


    @Override
    public String toString() {
        return  name + "....." + price +" DKK" + "\n";
    }
}
