package day0702;
//조건문 02
//switch 조건문

//switch 조건문은
//if 조건문과 다르게
// 한개의 값이 명확하게 나오는 변수를 선택하여
// 그 변수의 특정 값에 대한 코드를 구현하게 된다.
// 즉 정수형 데이터 타입, 문자형 데이터 타입, String 데이터 타입의
// 변수만 사용 가능하다.

//switch는 다음과 같은 구조를 가진다. 
//switch(변수)
//	case 값1 : 
//		코드
// break;
// case 값2 :
//	코드
// break;
// ....
// default:
// 코드 
// break;
//
//}

public class Ex01Switch {
	public static void main(String [] args) {
		int number =2;
		
		switch (number) {
		case 1 :
			System.out.println("number는 1입니다. ");
		break;	
		case 2 :
			System.out.println("number는 2입니다. ");
		break;		
		case 3 :
			System.out.println("number는 3입니다. ");
		break;
		case 4 :
			System.out.println("number는 4입니다. ");
		break;
		default :
			System.out.println("number는 그 외입니다. ");
		break;
			
		}
		
		
		
		
	}

}
