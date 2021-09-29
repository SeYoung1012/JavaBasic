package day0630;
//	if -else 구조
//	if -else 구조는
//	만약 if의 조건식이 false가 나오는 경우에는
// 	else의 코드 블락이 실행되는 구조로써
//	if 조건식이 false 가 나올 경우를 대비하여
//	해당 경우에 실행할 코드를 else가 담당하게 된다. 

//	단 if- else 구조에서는
//	if 코드 블락만 실행되거나 else코드 블락만 실행되게 된다. 

public class Ex03IfElse {
	public static void main (String [] args) {
		//int 변수 number를 선언하고 8 을 초기화한다. 
		
		int number = 18;
		if(number < 10 ) {
			System.out.println("10보다 작습니다. ");
		} else {
			System.out.println("10보다 크거나 같습니다. ");
		}
		
		System.out.println("프로그램 종료");
	}

}
