//Write a program to display times in different country format.
package Question_Ninth;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Ninth {

    public static void main(String[] args) {

        Date today = new Date();

        DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:SS z");

        TimeZone tz1= TimeZone.getTimeZone("Asia/Kolkata");
        TimeZone tz2= TimeZone.getTimeZone("America/Los_Angeles");

        df.setTimeZone(tz1);
        String IST = df.format(today);
        System.out.println("Date in Indian Timezone (IST) : " + IST);

        df.setTimeZone(tz2);
        String PST = df.format(today);
        System.out.println("Date in PST Timezone : " + PST);
    }
}


