package day0713;

import java.util.Scanner;

public class Aa {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		boolean cc = true;

		System.out.println("숫자를 입력하세요.");
		System.out.print(">  ");

		int[] arr = new int[5];
		int k = 0;
		int num = scanner.nextInt();
		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				cc = false;
			}
		}
		if (cc) {
			System.out.printf("%d는 소수 입니다.\n", num);
		}

		else {
			System.out.printf("%d는 소수가 아닙니다.\n", num);

		}

		int inin = 0;
		int temp = num;

		while (temp > 0) {
			temp /= 10;
			inin++;
		}

		System.out.println("자릿수는" + inin + "자리 입니다.");

		if (inin == 4) {

			while (num > 0) {
				arr[k] = num % 10;
				num /= 10;
				k++;
			}
			System.out.printf("일의자리 %d\n", arr[0]);
			System.out.printf("십의자리 %d\n", arr[1]);
			System.out.printf("백의자리 %d\n", arr[2]);
			System.out.printf("천의자리 %d\n", arr[3]);
		
			

		}

	}

}