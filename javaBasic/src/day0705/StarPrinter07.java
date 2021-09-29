package day0705;
//별찍기 07

import java.util.Scanner;

public class StarPrinter07 {
	public static void main(String [] args)	{
		Scanner scanner = new Scanner (System.in);
		System.out.println("별찍기 7번");
		System.out.println("출력할 줄 수");
		System.out.print(">");
		int lineNumber = scanner.nextInt();
		
		//윗부분 담당하는 i for문
		for (int i = 1; i <=lineNumber-1; i++) {
			String stars = "";
			
			for(int j =1; j <=i; j++) {
				stars += "*";
			}
			
			System.out.println(stars);
		}
		
		
		
		//아랫부분 담당하는 i for문
		for (int i = 1; i <=lineNumber; i++) {
			String stars = "";
			
			for(int j = i; j <=lineNumber; j++) {
				stars +="*";
			}
			
			
			System.out.println(stars);
			
		}
		
		scanner.close();
		
		
		
		
		
	}
}
