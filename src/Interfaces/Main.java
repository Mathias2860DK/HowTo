package Interfaces;

import Exeptions.NotEnoughMoneyException;

import java.util.*;

public class Main {
    /*
    An interfaces is like a contract. If a class implements a certian interfaces it must have the same methods as
    the interface. Java also have its own built in interfaces such as comparable. Which is shown in the example
    i give in this package.
     */


    public static void main(String[] args) {
        Fruit fruit = new Fruit("Apple", 2.5, 1159);
        Fruit fruit1 = new Fruit("Mango", 12, 1603);
        Fruit fruit2 = new Fruit("Pear", 2.5, 1148);
        Fruit fruit3 = new Fruit();


        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(fruit);
        fruitList.add(fruit2);
        fruitList.add(fruit1);
        System.out.println("Before the ArrayList is sorted: " + "\n" + fruitList);
        Collections.sort(fruitList); // sorts the list by the price.
        System.out.println("After the ArrayList is sorted: " + "\n" + fruitList);
        System.out.println(fruitList.indexOf(fruit1));
        fruit3.printFruitList(fruitList);


    }
}
