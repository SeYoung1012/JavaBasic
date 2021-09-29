package day0630;
// 중첩 if문
//중첩이란 어떤 것 안에 똑같은 무언가가 또 있는 것이다. 
//중첩 if문은 
//if문 안에 if문이 또 있는 것을
//중첩 if문이라고 한다.
//단, 조건식은 같지 않아도 되며
//중첩 if문을 사용하는 이유는 한 가지 조건을 체크하고
//코드를 실행하고 다시 다른 조건을 체크하기 위함이다. 


public class Ex06NestedIf {

	public static void main(String[] args) {
		//아까 전에 우리가 만들었던
		//10~100 사이 일때 "두 자리 숫자입니다."
		//가 출력되는 코드를 다시 만들어 보자. 
		
		int number = 5;
		
		System.out.println("&& 연산자를 사용하는 경우");
		if(number >= 10 && number <100) {
			System.out.println("두 자리 숫자입니다.");
		} else {
			System.out.println("두 자리 숫자가 아닙니다. ");
		}
		System.out.println("----------------------------");
		System.out.println();
		//	위와 비슷한 절차지만
		//	먼저 10보다 크거나 같은 지 체크해서
		//	"10보다 크거나 같은 것이 확인되어 최대값을 벗어나는 지 확인하겠습니다."
		//	라는 메시지가 중간에 출력되게 만들고 싶을 때
		//	우리는 중첩 if문 구조를 사용해야 한다. 
		
		System.out.println("중첩 if문을 사용하는 경우");
		if(number >= 10 ) {
			System.out.println("10보다 크거나 같은 것이 확인되어 벗어나는지 확인하겠습니다.");
			if (number < 100) {
				System.out.println("number는 최대값 100보다 작습니다.");
				System.out.println("number는 두 자리 숫자입니다.");
			} else {
				System.out.println("number는 최대값을 벗어났습니다.");
			}
		} else {
			System.out.println("number는 10보다 작습니다.");
		}
	
	
	}
	

}
