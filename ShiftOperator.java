import java.util.*;

class ShiftOperator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input1");
        int a = scn.nextInt();
        System.out.println("Enter input2");
        int b = scn.nextInt();
        // Signed Right Shift(>>)
        int resRight = a >> b;
        // Signed Left Shift (<<)
        int resLeft = a << b;
        System.out.println("Leftwise Shift: " + resLeft);
        System.out.println("Right Shift: " + resRight);
    }
}