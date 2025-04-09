package course;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		if (ePrimo(n)) {
			System.out.println("É primo");
		} else {
			System.out.println("Não é primo");
		}

		sc.close();
	}

	public static boolean ePrimo(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return n > 1;
	}
}
