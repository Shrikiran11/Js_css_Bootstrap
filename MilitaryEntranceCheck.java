import java.util.*;

class MilitaryEntranceCheck {
    public static void main(String args[]) {
        System.out.println("Enter your age:");
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();
        System.out.println("Enter your height:");
        int h = scn.nextInt();
        System.out.println("Enter your weight:");
        int w = scn.nextInt();
        int bmi = w / h;
        String healthCheck = bmi < 28 ? "qualify" : "disqualified";
        String ageLimit = age < 35 ? "ageLimitPassed" : "ageLimitExceeded";
        System.out.println("ageCheck: " + ageLimit + " healthCheck: " + healthCheck);
    }
}