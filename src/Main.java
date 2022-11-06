import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*for each - traversing technique to iterate through the elements in an array/collection
                     less steps, more readable
                     less flexible
         */
          //String [] animals = {"dog", "cat", "hen", "cow"};

        ArrayList<String> animals = new ArrayList<>();

        animals.add("rats");
        animals.add("leeches");
        animals.add("horse");
        animals.add("donkey");
        animals.add("ducks");
        animals.add("wild horses");
        animals.add("Eagle");
        animals.add("Snake");
        animals.add("Boar");
        animals.add("crocodile");
        animals.add("hippos");
        animals.add("Warthog");
        animals.add("Lions");


          for(String i:animals){  //colon represents the word in - for every String index {in} array of animals
        System.out.println(i);
    }
}}