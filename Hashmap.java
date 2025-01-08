import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>(); //Creation of HashMap
        hm.put("India", 10);                        //Adding elements in HashMap
        hm.put("China", 9);
        hm.put("Austria", 10);
        hm.put("Indonesia", 8);
        System.out.println(hm);
        if(hm.containsKey("India"))                 //Searching for keys in Hashmap
        {
            System.out.println("India is present in the hashmap");
        }
        if(hm.containsValue(10))                    //Searching via value
        {
            System.out.println("The hashmap has keys with value 10");
        }
        System.out.println("The value stored with the key named 'India' is "+ hm.get("India")); //Printing the value of a key
        hm.remove("Indonesia");                                                                 //Removing a key, value pair in hashmap
        for(Map.Entry<String,Integer> e:hm.entrySet())                                          //Iterating in HashMap
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
