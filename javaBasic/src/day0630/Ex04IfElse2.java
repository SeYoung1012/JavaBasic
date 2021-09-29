package day0630;
//	1. number를 5로 초기화 하고
//		0보다 큰지 확인해서
//		0보다 크면 "양의 정수입니다."라고 출력되는 
//		0보다 작거나 같으면 "양의 정수가 아닙니다." 라고 출력되는
//     	코드를 작성하시오
//	2. 사용자로부터 나이를 입력 받아서
//		19세미만일 경우 "미성년자입니다."라고 출력되고
//		그외에는 "성인입니다"출력되게 코드를 작성하시오.
//	3. 사용자로부터 숫자를 하나 입력 받아서
//		그 숫자가 홀수이면 "홀수입니다."가 출력되고
//		짝수이면 "짝수입니다"가 출력되는 코드를 작성하시오. 
//	4. 사용자로부터 숫자를 입력받아서
//		해당 숫자가 10부터 99사이의 두 자리 숫자이면
//		"두 자리 숫자입니다."라고 출력되고
//		그 외는 "두 자리 숫자가 아닙니다"가 출력되게 코드를 작성 하시오.
//	5. 사용자가 숫자를 입력하면
//		그 숫자가 음수이거나 1000의 숫자이면
//		"올바른 값입니다"가 출력되고 그 외는 "잘못 입력하셨습니다."가 출력되게 
//		코드를 작성 하시오. 

import java.util.Scanner;

public class Ex04IfElse2 {
	public static void main (String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1번");
		int number = 5; 
		if(number > 0) {
			System.out.println("양의 정수입니다.");
		} else {
			System.out.println("양의 정수가 아닙니다. ");
		}
		System.out.println("----------------------------------");
		
		System.out.println("2번");
		
		// 1. 나이를 입력받아서 변수에 저장한다. 
		System.out.println("나이를 입력해주세요");
		System.out.print(">  ");
		int age = scanner.nextInt();
		//2. if문을 통해 미성년자인지 확인하여
		// 출력한다. 
		if(age<19) {
			System.out.println("미성년자입니다.");
		} else {
			System.out.println("성인입니다. ");
		}
		
		System.out.println("----------------------------------");
		
		System.out.println("3번");
		// 1. 사용자로부터 숫자를 입력받는다.  
		System.out.println("숫자를 입력해주세요.");
		System.out.print("> ");
		number = scanner.nextInt();
		
		//2. if문을 만들어 조건식 안에서 사용자가 입력한 숫자와 2를 
		//	나머지 연산한 결과값을 확인하여 홀수이면 홀수이다 라고 출력한다. 
		if(number%2 == 1) {
			System.out.println("홀수입니다.");
			
		}else {
			System.out.println("짝수입니다.");
		}
		System.out.println("----------------------------------");
		
		System.out.println("4번");
		// 1. 사용자로부터 숫자를 입력받아서 number에 저장.  
		System.out.println("숫자를 입력해주세요.");
		System.out.print(">  ");
		number = scanner.nextInt();
		
		//2. 사용자가 입력한 숫자가
		//	10보다 크거나 같고
		//	99보다 작거나 같으면
		//	"두 자리 숫자입니다."출력
		if(number >=10  && number<= 99) {
			System.out.println("두 자리 숫자입니다.");
		} else {
			System.out.println("두 자리 숫자가 아닙니다");
		}
		
		System.out.println("----------------------------------");
		
		System.out.println("5번");
		// 1. 사용자로부터 숫자를 입력받는다.  
		System.out.println("숫자를 입력해주세요.");
		System.out.print(">  ");
		number = scanner.nextInt();
		//2. 사용자가 입력한 숫자가 0보다 작거나
		//	 0보다 작거나
		//	1000보다 크면
		//  잘못 입력했다고 출력한다. 
		if(number < 0  || number> 1000) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.println("올바른 값입니다.");
		}
		
		
		System.out.println("----------------------------------");
		
		scanner.close();
				
		
		
	}
}
