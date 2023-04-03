import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_NewArrayList {

    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();

        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Grapes");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Watermelon");

        for (String iLikeFruit : fruit) {

            System.out.println(iLikeFruit);

        }
    }
}
