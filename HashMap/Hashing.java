import java.util.HashMap;
import java.util.Map;
public class Hashing {
    public static void main(String[] args){
   HashMap <String, Integer> map = new HashMap<>(); //Creation
    
   map.put("India", 200);
   map.put("China", 300);
   map.put("America", 100); 

   System.out.println(map);
   map.put("China", 250);
      System.out.println(map);
 
       //Search
       if(map.containsKey("India")){
        System.out.println("Key exists");
       }
       else{
        System.out.println("Key does not exists");
       }

    System.out.println(map.get("India")); // it will value 200 if key didn't exist it would be null
    System.out.println(map.get("Japan"));  // null

    //Iteration
    for (Map.Entry<String, Integer> e: map.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
    }
    

    //Removing element

    map.remove("China");
    System.out.println(map);

    }
}
