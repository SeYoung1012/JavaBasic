package day0629;
//	Scanner 
//	자바에서 다양한 입력을 처리해주는 클래스인 Scanner 클랫는
//	단순한 키볻 입력 뿐만이 아니라 고급 내용인
//	파일 입력, 스트림 입력 등에서도 사용된다!

//	Scanner의 경우, 우리가 프로그램을 실행시키는데 반드시 필요로 하는
//	클래스도 아니고, 일반적인 자료를 저장하는 데이터타입도 아니기 때문에
//	자동차 옵션처럼 우리가 사용하려며 ㄴ우리 클래스에
//	스캐너 클래스를 사용하겠다고 "수입"해와야 한다.
//	스캐너 클래스 뿐만이 아니라 다른 패키지 안의 클래스를 데이터 타입으로 만들어야
//	하는 경우에는 매번 우리가 수입 해야한다.
//	수입은 다음과 같이 이루어진다.
//	import 패키지 이름. 클래스이름;
//	단, 수입은 public class ~~~~~이전에 되어야 한다. 

import java.util.Scanner;
public class Ex07Scanner {
	public static void main(String [] args) { 
		//Scanner 클래스 변수 선언하기
		Scanner scanner;
		
		// scanner 초기화하기
		// scanner 를 초기화할 때에는
		// 다음과 같은 형식을 가져야 한다.
		//변수이름 = new Scanner (입력받을 위치);
		//키보드 입력을 받아야 할 때에는
		//입력받을 위치를 System. in 으로 지정해주면 된다!
		scanner = new Scanner(System.in);
		
		//1.int 입력받기
		System.out.println("1.int 입력받기");
		//사용자로부터 int 값을 입력 받을 때에는
		//Scanner 클래스 변수의 nextInt () 메소드를 실행하면 된다.
		System.out.println("정수를 입력해주세요.");
		System.out.println(">");
		int number = scanner.nextInt();
		
	
		
		System.out.println("사용자가 입력한 정수:" + number);
		
		System.out.println("------------------------------");
		
		//2. double 입력받기
		System.out.println("2. double 입력 받기");
		//사용자로부터 double 값을 입력 받을 때에는
		//Scanner 클래스 변수의 nextDouble() 메소드를 실행하면 된다.
		System.out.println("실수를 입력해주세요.");
		System.out.println(">  ");
		double d = scanner.nextDouble();
		
		System.out.println("사용자가 입력한 실수:" + d);
		
		System.out.println("------------------------------");
		
		//3. String 입력받기
		System.out.println("3. String 입력 받기");
		//사용자로부터 String을 입력 받을 때에는
		//next() 혹은 nextLine()을 쓰게 되는데
		//next()의 경우, 스페이스같은 일반적인 공백을 쓰면
		//그 공백 이전까지의 내용만 입력이 되지만
		//nextLine()은 반드시 엔터 키를 입력해야 입력이 종료된다.
		System.out.println("이름을 입력해주세요.");
		System.out.println("> ");
		String name;
		// next() 의 경우
//		name = scanner.next();
//		System.out.println("사용자의 이름:" +name);
		
		
		//nextLine ()의 경우
		//단, nextLine()을 사용할 때 한가지 주의할 점이 있다.
		//nextLine(), nextDouble()등의 숫자를 입력받는 메소드 이후에
		//nextLine()을 사용하게 되면, Scanner 클래스의 버퍼 메모리를 읽어오는 방식
		//발생하는 버그 때문에
		//실제론 아무런 값도 입력해줄 수 없는 상태가 된다.
		//이러한 버그를 해결하는 방법은 매우 간단하다.
		//실제 값을 저장하는 nextLine() 이전에
		//nextLine()을 한번 더 적어주면 해결된다.
		
		//단, nextLine()이 실행된 이후거나 프로그램의 맨 처음일 경우, 
		//즉 버퍼 메모리에 아무것도 없을 경우에는
		//다음 방법을 쓰면 안된다.
		//왜냐하면 버퍼메모리의 남아있는 엔터키를 제거하기 위해 적은 
		//scanner.nextLine()도 입력을 받기 위해 대기하는 상태가 되어버리기 
		//때문이다!
		
		scanner.nextLine();
		name = scanner.nextLine();
		System.out.println("사용자의 이름:" + name);
		
		System.out.println("------------------------------");
		
		//Scanner 클래스 변수와 같이
				//버퍼메모리 등의 외부 메모리를 읽어오는 클래스 변수는
				//반드시 프로그램 제일 마지막에 close() 메소드를 실행해주는 것이
				//좋다.
				scanner.close();
	}
}
