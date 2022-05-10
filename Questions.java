import java.util.Scanner;

public class Questions extends Main {
    public static void sleepQuestions() {
        //asking user questions that helps app analyze sleeping habits
        //use switch statement
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("Do you usually drink caffeine before you sleep? Press 1 for yes, 2 for sometimes, 3 for no");
        int question1 = userInputScanner.nextInt();
        String question1String;
        switch (question1) {
            case 1:
                question1String = "Yes";
            case 2:
                question1String = "Sometimes";
            case 3:
                question1String = "No";


        }
        if (question1 == 1 || question1 == 2) {
            System.out.println("Try to avoid drinking caffeine before bed, it prevents you from sleeping");
        } else {
            System.out.println("Good job");
        }
        System.out.println("Do you use your phone before bed? Press 1 for yes, 2 for sometimes, 3 for no");
        int question2 = userInputScanner.nextInt();
        String question2String;
        switch (question2) {
            case 1:
                question2String = "yes";
            case 2:
                question2String = "sometimes";
            case 3:
                question2String = "no";


        }
        if (question2 == 1 || question2 == 2) {
            System.out.println("Don't use your phone before you sleep");
        } else {
            System.out.println("Good job");
        }
    }
}
