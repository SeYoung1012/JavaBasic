package day0701;

import java.util.Scanner;

//사용자로부터 키와 몸무게를 입력 받아서
//BMI를 계산하여
//비만도를 출력하는 프로그램
//단, 기네스북에 따르면 세계에서 가장 키가 컸던 사람의 키는 
//2.72m 였습니다.
//또한 가장 몸무게가 무거웠던 사람의 몸무게는 635kg이었습니다.
//만약 사용자가 잘못된 값을 입력할 경우, 
//올바른 값을 입력할 때까지 다시 입력 받으시오.




public class BmiChecker01 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키를 m 단위로 입력해주세요. ");
		System.out.print("> ");
		double input = scanner.nextDouble();
		
		while(!( input > 0 && input < 2.72)) {
			System.out.println("잘못된 키 입니다.");
			System.out.println("키를 입력해주세요.");
			System.out.print(">  ");
			input = scanner.nextDouble();
		}
		double height = input;
		
		System.out.println("몸무게를 kg 단위로 입력해주세요. ");
		System.out.print("> ");
		input = scanner.nextDouble();
		
		while(!( input > 0 && input < 635)) {
			System.out.println("잘못된 몸무게 입니다.");
			System.out.println("몸무게를 입력해주세요.");
			System.out.print(">  ");
			input = scanner.nextDouble();
		}
		
		double weight = input;
		
		double bmi = weight / height /height;
		
		String result;
		if(bmi <18.5) {
			result = "저체중";
		} else if (bmi < 23) {
			result = "정상체중";
		} else if (bmi < 25) {
			result = "과체중";
		} else {
			result = "비만";
		}
			
		System.out.printf("키: %.2fm 몸무게: %.2fkg \n",height, weight);
		System.out.printf("BMI 수치 :%.3f\n 비만도: %s\n",bmi, result);
	  
		scanner.close();
		
		
		
	}
	

}
