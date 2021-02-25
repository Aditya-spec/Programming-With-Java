//WAP showing try, multi-catch and finally blocks.
public class Sixth {

    public static void main(String[] args) {

        try{
            int a[]=new int[5];
           // a[5]=30/0;
            for (int i=0;i<6;i++){
                a[i]=i;
            }
        }

        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }

        finally {
             System.out.println("finally block is always executed");
        }



    }
}