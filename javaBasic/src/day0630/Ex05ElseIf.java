package day0630;
//	else if 란
//	if의 조건식이 false가 나오고 나서
//	또 다른 조건식을 사용하여
//	그 조건식이 true가 나오면 특별히 코드를 처리해주어야 할 때
//	 else if 를 사용하게 된다. 

//	if - else if 는 다음과 같은 구조를 가진다. 
//	if(조건식 1) {
//
//} else if(조건식 2) {
//
//} else if(조건식 3) {
//
//} else if ...
//
//} else {
//
//}


public class Ex05ElseIf {
	public static void main (String []args) {
		//1. int 변수 number를 선언하여 7로 초기화 한다. 
		int number = 1237;
		//2. number가 10보다 작을 때, 100보다 작을때, 1000보다 작을 때, 그 외일 때
		//	마다 각각 "한 자리 숫자입니다. " , "두 자리 숫자입니다" ..."그 외입니다."
		//	가 출력될 수 있도록 if -else if 구조를 만들어준다. 
		if (number < 10) {
			System.out.println("한 자리 숫자입니다.");
		} else if (number < 100) {
			System.out.println("두 자리 숫자입니다. ");
		} else if (number < 1000) {
			System.out.println("세 자리 숫자입니다. ");
		} else {
			System.out.println("그 외입니다. ");
		}
		
	}
}
