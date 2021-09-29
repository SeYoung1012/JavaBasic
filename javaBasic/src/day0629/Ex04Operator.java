package day0629;
//	연산자 04
//	논리연산자
//	논리연산자는 boolean 값에 대한 연산을 하게 되는데
//	&& : 2개의 boolean 값이 모두 true일 때에만 결과값이 true가 나온다.
//  || : 2개의 boolean 값 중 하나라도 true이면 결과값이 true가 나온다.
//	! : true는 false로, false는 true로 연산한다.
//	3가지 연산자가 있다.


public class Ex04Operator {
	public	static void main(String [] args ) {
		//	1. AND 연산자
		System.out.println("1. AND 연산자");
		System.out.println("true && true : " + ( true && true ));
		System.out.println("true && false : " + ( true && false ));
		//	아래의 두 줄은 뒤의 true와 false에 노란 줄이 가는데
		//	왜냐하면 앞이 false이고 AND 연산자가 붙으면
		//	뒤의 값은 실행하지 않더라도 무조건 결과값이 false이기 때문이다.
		//	이럴 경우에는 뒤의 코드는 아예 실행이 되지 않는다.
		
		System.out.println("false && true : " + ( false && true ));
		System.out.println("false && false : " + ( false && false ));
		System.out.println("----------------------------------");
		
		
		//	2. OR 연산자
		System.out.println(" 2. OR 연산자");
		//OR 연산자의 경우 둘 중 하나라도 true 이면 true 이기 떄문에
		// 연산자의 앞이 true 일 경우 뒤 코드는 아예 실행되지 않는다.
		System.out.println("true || true: " + (true || true));
		System.out.println("true || false: " + (true || false));
		System.out.println("false || true: " + (false || true));
		System.out.println("false || false: " + (false || false));
		System.out.println("----------------------------------");
		
		//	3. NOT 연산자
		System.out.println("3. NOT 연산자");
		boolean bool = true;
		System.out.println("!bool : " + !bool);
		System.out.println("!bool 의 현재값 : " + bool);
		
		bool = false;
		System.out.println("!bool : " + !bool);
		System.out.println("!bool 의 현재값 : " + bool);
		
		//논리 연산자의 현실적인 예
		//int 변수의 값이 특정 범위에 속하는지 체크하여
		//속하면 true, 안 속하면 false가 출력되는 코드
		
		//int 변수 number의 값이 0~10 사이면
		//true , 그 외에는 false가 리턴되는 코드
		int number = 14;
		System.out.println("0 < number < 10? : " + ( 0 < number && number < 10));
		
		
		
		
	}
}
