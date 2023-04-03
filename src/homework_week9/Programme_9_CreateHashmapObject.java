import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

public class Programme_9_CreateHashmapObject {

    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Amar", 20);
        people.put("Akbar", 30);
        people.put("Anthony", 40);
        people.put("Danny", 50);
        people.put("Gabber", 60);
        people.put("Chachi", 420);

        Iterator<Map.Entry<String, Integer>> it = people.entrySet().iterator();

        while (it.hasNext()) System.out.println(it.next());

//        for (String i : people.keySet()) {
//            System.out.println("Name:  " + i + "     Age:  " + people.get(i));//
//        }
    }
}
