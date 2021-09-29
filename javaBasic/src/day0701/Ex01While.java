package day0701;
//반복문
//	"조건이 맞는 동안 반복되는 코드"
//	조건문처럼 반복문은
//	특정 조건식을 실행시켜서 결과값이 true 가 나오면
//	코드를 반복시키는데
//	반복시키는 방법은
//	해당 반복문의 코드 블락을 위에서 아래로 한번 반복시키고 나서
//	다시 조건식을 실행시켜서 true/false 중 어떤 값이 나오냐에 따라서
//	다시 실행할지 혹은 실행하지 말지를 결정하게 된다. 

//	반복문에는while 반복문과 for 반복문 2가지 있는데
//	2가지 반복문의 사용방법은 다르다.
//	while 반복문은 횟수의 제한이 없이 조건식 true가 나오는 동안
//	계속 반복이 된다.
//	하지만 for 반복문은 비교적 명확하게 총 몇번 반복이 될 지를
//	명시하게 된다.

//	while반복문의 구조는 다음과 같다.
//	while (조건식) {
//	조건식이 참일 때 실행할 코드
//}


public class Ex01While {
	public static void main (String [] args) {
		//1. 조건식에서 사용할 int 변수 선언
		int number = 1;
		
		//while 반복문을 통해서 number가 
		//4보다 작을 동안
		//화면에 number의 값을 출력하는 코드를 만들어보자.
		
		while (number < 4 ) {
			System.out.println(number);
			number++;
		} 
		
		System.out.println("프로그램 종료");
		
	}
}
