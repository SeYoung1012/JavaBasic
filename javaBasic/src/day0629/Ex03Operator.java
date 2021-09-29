package day0629;
//	연산자 03
//	비교 연산자
//	비교 연산자는 왼쪽의 값과 오른쪽의 값을 크거나 작거나 등으로 비교하여
//	 true / false의 boolean 값으로 나타낸다.


public class Ex03Operator {
	public static void main (String [] args) { 
		//1. int 변수 number1 과 number2를 선언
		int number1, number2;
		//2. number1에 5 number2에 7을 초기화한다.
		number1 = 5;
		number2 = 7;
		
		// A. <
		System.out.println("A. <");
		System.out.println("number1 < number2 : " + (number1< number2));
		System.out.println("number1 < 0 : " + (number1< 0));
		System.out.println("number1 < 5 : " + (number1< 5));
		System.out.println();
		
		// B. <=
		System.out.println("B. <=");
		System.out.println("number1 <= number2 : " + (number1<= number2));
		System.out.println("number1 <= 0 : " + (number1<= 0));
		System.out.println("number1 <= 5 : " + (number1<= 5));
		System.out.println();
		
		//	C. ==
		//		==은 2개의 값이 같으면 true, 다르면 false가 리턴된다.
		System.out.println("C. ==");
		System.out.println("number1 == number2 : " + (number1 == number2));
		System.out.println("number1 == 5:" + (number1 == 5));
		System.out.println();
		
		//	D. !=
		//		!=은 2개의 값이 다르면 true, 같으면 false가 리턴된다.
		System.out.println("D. !=");
		System.out.println("number1 1 != number2 : " + (number1 != number2));
		System.out.println("number1 != 5:" + (number1 != 5));
		System.out.println();
		
		
		
		//	단, ==이나 !=의 비교연산자는
		//	기본형 데이터타입에 대해서만 정확한 결과값을
		//	연산한다.
		//	참조형 데이터타입에 대해서는 부정확한 결과값을 연산할 수도 있다
		
		//	String 변수를 만드는 3가지 방법
		//	1. 변수 = "";
		//	2. 변수 = new String("");
		//	3. 변수 = 다른 변수;
		
		//	위의 방법을 사용하여
		//	"abc" 라는 3글자가 들어간 3개의 String 변수를 만들어보자
		 String str1 = "abc";
		 String str2 = new String ("abc");
		 String str3 = str1;
		
		// str1, str2, str3 을 출력해보자
		//	단 출력한 내용을 [ ] 으로 감싸서 명확하게 글자가 같은지도 보자
		 System.out.println("str1 : ["+str1+"]");
		 System.out.println("str2 : ["+str2+"]");
		 System.out.println("str3 : ["+str3+"]");
		 System.out.println();
		
		// str1, str2, str3 을 비교연산자를 통해서
		// 같은 값을 가지고 있는지 비교해보자
		 System.out.println("str1 == str2 :" + (str1 == str2));
		 System.out.println("str1 == str3 :" + ( str1 ==str3));
		 System.out.println("str2 == str3 :" + (str2 == str3));
		 System.out.println();
		
		//	JVM에는 크게 (중요)
		//	stack , heap, method 3가지 메모리 영역이 존재한다.
		// 	stack : 변수와 그 값을 저장
		//  heap :  참조형 데이터타입의 값과 세부 내용을 저장
		//  method : 해당 자바 프로그램이 실행시킬 코드를 저장
		
		// 기본형 데이터 타입의 경우 stack 영역에 변수와 2진법으로 변환된 현재 값이
		// 저장된다.
		// 즉, 해당 변수의 실제값 자체가 stack에 저장이 되는 것이다.
		
		//	참조형 데이터 타입의 경우 stack 영역에 변수와 실제 값이 저장된
		//	heap 영역으로 향하는 메모리 주소값이 저장된다.
		//	즉, 해당 변수의 실제 값은 heap에 저장이 되고, 그 실제 값을 확인하기 
		//	위해서는, stack 영역에 저장된 메모리 주소값을 "참조"해야 실제 값을
		//	알 수 있게 되는 구조가 되는 것이다. 
		
		//	위의 String 변수 str1, str2, str3은 String 이라는 클래스의 변수
		//	즉 참조혀여 데이터타입을 가진 변수이기 때문에 해당 변수들은 stack
		//	주소값만 저장이 되어있고, 실제 값인"abc"라는 글자는 heap영역에
		//	해당 주소값을 들어가야 찾을 수 있게 된다.
		
		//	하지만 비교 연산자의 경우, 친절하게 heap 영역으로 들어가서
		//	실제 글자가 뭐가 저장되어 있는 지 확인해서 개별적으로 비교하는 것이 아니라
		//	stack 영역에 저장된 값만 기준으로 해서 비교를 하게 된다.
		
		//	위의 str1, str2, str3의 초기화식을 보면
		//	str1과 str3은 같은 주소값을 가지는 초기화식이지만(str3 = str1)
		//	str2는 heap영역에 아예 새로운 공간을 만들어서 해당 공간의
		//	주소값을 저장하는 코드로 되어 있다.(str2 = new String("abc"))

		// 	그렇기 때문에 같은 주소값을 가지고 있는 str1과 str3을 비교할 때에는
		//	비교연산자(==)가 true라는 값을 연산하지만
		//	str1과 str2 혹은 str2와 str3 을 비교 연산하게 되면
		//	false 라는 부정확한 값을 연산하게 된다.
		
		//	따라서 참조형 데이터타입의 변수의 값을 비교할 때에는
		//	비교연산자를 사용하지 말아야 한다!!!
		
		//	참조형 데이터 타입의 값들은 비교연산자가 아닌
		//	equals() 라는 메소드를 통해서 비교해야 한다!!!
		
		//	str1의 현재 저장된 값이 str2의 현재 저장된 값과 같습니까?
			System.out.println("str1.equals(str2)" + str1.equals(str2));
		
		//	str1의 현재 저장된 값이 str3의 현재 저장된 값과 같습니까?
			System.out.println("str1.equals(str3)" + str1.equals(str3));
		
		//	str2의 현재 저장된 값이 str3의 현재 저장된 값과 같습니까?
			System.out.println("str2.equals(str3)" + str2.equals(str3));
			
		
			
			
			
	}
}
