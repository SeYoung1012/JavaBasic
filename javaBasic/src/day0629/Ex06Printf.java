package day0629;
//	printf () 를 사용하는 방법
//	printf는 출력할 형식과 그 형식에 맞는 값 2가지의 값을 필요로 한다.

public class Ex06Printf {
	public static void main (String [] args) { 
		// int 변수 number 를 선언하고 12497로 초기화한다.
		int number = 12497;
		
		System.out.println("1. 10진법 정수('d'ecimal)");
		// A. 10진법 정수를 그대로 출력해라
		System.out.printf("A. [%d]\n", number);
		//	B. 10진법 정수를 8자리 오른쪽 정렬해서 출력해라
		System.out.printf("B. [%8d] \n", number);
		//	C. 10진법 정수를 3자리 오른쪽 정렬해서 출력해라
		//		만약 출력할 내용이 지정한 자릿수보다 많을 경우
		//		자릿수 지정은 무시된다.
		System.out.printf("C. [%3d]\n", number);
		// D. 10진법 정수를 8자리 왼쪽 정렬해서 출력해라
		System.out.printf("D. [%-8d]\n", number);
		// E. 10진법 정수를 8자리 오른쪽 정렬하고 왼쪽 빈자리가 있으면
		//		0으로 채워서 출력해라
		System.out.printf("E. [%08d]]\n", number);
		System.out.println("----------------------------");
		
		
		System.out.println("2. 16진법 정수(he 'x' adecimal");
		// A. 16진법 정수를 그대로 출력하되 알파벳이 있으면 소문자로 
		//	출력해라.
		System.out.printf("A. [%x] \n" , number);
		// B. 16진법 정수를 8자리로 오른쪽 정렬로 출력하되
		//		알파벳이 있으면 대문자로 출력해라
		System.out.printf("B. [%8X] \n", number);
		//C. 16진법 정수를 8자리 왼쪽 정렬로 출력하되
		//		알파벳이 있으면 소문자로 출력해라
		System.out.printf("C. [%-8x] \n", number);
		// D. 16진법 정수를 8자리 오른쪽 정렬로 출력하되
		//		왼쪽 빈 공간은 0으로 채우고 알파벳이 있으면 대문자로 출력해라
		System.out.printf("D. [%08X] \n", number);
		System.out.println("----------------------------");
		
		double d = 12.345;
		System.out.println("3. 실수('f'loat)");
		// A. 실수를 그대로  출력해라
		System.out.printf("A. [%f]\n", d);
		// B. 실수를 총 12자리 오른쪽 정렬해서 출력해라
		System.out.printf("B. [%12f]\n", d);
		// C. 실수를 소숫점 2번째 자리까지 출력해라
		System.out.printf("C. [%.2f] \n", d);
		// D. 실수를 총 6자리 오른쪽 정렬하고
		//	  소숫점은 2번째 자리까지 출력하고 왼쪽 빈 공간은 0으로 채워라
		System.out.printf("D. [%06.2f] \n", d);
		System.out.println("----------------------------");
		
		String str = "abcDEF";
		System.out.println("4. 스트링 ('S'tring)");
		// A.스트링을 그대로 출력해라
		System.out.printf("A. [%s]\n", str);
		// B. 스트링을 모두 대문자로 출력해라.
		System.out.printf("B. [%S]\n", str);
		//C. 스트링을 총 8자리 오른쪽 정렬해서 그대로 출력해라
		System.out.printf("C. [%8s]\n", str);
		System.out.println("----------------------------");
		
		// printf() 를 사용할 때 주의할 점!
		
		//	1. 존재하지 않은 %문자를 쓰면 에러가 발생한다!
		//	System.out.printf("%z\n", 123);
		
		//	2. %문자와 데이터타입이 일치하지 않은 경우에도 에러가 발생한다.
		//	System.out.printf("%d\n",  12.34);
		
		//	3. 여러 개의 %문자를 섞어서 쓸 수도 있지만
		//	반드시 뒤의 값의 갯수가 %문자 보다는 많아야 된다!
		System.out.printf("%f %d %f %s \n" , 1.2, 3, 4.5, "abc", 34);
		
		// 하지만 %문자의 갯수가 더 많으면 에러가 발생한다.
		// System.out.printf("%d %d %d \n", 1,2);
		
		//4. 여러분들이 주로 하시는 실수 중에 다음과 같은 실수가 있다.
		// System.out.printf("%4\n", 3);
		
		// 5. 만약 printf를 쓰면서
		// %를 출력형식 문자가 아닌 그냥 % 자체의 글자로 쓸 때에는
		// %% 라고 해주면된다.
		System.out.printf("%.2f%%", 33.333);
		
		
	}

}
