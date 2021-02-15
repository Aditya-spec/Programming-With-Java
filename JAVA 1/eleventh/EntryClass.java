package eleventh;

public class EntryClass {
    public static void main(String[] args) {
        Bank b;
        b=new SBI();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
        b=new BOI();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
        b=new ICICI();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
    }
}
