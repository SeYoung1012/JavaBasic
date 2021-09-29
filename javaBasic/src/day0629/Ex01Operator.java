package day0629;
//	연산자(Operator)
//	연산자란, 수학적 기호에 프로그래밍 기능이 정의 되어 있어서
//	해당 코드를 컴파일 하게 되면 해당 기능이 자동으로 실행되는 특수 문자들을 
//	연산자라고 한다.

//	연산자에는 크게
//	산술, 할당, 비교, 논리, 비트 5가지 종류의 연산자가 있다.(비트연산자는 속도가 빠른 영역에서 씀.이미지 등)

//	산술 연산자
//	산술연산자는 앞과 뒤의 값에 대한 산술적 연산을 한다.
//	산술연산자에는
//	+, -, *, /, % 5가지 종류가 있다.


public class Ex01Operator {
	public static void main (String []args) {
		//int 변수 num1, num2를 선언해서 각각 3과 7로 초기화
		int num1 =3;
		int num2 =7;
		//	1. +
		System.out.println("1. +");
		System.out.println("num1 + num2");
		//	아래 코드의 의미는
		//	num1의 현재 저장된 값과 num2의 현재 저장된 값을
		//	더한 결과값을 화면에 출력해라~라는 의미가 된다.
		System.out.println(num1 + num2);
		
		//	2. -
		System.out.println("2. -");
		System.out.println("num1 - num2");
		System.out.println(num1 - num2);
		
		//	3. *
		System.out.println("3. *");
		System.out.println("num1 * num2");
		System.out.println(num1 * num2 );
		
		//	4. /
		System.out.println("4. /");
		System.out.println("num1 / num2 ");
		//	프로그래밍 언어에서 /표시는
		//	몫만 구한다.
		//	따라서 3/7의 몫은 0이기 때문에
		//	0만 출력이 된다.
		System.out.println(num1 / num2 );
		
		//	5. %
		//	% 연산자는 앞의 숫자 나누기 뒤의 숫자의 나머지를 구해준다.
		//	즉 3 % 7은 3 나누기 7의 나머지인 3이 나오게 되는 것이다.
		System.out.println("5. %");
		System.out.println("num1 % num2");
		System.out.println(num1 % num2);
		
		//	실수형 데이터타입 끼리의 연산
		//	1. double 변수 myDouble1과 myDouble2를 선언하고
		//	각각 5.0과 3.0 으로 초기화
		double myDouble1 = 5.0;
		double myDouble2 = 3.0;
		System.out.println("1. myDouble1 + myDouble2");
		System.out.println(myDouble1 +myDouble2 );
		
		System.out.println("2.myDouble1 - myDouble2");
		System.out.println(myDouble1 - myDouble2);

		System.out.println("3.myDouble1 * myDouble2");
		System.out.println(myDouble1 * myDouble2);

		System.out.println("4. myDouble1 / myDouble2");
		System.out.println(myDouble1 / myDouble2);

		System.out.println("5. myDouble1 % myDouble2");
		System.out.println(myDouble1 % myDouble2);
		
		// 정수와 실수를 연산해보자
		System.out.println("1. num1 + myDouble1");
		System.out.println(num1 + myDouble1);
		
		System.out.println("2. num1 - myDouble1");
		System.out.println(num1 - myDouble1);
		
		System.out.println("3. num1 * myDouble1");
		System.out.println(num1 * myDouble1);
		
		System.out.println("4. num1 / myDouble1");
		System.out.println(num1 / myDouble1);
		
		System.out.println("5. num1 % myDouble1");
		System.out.println(num1 % myDouble1);
		
		//	주의할 점:
		//	아래의 코드는 문제가 있다.
		double average = 5 / 2;
		//	위의 double 변수 average의 값은
		//	2.5가 아닌 2.0이 들어간다.
		//	그 이유는
		//	먼저 int / int 인 5 /2 가 실행되어서
		//	결과값 int 2가 나오게 되고
		//	그 int 값 2를 double로 바꾸게 2.0이 되기 때문이다!
		
		System.out.println("average");
		System.out.println(average);
		//	따라서 우리가 만약 정확한 결과값을 얻기 위해서는
		//	int / int가 아닌 int / double 혹은 double / int 의 형태로
		//	바꿔주어야 한다.
		//	그러므로 명시적 형변환을 둘 중 한 곳에 해주어야 한다.
		average = (double)5 / 2;
		System.out.println(average);
		
		//	String
		//	스트링이란 한국말로는 "문자열"이라고 표현되는 개념으로써
		//	여러 개의 글자를 모아둔 한 개의 값이다.
		//	예를 들어서 우리가 ""로 묶어서 화면에 출력하는 여러 글자들은
		//	모두 하나의 스트링 값이다.
		
		//	String 도 하나의 데이터 타입이기 때문에 우리가 변수로 만들 수 있는데
		//	여러가지 방법이 있지만 지금은 다음과 같은 방법을 사용한다. 
		//	String 변수이름 = "저장한 글자들";
		
		//	String 변수 name에 각자의 이름을 저장해보자!
		String name = "김세영";
		System.out.println(name);
		
		//	특이하게도 String 값에는 + 연산이 가능하다!
		//	String 값의 + 연산은 앞과 뒤를 String 값으로 변환하여
		//	한 개의 커다란 String으로 연결해라 라는 의미가 되낟.
		//	예시 1. 스트링 + 스트링
		System.out.println(name + "입니다.");
		
		//	예시 3. 스트링 + 다른 데이터 타입 or 다른 데이터 타입 or 스트링
		//	이 때에는 다른 데이터 타입의 값이 스트링으로 변환이 되고 
		//	2개가 이어져서 커다란 스트링 값이 나온다.
		System.out.println("12"+345);
		
		
	}
}
