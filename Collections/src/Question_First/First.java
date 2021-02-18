//Write Java code to define List .
// Insert 5 floating point numbers in List,
// and using an iterator, find the sum of the numbers in List.

package Question_First;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class First {
    public static void main(String[] args) {
        List<Float> list= new ArrayList<Float>();
        list.add(4.59F);
        list.add(8.68F);
        list.add(1.98F);
        list.add(6.23F);
        list.add(4.90F);
        Iterator<Float> itr = list.iterator();
        Float sum= 0F;
        while(itr.hasNext()){

            Float f = itr.next();
            sum +=f;
        }
System.out.println("Sum is:"+ sum);
    }
}
