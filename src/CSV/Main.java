package CSV;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    /*
    NOTES:
    How to load data from a csv file and into an array.
    Remember an empty line in the csv file is not equal to null.
    If you have an empty line.
    You often want to make a class to import the data from the csv, and load the data into objects (like Fruit)
     */

    public static void main(String[] args) throws IOException {
ImportData importData = new ImportData();
List<Fruit> result = importData.fillListWithFruits();
        System.out.println(result); //Prints Fruit's toString method
        importData.printFruitList(); //Prints the fruitList by looping through each Fruit
        ExportDataToCsv exportDataToCsv = new ExportDataToCsv();

        exportDataToCsv.exportData("dette er en test");


    }
}
