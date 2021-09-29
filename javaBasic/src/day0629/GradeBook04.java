package day0629;
//사용자로부터
//번호, 이름, 국어점수, 영어 점수, 수학 점수를 차례대로 입력 받아서
//다음과 같은 형식에 맞추어 출력하는 프로그램을 작성하시오

//출력 결과
//번호:###번 이름:###
//국어: ###점 영어:###점 수학: ###점
//총점:###점 평균: ###.##점

import java.util.Scanner;
public class GradeBook04 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		// 과목의 숫자가 초기화된 상수 SUBJECT_SIZE
		final int SUBJECT_SIZE = 3;
		
		
		// 1.	사용자로부터 번호를 입력 받아 변수에 저장한다. 
		//		변수의 이름 중에 학생의 번호, 사원의 번호 등
		//		하나의 고유한 정보를 나타내는 변수는 우리가 
		//		주로 id라고 부른다.
		System.out.println("번호를 입력해주세요.");
		System.out.println("> ");
		int id = scanner.nextInt();
		
		// 2. 사용자로부터 이름을 입력 받아 변수에 저장한다. 
		System.out.println("이름을 입력해주세요. ");
		System.out.print("> ");
		// 버퍼 메모리를 비어주기 위한 코드(엔터키가 남아있어서 제거해야함.)
		scanner.nextLine();
		
		String name = scanner.nextLine();
		
		// 3. 사용자로부터 국어 점수를 입력 받아 변수에 저장한다. 
		System.out.println("국어점수를 입력해주세요. ");
		System.out.print("> ");
		int korean = scanner.nextInt();
		
		
		// 4. 사용자로부터 영어 점수를 입력 받아 변수에 저장한다. 
		System.out.println("영어점수를 입력해주세요. ");
		System.out.print("> ");
		int english = scanner.nextInt();
		
		// 5. 사용자로부터 수학 점수를 입력 받아 변수에 저장한다. 
		System.out.println("수학점수를 입력해주세요. ");
		System.out.print("> ");
		int math = scanner.nextInt();
		
		
		// 6. 사용자로부터 입력받은 점수를 토대로 총점을 계산하여 변수에 저장한다. 
		int sum = korean + english + math;
		
		// 7. 총점 변수를 토대로 하여 평균을 계산하여 변수에 저장한다. 
		double average = (double) sum / SUBJECT_SIZE; 
		
		// 8. 변수에 저장된 정보를 화면 양식에 맞추어 출력한다. 
		System.out.printf("번호 : %2d번 이름: %s\n", id, name);
		System.out.printf("국어: %03d점 영어:%03d점  수학: %03d점\n", korean, english, math);
		
		System.out.printf("총점 :%03d점 평균: %06.2f점\n ",sum, average );
		
		scanner.close();
		
	}

	//	하드코딩과 소프트 코딩
	//	하드코딩이란 매직 넘버 등을 사용하여 경직된 코드를 만들어서 유지보수가
	//	어려운 코딩을 하드코딩이라고 한다. 
	//	물론 난이도가 낮은 프로그램을 만들 때에는 하드코딩이 소프트 코딩보가
	//	더 쉽고 빠르게 만들 수 있지만 여러분들이 규모가 크거나 유지보수가 잦은
	//	프로그램을 만들 때에는 하드코딩을 하지 말아야 한다.!
	
	//	그에 반해서 소프트 코딩은 코드를 유연하게 코딩해서 유지보수를 쉽게 
	//	할 수 있는 코딩을 소프트 코딩이라고 한다.
	//	적극적인 상수 사용, 재사용 가능성이 높은 코드는 메소드화 시키는 등
	//	하드코딩에 비교하면 작업량이 많기 때문에 난이도가 낮은 프로그램에서는
	//	상대적으로 소프트 코딩이 더 불편하다. 
	//	하지만 하드코딩과 반대로 규모가 크거나 유지보수가 잦으면
	//	소프트 코딩이 월등히 유리하다. 
	
}



























