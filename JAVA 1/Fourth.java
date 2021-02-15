//Calculate the number & Percentage Of Lowercase
// Letters,Uppercase Letters, Digits And Other Special Characters In A String
import java.text.DecimalFormat;

public class Fourth {

    static void Percentagecalculation(String input) {
        int totalChar = input.length();
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int others = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCase++;
            }
            else if (Character.isLowerCase(ch)) {
                lowerCase++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else {
                others++;
            }
        }
        double upperCasePercentage = (upperCase * 100) / totalChar;
        double lowerCasePercentage = (lowerCase * 100) / totalChar;
        double digitsPercentage = (digits * 100) / totalChar;
        double otherPercentage = (others * 100) / totalChar;

        DecimalFormat format = new DecimalFormat("##.##");
        System.out.println("In '" + input + "' : ");
        System.out.println("Uppercase letters are "+ upperCase+" and percentage:" + format.format(upperCasePercentage) + "% ");
        System.out.println("Lowercase letters are " + lowerCase+" and percentage:"+ format.format(lowerCasePercentage) + "%");
        System.out.println("Digits Are " + digits+" and percentage:"+ format.format(digitsPercentage) + "%");
        System.out.println("Other Characters Are " + others+" and percentage:"+ format.format(otherPercentage) + "%");

    }
    public static void main(String[] args) {
        Percentagecalculation("How are you out of 10, does 110% good counts?");
    }

}
