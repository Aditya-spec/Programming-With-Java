//Create a custom exception that do not have any stack trace.
class Agenotvalidexception extends Exception{
    public Agenotvalidexception(String msg){
        super(msg);
    }
}
public class Thirteen {
    public static void main(String[] args) {
        int age=16;

        try {
            if (age < 18)
                throw new Agenotvalidexception(" your age is not valid");

            else
                System.out.println("proceed");
        }catch (Exception e){
            System.out.println("Exception occured " + e);
        }

        }

    }

