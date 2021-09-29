package day0702;
//별찍기 2번
/*		*****
 * 		****
 * 		***
 * 		**
 * 		*
 * 
 */

import java.util.Scanner;
public class StarPrinter02 {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("별찍기 2번");
		System.out.println("출력할 줄 수를 입력해주세요.");
		System.out.print(">");
		int userNumber = scanner. nextInt();
		
		int iStart = 1;
		int iEnd = userNumber;
		
		for(int i =iStart; i<=iEnd; i++) {
			String stars ="";
			
			int jStart = i;
			int jEnd = userNumber;
			for (int j =jStart; j <=jEnd; j++) {
				stars +="*";
			}
			System.out.println(stars);
		}
			
			
		
		
		scanner.close();
		
	}
}

