import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not
 */
public class Programme_7_AnArrayListIsEmptyOrNot {

    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<String> number = new ArrayList<>();
        System.out.println("Created an ArrayList: " + number);
        // checks if the ArrayList has any element
        boolean result = number.isEmpty(); // true
        System.out.println("Is the an ArrayList empty? " + true);
        // add some elements to the ArrayList
        number.add("One");
        number.add("Two");
        System.out.println("Created an ArrayList: " + number);
        // checks if the ArrayList is empty
        System.out.println("Is the an ArrayList empty? " + false);

    }
}