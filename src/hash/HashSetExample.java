package hash;

import java.util.HashSet;

/*
A HashSet is a collection of items where every item is unique, and it is found in the java.util package:

 */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet <String> cars = new HashSet<String>();
        cars.add("BMW");
        cars.add("Skoda");
        cars.add("Audi");
        System.out.println(cars);
        System.out.println(cars.contains("BMW")); //Does the hashSet contains BMW?

        for (String i: cars) {
            System.out.println(i);
        }

        //hashSet with Integer
        HashSet <Integer> numbers = new HashSet<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);

        for (int i = 0; i < 10; i++) {
            if (numbers.contains(i)){
                System.out.println(i + " is in the HashSet");
            } else {
                System.out.println(i + " is not in the HashSet");
            }
        }
    }
}
