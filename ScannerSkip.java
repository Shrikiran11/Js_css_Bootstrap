import java.util.*;

class ScannerSkip {
    public static void main(String args[]) {
        Scanner scan = new Scanner("Hello iam also a hero but only in my dreams");
        scan.skip("Hello iam also a hero ");
        System.out.println("Left String: " + scan.nextLine());
        scan.close();
    }
}