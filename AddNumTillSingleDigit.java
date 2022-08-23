import java.util.Scanner;

class AddNumTillSingleDigit {
	AddNumTillSingleDigit() {

	}

	public static void main(String[] args) {
		System.out.println("Enter number to convert:");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		if (n > 0 && n < 5000) {
			while (n > 0 || sum > 9) {
				if (n == 0) {
					n = sum;
					sum = 0;
				}
				sum = sum + n % 10;
				n = n / 10;
			}
			System.out.println(sum);
		} else {
			System.out.println("Invalid Input");
		}
	}
}
