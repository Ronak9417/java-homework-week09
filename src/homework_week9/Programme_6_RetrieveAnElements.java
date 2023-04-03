import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveAnElements {

    public static void main(String[] args) {


        Map<Integer, String> car = new HashMap();
        car.put(1, " Mercedes");
        car.put(2, "Jaguar");
        car.put(3, "BMW");
        car.put(4, "Audi");
        car.put(5, "Mazda");
        car.put(6, "Nissan");


        System.out.println(car);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();

        String value1 = car.get(a);
        System.out.println(value1);

    }
}




