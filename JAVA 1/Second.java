//Write a program to find the number of
// occurrences of the duplicate words in a string and print them ?
import java.util.Locale;

public class Second {
    public static void main(String[] args) {
        String old= "big black bug bit a big black dog on his big black nose";

        String[] characters=old.split(" ");
        old=old.toLowerCase();

        for (int i=0;i<characters.length;i++){
            int count=1;
            for(int j=i+1;j<characters.length;j++){
                if(characters[i].equals(characters[j])) {
                    count++;
                    characters[j]="0";
                }
            }
            if(count>1 && characters[i]!="0")
            System.out.println("count of " + characters[i] + "=" + count);
        }

    }
}
