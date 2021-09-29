package day0715;

import java.util.Scanner;

public class TestReview03 {

	public static void main(String[] args) {

		// 1. 숫자를 받는다
		Scanner scanner = new Scanner(System.in);
		System.out.println("네 자리 숫자를 입력하세요.");
		System.out.print("> ");
		//2.  number에 숫자를 준다.
		int number = scanner.nextInt();

		// 3. 네자리 수의 최소값과 최대값을 설정하고 맞는 지 확인한다.
		if (number >= 1000 && number <= 9999) {
			// 2. 네자리 수를두자리로 나눈다
			int temp1 = 0;
			int temp2 = 0;

			temp1 = number % 100;
			temp2 = number / 100;

			int result = temp1 + temp2;

			if (result * result == number) {
				System.out.printf("%d는 네 자리 카프리카수 입니다\n", number);
			} else {
				System.out.printf("%d는 카프리카수 가 아닙니다\n", number);
			}
			//4. 네 자리 숫자를 넘어갔을 때 네 자리 수가 아니라고 출력한다. 
		} else {
			System.out.println("네 자리 수가 아닙니다.");
		}

	}
}