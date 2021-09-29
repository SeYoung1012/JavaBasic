package day0702;
//별찍기 9번
/*       *
 *      ***
 *     *****
 *    *******
 *   ********* 
 *    *******
 *     *****
 *      ***
 *       *
 * 
 */

import java.util.Scanner;

public class StarPrinter09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("별찍기 9번");
		System.out.println("출력할 줄 수를 입력해주세요.");
		System.out.print(">");
		int userNumber = scanner. nextInt();
		
		int iStart = 1;
		int iEnd =userNumber;
		
		
		for(int i =iStart; i<=iEnd; i++) { 
			String stars ="";
			
			int spaceWidth = userNumber - i;
			int starWidth = 2 * i -1;
			
			
			for (int j = 1; j <=spaceWidth; j++) {
				stars += " ";
			}
			
			
			for (int j = 1; j <=starWidth; j++) {
				stars += "*";
			}
			
			System.out.println(stars);
		}
		for(int i =userNumber; i>= 1; i--) { 
			String stars ="";
			
			int spaceWidth = userNumber - i +1;
			int starWidth = 2 * i -3;
			
			
			for (int j = 1; j <=spaceWidth; j++) {
				stars += " ";
			}
			
			for (int j = 1; j <=starWidth; j++) {
				stars += "*";
			}
			
			System.out.println(stars);
		}
		
		scanner.close();
		
	}
	
}

		
