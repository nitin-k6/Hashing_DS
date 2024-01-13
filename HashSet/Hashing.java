import java.util.HashSet;
import java.util.Iterator;
// import java.util.*;

public class Hashing{
    public static void main(String[] args){

        //Creation
        HashSet<Integer> set = new HashSet<>();
        //addition
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);  // allows unique value so this does not count;
        set.add(6);

        //Search -Contains
        if(set.contains(1)){
            System.out.println("It is here");
        }
        if(!set.contains(9)){
            System.err.println("It is not here");
        }


        //deletion 
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("It does not exist");
        }
        //Size
        System.out.println(set.size());

        //Print all elements
        System.out.println(set);

        Iterator it =  set.iterator();
        while(it.hasNext()){
            System.err.println(it.next());
        }
    }

}