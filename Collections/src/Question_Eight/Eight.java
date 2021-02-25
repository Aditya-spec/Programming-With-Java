package Question_Eight;

import java.text.SimpleDateFormat;
import java.util.Date;



    public class Eight {

        public static void main(String[] args) {
            Date today = new Date();
            System.out.println("Today is : " + today);
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
            String date = formatter.format(today);
            System.out.println("Today in dd-MMMM-yyyy format : " + date);

        }
    }


