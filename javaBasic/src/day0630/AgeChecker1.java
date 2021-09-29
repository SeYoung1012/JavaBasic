package day0630;
//숙제 1.

//2가지 검증 방법을 각각 사용하여
//사용자의 나이에 따른
//영유아, 어린이, 청소년, 성인을 출력하는 프로그램을 작성하시오.
//기네스북에 따르면, 세상에서 가장 나이가 많았던 사람의 나이는 122세 였습니다.

import java.util.Scanner;

public class AgeChecker1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in); 
		 
		
		System.out.println("나이를 입력해주세요");
	     System.out.print("> ");
	     int age = scanner.nextInt();
	     
	     System.out.println();
	     
	     String result;
	     if(age >= 0 && age <= 6) {
	         result = "영유아입니다.";
	     } else if(age >= 7 && age <= 13) {
	         result = "어린이입니다.";
	     } else if(age >= 14 && age <= 18) {
	         result = "청소년입니다.";
	     } else if(age >= 19 && age <= 122) {
	         result = "성인입니다.";
	     } else {
	         result = "잘못된입력입니다.";
	     }
	     
	     System.out.println("검증 1");
	     System.out.printf("입력된 나이: %2d세\n", age);
	     System.out.printf("출력 결과: %s\n", result);
	     System.out.println("\n================ \n");
	     
	     if(age >= 0 && age <= 122) {
	         if(age < 6) {
	             result = "영유아 입니다.";
	         } else if(age <= 13) {
	             result = "어린이 입니다.";
	         } else if(age <= 18) {
	             result = "청소년 입니다.";
	         } else {
	             result = "성인 입니다.";
	         }
	     }
	     System.out.println("검증 2");
	     System.out.printf("입력된 나이: %2d세\n", age);
	     System.out.printf("출력 결과: %s\n", result);
	     


			
			
			scanner.close();

		}

	}

