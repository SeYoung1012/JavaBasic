package day0630;

import java.util.Scanner;

//숙제2.

//사용자로부터 키와 몸무게를 입력 받아서
//BMI를 계산하여
//비만도를 출력하는 프로그램
//단, 기네스북에 따르면 세계에서 가장 키가 컸던 사람의 키는 
//2.72m 였습니다.
// 또한 가장 몸무게가 무거웠던 사람의 몸무게는 635kg이었습니다.
//만약 사용자가 잘못된 값을 입력할 경우, 더이상 추가적인 입력 없이
//경고 메시지 출력 후 프로그램이 종료되도록 코드를 작성하시오.

public class BmiChecker2 {
	public static void main(String [] args ) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("키를 m 단위로 입력해주세요. ");
		System.out.print("> ");
		double height = scanner.nextDouble();
		
		if (height > 0 || height <= 2.72) {
           
        } else  {
        	System.out.println("잘못된 점수가 있어서 결과를 출력할 수 없습니다.");
        }
		 
		System.out.println("몸무게를 kg 단위로 입력해주세요. ");
		System.out.print("> ");
		double weight = scanner.nextDouble();
		
		if (weight <= 0 || weight >= 635 ) {
        	
        } else {
        	System.out.println("잘못된 점수가 있어서 결과를 출력할 수 없습니다.");
        }
		
		
		double bmi = weight / height /height;
		
		final double STANDARD_I = 18.5;
		final double STANDARD_II = 23;
		final double STANDARD_III = 25;
		
		
		String result;
		
		
		if(bmi <STANDARD_I) {
			result ="저체중";
		} else if(bmi < STANDARD_II){
			result ="정상";
		} else if (bmi < STANDARD_III) {
			result ="과체중";
		} else {
			result = "비만";
		}
		
		System.out.printf("키: %.2f m 몸무게: %.2f kg \n",height, weight);
		System.out.printf("BMI 수치 :%.3f\n 비만도: %s\n",bmi, result);
		
		scanner.close();
		
	}

}
