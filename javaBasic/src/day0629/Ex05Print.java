package day0629;
//	자바 콘솔의 출력을 담당하는 3가지 메소드
//	1.	print()
//		print ()는 괄호안의 내용을 모두 출력하고 나서
//		그 다음에 출력할 위치를 그 다음 칸으로 지정한다.
//	2.	println()
//		println() 은 print a line의 줄임말로써, 괄호 안의 내용을 모두
//		출력하고 나서, 그 다음에 출력할 위치르 륵 다음 줄의 첫번째 칸으로 지정한다.
//	3.	printf()
//		printf()는 print in format의 줄임말로써, 괄호 안의 내용을
//		형식에 맞추어 출력하고, 그 다음에 출력할 위치를 그 다음 칸으로 지정한다.


//	이스케이프 문자 (Escape character)
//	이스케이프 문자란 , \와 조합돼서 프로그래밍 언어의 특정 기호를
//	"문장 기호"로 사용하겠다 라는 것을 코드에게 알려주는 문자들이다.
//	대표적으로
//	\' , \" , \\ , \t, \n 등이 있다.

public class Ex05Print {
	public static void main (String []args) {
		//	1. 출력할 내용을 담을 String 변수
		String str1 = "abcDEF";
		String str2 = "ABCdef";
		
		//print() 체험해보기
		System.out.println("1.print ()" );
		System.out.print(str1);
		System.out.print(str2);
		
		System.out.println("-------------------------------------");
		
		//println () 체험해보기
		System.out.println(" 2.println ()" );
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("-------------------------------------");
		
		//printf () 체험해보기
		System.out.println("3. printf()");
		System.out.printf("[%s]", str1);
		System.out.printf("{%s}", str1);
		System.out.println("-------------------------------------");
		
		//	이스케이프 문자 체험해보기
		//	1. \t
		//		탭공백 (약 스페이스 4개 분량의 커다란 공백)
		System.out.println(str1+ "\t" + str2);
		// 2.	\n
		//		다음 줄 공백
		System.out.print(str1 + "\n");
		System.out.print(str2 + "\n");
		// 3. \'
		//		코드에서 '는 char 값의 시작을 뜻하지만
		//		\' 는 문자 ' 를 뜻하게 되며
		//		우리가 필요에 따라서 '를 출력해줄 수 있다.
		System.out.println('\'');
		
		// 4. \"
		System.out.println("\"너 자신을 알라\"");
		
		// 5. \\
		System.out.println("\\");
		
	}
}
