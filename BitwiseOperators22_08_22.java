import java.util.*;

class BitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input1");
        // if a=8;binary val=1000
        int a = sc.nextInt();
        System.out.println("input2");
        // if b=9,binary val=1001
        int b = sc.nextInt();
        int resAnd = a & b;// only 1&1=1
        // inclusive or
        int resOr = a | b;
        // Exclusive or
        int resXor = a ^ b;
        int resNot = ~a;
        System.out.println(resAnd);
        System.out.println(resOr);
        System.out.println(resXor);
        System.out.println(resNot);
    }
}
