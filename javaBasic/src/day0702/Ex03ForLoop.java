package day0702;
//for 반복문
//for 반복문은
//while 반복문과는 다르게
// 좀더 명확하게 횟수가 표현이 된다.

//for 반복문의 기본 구조
//for (제어변수의 선언 :반복 조건식; 제어 변수의 변화식) {
//		반복할 코드
//
//}


public class Ex03ForLoop {

	public static void main(String[] args) {
		//for  반복문
		System.out.println("for문의 기본형태");
		for (int i = 1; i <= 3; i++) {
			System.out.printf("i의 현재 값 : [%d]\n", i);
		}
		//위의 for문은 다음과 같은 순서를 가진다.
		//1. int i  = 1; -> i의 현재값 : 1
		//2. i <= 3; -> true 
		//3. System.out.printf("i의 현재 값 : [%d]\n", i);
		//4. i++; -> i의 현재값 : 2
		//5. i <= 3; -> true 
		//6. System.out.printf("i의 현재 값 : [%d]\n", i);
		//7.  i++; -> i의 현재값 : 3
		//8. i <= 3; -> true 
		//9. System.out.printf("i의 현재 값 : [%d]\n", i);
		//10. i++; -> i의 현재값 : 4
		//11. i <= 3; -> false -> for문 종료
		
		System.out.println("\n---------------------------------\n");
		
		//for 문에 관한 팁
		//1.	제어 변수의 이름은 우리가 원하는대로 지어도 되지만
		// 		전통적으로 i부터 시작해서 중첩레벨에 따라 j, k, l 순으로 
		//		들어간다.
		
		//2.	만약 조건식이 맨 처음부터 false가 나올 때에는 
		//		아무것도 실행되지 않는다.
		System.out.println("2.false 조건식");
		for (int i = 10; i <= 3; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n---------------------------------\n");
		
		//3.변화식은 ++외에도 변수의 값을 변화시킬 수 있는
		//	할당연산자면 뭐든 사용 가능하다. 
		System.out.println("3. 변화식");
		
		for(int i = 10000000; i > 0; i /=10) {
			System.out.println(i);
		}
		
		System.out.println("\n---------------------------------\n");
		
		
		//4.만약 변화식이 생략 되면?
		// 무한루프가 된다.
		System.out.println("4.변화식 생략");
	//	for(int i = 1; i <=3;) {
	//		System.out.println(i);
	//	}
		System.out.println("\n---------------------------------\n");
		
		//5.제어 변수의 초기화나 조건식에 다른 변수가 들어갈 수 있다.
		int start = 3;
		int end = 7;
		System.out.println("5. 다른 변수 사용한 for문");
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
		System.out.println("\n----------------------------------\n");
		
		
	}

}
