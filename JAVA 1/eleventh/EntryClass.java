package eleventh;

public class EntryClass {
    public static void main(String[] args) {
        Bank b;
        b=new SBI();
        b.getDetails("SBI");
        b=new BOI();
       b.getDetails("BOI");
        b=new ICICI();
       b.getDetails("ICICI");
    }
}

