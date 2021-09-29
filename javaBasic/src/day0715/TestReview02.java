package day0715;
/*
 * 문항 2] 
 * 정수와 소수 구별하기
 * 사용자가 입력한 숫자가 몇 자리 숫자인지 확인하고
 * 만약 4자리 숫자일 경우 천의 자리, 백의 자리, 십의 자리, 일의 자리가 
 * 각각 얼마인지 출력하는 코드를 작성하고 여기에 붙여넣으시오.
 * 
 */

import java.util.Scanner;

public class TestReview02 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	      // 1. 사용자로부터 숫자를 입력받는다.
	      int userChoice = scanner.nextInt();
	      
	      // 2. 4자리 숫자가 맞는지 확인한다.
	      //     4자리 숫자이려면 1000 이상 9999 이하의 범위에 속하면 된다.
	      if(userChoice >= 1000 && userChoice <= 9999) {
	         
	      // 3. 4자리 숫자일 경우, 각 자리를 분리해낸다.
	      //     3-1. 먼저 임시 변수에 사용자가 입력한 숫자를 할당한다.
	         int temp = userChoice;
	         
	      //     3-2. 사용자가 입력한 값 / 1000 을 변수 1에 저장한다.
	         int num1 = userChoice / 1000;
	         
	      //     3-3. 임시변수에 %= 연산자를 사용하여 1000으로 나눈 나머지를 저장한다.
	         temp %= 1000;
	         
	      //     3-4. 임시변수 / 100 을 변수2에 저장한다.
	         int num2 = temp / 100;
	         
	      //      3-5. 임시변수에 %= 연산자를 사용하여 100으로 나눈 나머지를 저장한다. 
	         temp %= 100;
	         
	      //     3-6. 임시변수 / 10 을 변수3에 저장한다.
	         int num3 = temp / 10;
	         
	      //     3-7. 임시변수에 %= 연산자를 사용하여 10으로 나눈 나머지를 변수3에 저장한다.
	         int num4 = temp % 10;
	         
	      //     4. 결과값을 출력한다.
	         System.out.println("천의 자리: "+ num1);
	         System.out.println("백의 자리: "+ num2);
	         System.out.println("십의 자리: "+ num3);
	         System.out.println("일의 자리: "+ num4);
	      }
	      scanner.close();
	   }

	}