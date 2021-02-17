//WAP to convert seconds into days, hours, minutes and seconds.

public class Seventh
{

    static void ConvertSectoDay(int n)
    {
        int day = n / (24 * 3600);

        n = n % (24 * 3600);
        int hour = n / 3600;

        n %= 3600;
        int minutes = n / 60 ;

        n %= 60;
        int seconds = n;

        System.out.println( day + " " + "days " + hour
                + " " + "hours " + minutes + " "
                + "minutes " + seconds + " "
                + "seconds ");
    }


    public static void main (String[] args)
    {

        int n = 6353470;
        ConvertSectoDay(n);

    }
}
