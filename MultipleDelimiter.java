import java.util.*;

class MultipleDelimiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner("my dear-boodham streaming -in-amazon");

        scan.useDelimiter("-");

        while (scan.hasNext()) {
            String str = scan.next();
            if (str.contains(" ")) {
                String[] arr = str.split(" ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
            } else {
                System.out.println(scan.next());
            }

        }
        scan.close();
    }
}