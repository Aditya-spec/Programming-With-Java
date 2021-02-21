//WAP to convert seconds into days, hours, minutes and seconds.

public class Seventh
{

    static void Convert(int n)
    {
        int cal_day=24*3600;
        int day = n / cal_day;

        n = n % cal_day;
        int hour = n / 3600;

        n =n% 3600;
        int minutes = n / 60 ;

        n =n% 60;
        int seconds = n;

        System.out.println( day + " " + "days " + hour
                                                    + " " + "hours " + minutes + " "
                                                    + "minutes " + seconds + " "
                                                    + "seconds ");
                                        }


    public static void main (String[] args)
    {

        int n = 5765446;
        Convert(n);

    }
}
