package day0630;
//숙제 3.

//사용자로부터 번호, 이름, 국어, 영어, 수학 점수를 입력 받아서
//예쁘게 출력하시오.

import java.util.Scanner;

//단 모든 입력이 끝난 후에 모든 점수가 올바른 범위일 때에만
// 출력이 진행 되고
//만약 잘못된 점수가 존재할 경우에는
//"잘못된 점수가 있어서 결과를 출력할 수 없습니다."
//가 출력되게 코드를 작성하시오.

public class GradeBook2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("번호를 입력해주세요.");
		System.out.print("> ");
		int id = scanner.nextInt();
		
		System.out.println("이름을 입력해주세요. ");
		System.out.print("> ");
		scanner.nextLine();
		String name = scanner.nextLine();
		
		System.out.println("국어점수를 입력해주세요. ");
		System.out.print("> ");
		int korean = scanner.nextInt();
		
	
		
		System.out.println("영어점수를 입력해주세요. ");
		System.out.print("> ");
		int english = scanner.nextInt();
		
		
		
		System.out.println("수학점수를 입력해주세요. ");
		System.out.print("> ");
		int math = scanner.nextInt();
		
		
		
		if ((korean <= 0 || korean >= 100) && (english <= 0 || english>= 100) && (math <= 0 || math>= 100)) {
			
		} else {
        	System.out.println("잘못된 점수가 있어서 결과를 출력할 수 없습니다.");
        }
		
		
		int sum = korean + english + math;
		double average = (double) sum / 3;
		
		System.out.println("*===============================*");
		System.out.printf("번호 : %2d번 이름: %s\n", id, name);
		System.out.printf("국어:%3d점 영어:%3d점  수학:%3d점\n", korean, english, math);
		System.out.println("*===============================*");
		System.out.printf("총점 : %03d점 평균: %06.2f점\n ",sum, average );
		
		
		
		
		scanner.close();
		

	}

}
