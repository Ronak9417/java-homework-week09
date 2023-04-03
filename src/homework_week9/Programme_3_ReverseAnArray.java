import java.util.Arrays;
import java.util.Collections;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ReverseAnArray {

    //  reverses the elements of the array
    static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
    public static void main(String[] args){
        // Main Method
        Integer [] arr = {10, 20, 30, 40, 50};
        System.out.println("Original array list : " + Arrays.toString(arr));
        System.out.println(" ");
        System.out.print("Reversed Array List : ");
        reverse(arr);
    }

}
