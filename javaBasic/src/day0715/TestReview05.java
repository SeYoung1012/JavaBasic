package day0715;

import java.util.Scanner;

public class TestReview05 {

	public static void main(String[] args) {

		// 1. 숫자를 받는다
		Scanner scanner = new Scanner(System.in);
		

		// 2. 네자리 수인지 파악한다.
		for (int i = 1000; i < 10000; i++) {
			// 2. 네자리 수를두자리로 나눈다
			int temp = 0;
			int temp2 = 0;

			temp = i % 100;
			temp2 = i / 100;

			int result = temp + temp2;

			if (result * result == i) {
				System.out.printf("%d는 %d의 카프리카수 입니다\n", i, result);
			} 


		}

	}

}
