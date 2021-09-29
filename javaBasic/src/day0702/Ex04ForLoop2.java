package day0702;
//	1.	1부터 6까지 출력하시오
//	2.	17부터 12까지 출력하시오
//	3.	71부터 83까지 모든 짝수를 출력하시오.
//	4.	사용자로부터 숫자를 하나 입력 받아서
//		1부터 그 수까지 출력하시오
//	5.	사용자로부터 숫자를 두 개 입력 받아서
// 		더 큰 수부터 더 작은수까지 출력하시오.
//	6. 사용자로부터 숫자를 하나 입력받아서
//		1부터 그 수까지의 합을 출력하시오.
//	7.	사용자로부터 숫자를 하나 입력받아서
// 		1부터 그 수까지의 곱을 출력하시오

import java.util.Scanner;

public class Ex04ForLoop2 {

	public static void main(String[] args) {
		final String LINE = "\n=================================\n";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1번");
		for (int i = 1; i <= 6; i++) {
			System.out.println(i);
		}
		System.out.println(LINE);

		System.out.println("2번");
		int start = 17;
		int end = 12;
		for (int i = start; i >=end; i--) {
			System.out.println(i);
		}
		System.out.println(LINE);
//	내가 한것.
//for (int i = 17; i >=12; i--) {
//			System.out.println(i);
//		}
		
		System.out.println("3번");
		start = 71;
		end = 83;
		
		for (int i = start; i <=end; i++) {
			if(i%2 ==0) {
				System.out.println(i);
			}
		}
		System.out.println(LINE);
		
		System.out.println("4번");
		
		System.out.println("숫자를 입력하세요.");
		System.out.print(">  ");
		
		int userNumber = scanner.nextInt();
		
		start = 1;
		end = userNumber;
		for(int i = start; i <=end; i++) {
			System.out.println(i);
		}
		System.out.println(LINE);
		
		System.out.println("5번");
		
		System.out.println("1번숫자.");
		System.out.print(">  ");
		int number1 = scanner.nextInt();
		
		System.out.println("2번숫자.");
		System.out.print(">  ");
		int number2 = scanner.nextInt();
		
		if(number1 > number2) {
			start = number1;
			end = number2;
		} else {
			start = number2;
			end = number1;
		}
		for(int i = start; i >= end; i--) {
			System.out.println(i);
		}
		System.out.println(LINE);
		
		
		System.out.println("6번");
		
		System.out.println("숫자를 입력해주세요.");
		System.out.print("> ");
		userNumber = scanner.nextInt();
		
		//1부터 합을 저장할 int 변수
		int sum = 0;
		
		start  =1;
		end = userNumber;
		for (int i = start; i <=end; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합 : %d\n" , userNumber, sum);
		
		System.out.println(LINE);
		
		System.out.println("7번");
		System.out.println("숫자");
		System.out.print("> ");
		userNumber = scanner.nextInt();
		
		//1부터 userNumber까지의 곱을 저장할 변수
		int sigma =1;
		
		start = 1;
		end = userNumber;
		
		for (int i = start; i <=end; i++) {
			sigma*= i;
			
		}
		System.out.printf("1부터 %d까지의 곱 : %d\n" , userNumber, sigma);

		System.out.println(LINE);
		
		scanner.close();
		
	}

}
