package day0701;
//사용자로부터 점수를 입력받아서

//90~ : A
//80~ :B
//70~ :C
//60~ D
//그 외 : F
//가 출력되는 프로그램을 작성하시오.

import java.util.Scanner;

//단 사용자가 잘못된 점수를 입력하면 올바른 점수를 입력할 때까지 
//다시 입력이 되도록 코드를 작성하시오.

//출력예시)
//사용자의 점수 : [##] 점
//최종 성적 : [B]

public class GradePrinter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("점수를 입력해주세요.");
		System.out.print("> ");
		int score = scanner.nextInt();
		
		// while 문 
		while (!( score >= 0 &&  score <=100 )) {
			System.out.println("잘못된 점수입니다.");
			System.out.println("0~100 사이의 점수를 입력해주세요.");
			System.out.print("> ");
			score = scanner.nextInt();
		}
		
		String result;
		
		if (score >= 90) {
			result = "A";
		} else if (score >=80) {
			result = "B";
		}else if (score >=70) {
			result = "C";
		}else if (score >=60) {
			result = "D";
		}else {
			result = "F";
		}
			
		
	
		System.out.printf("사용자 점수 : [%2d]점\n 최종성적 : [%s]\n", score ,result  );
		
		scanner.close();
		
	}
}
