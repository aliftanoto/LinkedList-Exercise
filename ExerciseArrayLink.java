import java.util.ArrayList;
import java.util.LinkedList;

public class ExerciseArrayLink {
    public static void main(String[] args){
    ArrayList<String> names = new ArrayList<String>();
    names.add("Sam");
    names.add("Joe");
    names.add("Candice");
    names.add("Ligma");
    names.get(1);
    names.removeFirst();
    System.out.println(names);  


   
    LinkedList<String> name = new LinkedList<String>();
    name.add("Hai");
    name.add("Mai");
    name.add("Lai");
    name.add("Kai");
    name.removeFirst();
    name.get(1);

    System.out.println(name);
    }
}