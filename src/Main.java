import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*for each - traversing technique to iterate through the elements in an array/collection
                     less steps, more readable
                     less flexible
         */
          //String [] animals = {"dog", "cat", "hen", "cow"};

        ArrayList<String> animals = new ArrayList<>();

        animals.add("cows");
        animals.add("cats");
        animals.add("dogs");
        animals.add("hen");

          for(String i:animals){  //colon represents the word in - for every String index {in} array of animals
        System.out.println(i);
    }
}}