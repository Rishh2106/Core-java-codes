import java.util.HashSet;
import java.util.Iterator;
public class hashset {
    public static void main(String args[])
    {
        HashSet<Integer> hs=new HashSet<>(); //Creating HashSet
        hs.add(1);                            //Adding elements
        hs.add(2);
        hs.add(4);
        hs.add(3);
        System.out.println(hs);
        if(hs.contains(2))                      //Searching
        {
            System.out.println("HashSet contains the element 2"); 
        }
        hs.remove(2);                           //Removing a element

        Iterator it=hs.iterator();                 //Iterating on the HashSet (It isn't neccessary that the order of insertion will be the order of output)
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
}
