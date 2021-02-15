//There is an array with every element repeated twice except one. Find that element
public class Sixth {
    public static void main(String[] args) {
        int[] arr={2,4,1,5,7,8,8,7,5,2,1};
        int res=0;
        for (int i=0;i<arr.length;i++){
            res= res ^ arr[i];
        }
        System.out.println("Odd Occuring Element is " + res);
    }
}
