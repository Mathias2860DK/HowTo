package CSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*
NOTES:
The BufferedReader has a couple of methods to choose from. One of the important methods is the readLine()
It simply reads a line (ex from your csv) - If you have a headline on your csv you can call the readLine()
before going into your while loop. While loop is almost always the best loop when working with readLine
because you often don't know the length of the csv. And it's more flexible if you wanted to add more lines
to the csv.
 */

public class ImportData {

    List<Fruit> fruitList = new ArrayList<>();

    public List<Fruit> fillListWithFruits(){
        String filePath = "src/CSV/Fruit.csv";
        String splitCsvBy = ",";

        try {
            //BufferedReader reads text from input-stream
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line = "";
            line = bufferedReader.readLine(); //Reads the first line, without doing anything with it.
            while ((line = bufferedReader.readLine()) != null){
                String [] splitArray = line.split(splitCsvBy); //String array to access the values and them insert the values
                //to the object. Maybe you have to convert them to the proper type.
                Fruit fruit = new Fruit(splitArray[0],Double.parseDouble(splitArray[1]),Integer.parseInt(splitArray[2]));
                fruitList.add(fruit);
            }

        } catch (FileNotFoundException e) {
            System.out.println("The file was not found ");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(); //TODO: print why the IOException occurred.
            e.printStackTrace();
        }

        return fruitList;
    }
public void printFruitList(){
    for (Fruit fruit: fruitList) {
        System.out.print(fruit);
    }
}
}
