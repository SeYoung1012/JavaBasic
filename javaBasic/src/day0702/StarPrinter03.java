package day0702;
//별찍기 3번
/*		  *
 *       **
 *      ***
 * 	   ****
 *    *****	 
 */	
 


import java.util.Scanner;

public class StarPrinter03 {
	public static void main(String []args ) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("별찍기 3번");
		System.out.println("출력할 줄 수를 입력해주세요.");
		System.out.print(">");
		int userNumber = scanner. nextInt();
		
		
		int iStart = 1;
		int iEnd = userNumber; //사용자가 5를 넣음
		
		for(int i =iStart; i<=iEnd; i++) {
			
			String stars ="";
			
			//공백을 담당하는 j for문
			int jStars = 1; 
			int jEnd = userNumber - i;
			for (int j =jStars; j <=jEnd; j++) {
				stars += " ";
			}
			
			//별을 담당하는 j for문
			jStars = 1;
			jEnd = i;
			for (int j =jStars; j <=jEnd; j++) {
				stars += "*";
			}
			
			
			
			System.out.println(stars);
		}
		
		
		
		scanner.close();
		
	}
}
