//Find common elements between two arrays.
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Fifth {
    public static void main(String[] args) {
        int[] arr1 = new int[]{12,13,14,17,14,12,20};
        int[] arr2 = new int[]{12,15,16,17,18,14};

        System.out.println("array 1 elements");
        for(int i=0;i<arr1.length;i++)
            System.out.println( arr1[i]);
        System.out.println("array 2 elements");
        for(int i=0;i<arr2.length;i++)
            System.out.println( arr2[i]);


        Set<Integer> hs =new HashSet<>();
        for(int i=0;i<arr1.length;i++)
            hs.add(arr1[i]);

        /*Iterator<Integer> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/

        System.out.println("Common elements:");

        for(int i=0;i<arr2.length;i++)
           if(hs.contains(arr2[i]))
           {
               System.out.println(arr2[i]);
                hs.remove(arr2[i]);
           }


    }
}
