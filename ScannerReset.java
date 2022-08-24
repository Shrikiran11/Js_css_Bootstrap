import java.util.*;

class ScannerReset {
    public static void main(String[] argv)
            throws Exception {
        String s = "Hello-My-results-came-out-yesterday";
        Scanner scanner = new Scanner(s);
        System.out.println("Scanner String:\n"
                + scanner.nextLine());
        scanner.useLocale(Locale.US);
        scanner.useRadix(30);
        scanner.useDelimiter("-");
        System.out.println("\nBefore Reset");
        System.out.println("Radix: " + scanner.radix());
        System.out.println("Locale: " + scanner.locale());
        System.out.println("delimiter: " + scanner.delimiter());
        scanner.reset();
        System.out.println("\nAfter Reset:\n");
        System.out.println("Radix: " + scanner.radix());
        System.out.println("Locale: " + scanner.locale());
        System.out.println("delimiter:" + scanner.delimiter());
        scanner.close();
    }
}