package day0630;
//사용자로부터 이름, 키, 몸무게를 입력 받아서
//다음과 같은 형식으로 출력되는 프로그램을 작성하시오.

//출력결과}
//이름 : 김땡땡 키: #.## 몸무게 : ##.##kg
//BMI : ##.### 비만도 : 과체중

//BMI 공식 몸무게 / 키 / 키 입니다.
//단, 몸무게는 kg, 몸무게는 m 단위입니다.
// BMI 18.5 미만 : 저체중
//	~23 미만 : 정상
// ~ 25 미만 : 과체중
//~그 이상 : 비만

import java.util.Scanner;
public class BmiChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 각 비만도의 기준점이 될 상수 
		final double STANDARD_I = 18.5;
		final double STANDARD_II = 23;
		final double STANDARD_III = 25;
		
		// 1. 이름을 입력받는다. 
		System.out.println("이름을 입력해주세요.");
		System.out.print("> ");
		String name = scanner.nextLine();
		
		//2. 키를 입력받는다. 
		System.out.println("키를 m 단위로 입력해주세요. ");
		System.out.print("> ");
		double height = scanner.nextDouble();
		
		//3. 몸무게를 입력받는다. 
		System.out.println("몸무게를 kg 단위로 입력해주세요. ");
		System.out.print("> ");
		double weight = scanner.nextDouble();
		
		//4. BMI를 계산한다. 
		double bmi = weight / height /height;
		
		//5. if-else if 구조를 통하여
		// 비만도를 String에 저장
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
		
		//6. 출력 
		System.out.printf("이름: %s 키: %.2f m 몸무게: %.2f kg \n", name ,height, weight);
		System.out.printf("BMI :%.3f 비만도: %s\n",bmi, result);
		
		scanner.close();
		
				
	}

}
