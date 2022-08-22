import java.util.*;

class OnesComplement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Binary");
        int a = scn.nextInt();
        int num = a;
        String str = "";
        while (num > 0) {
            int temp = num % 10;
            str = "" + temp + str;
            num = num / 10;
        }
        String dum = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1')
                dum = dum + '0';
            else
                dum = dum + '1';
        }
        int b = dum.length() - 1;
        final double c = 2.0;
        double res = 0;
        System.out.println(dum);
        for (int i = 0; i < dum.length(); i++) {
            if (dum.charAt(i) == '1') {
                res = res + Math.pow(c, b);
                b--;
            } else {
                b--;
            }
        }
        System.out.println(res);
    }
}