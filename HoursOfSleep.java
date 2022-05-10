
import java.util.Scanner;


 public class HoursOfSleep extends Main {
     public static void sleepHours() {
         Scanner userInputScanner = new Scanner(System.in);
         //array that takes amount of sleep user got for each night
         int[] sleepHours = new int[7]; //creating an array that will take 7 values
         System.out.println("Enter the hours of sleep you got each night for the past week: ");

         for (int i = 0; i < sleepHours.length; i++) {
             sleepHours[i] = userInputScanner.nextInt();

         }


         //calculating total hours of sleep for the week
         int sum = 0;

         for (int i = 0; i < sleepHours.length; i++) {
             sum += sleepHours[i];
         }
         System.out.println("Total hours of sleep during the week: " + sum);


         //calculating average hours of sleep for the week
         int avgHours = sum / 7;
         System.out.println("Average hours of sleep you got per night: " + avgHours);

         //if then statement
         if (avgHours < 50) {
             System.out.println("You should get more sleep");
         } else {
             System.out.println("Good job! You get a good amount of sleep");
         }
     }
 }






