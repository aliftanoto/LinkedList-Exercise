// import java.util.ArrayList;
// import java.util.Iterator;
// public class IteratorTest {
//     public static void main(String[] args){
//         ArrayList<String> names = new ArrayList<String>();
//         names.add("Joe");
//         names.add("Mama");
//         names.add("Mia");
//         names.add("Sigma");
        
//         Iterator<String> it = names.iterator();

//         System.out.println(it.next());
//     }
// }


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        // Create a large list
        List<Integer> myList = new ArrayList<>();
        int listSize = 1000000; 
        for (int i = 0; i < listSize; i++) {
            myList.add(i);
        }

        long startTime = System.nanoTime();

        
        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            
            
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; 

        System.out.println("Time taken to iterate through the list using an iterator: " + duration + " milliseconds");
    }
}
