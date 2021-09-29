package day0702;
//별찍기 8번
/*     *
 *    **
 * 	 ***
 * 	****
 * *****
 *  ****
 *   ***
 *    **
 *     *
 * 
 * 
 */

import java.util.Scanner;

public class StarPrinter08 {

	public static void main(String[] args) {

Scanner scanner = new Scanner (System.in);
		
		System.out.println("별찍기 8번");
		System.out.println("출력할 줄 수를 입력해주세요.");
		System.out.print(">");
		int userNumber = scanner. nextInt();
		
		int iStart = 1;
		int iEnd = userNumber; 
		
		for(int i =iStart; i<=iEnd; i++) {
			
			String stars ="";
			
			
			int jStars = 1; 
			int jEnd = userNumber - i;
			for (int j =jStars; j <=jEnd; j++) {
				stars += " ";
			}
			
			jStars = 1;
			jEnd = i;
			for (int j =jStars; j <=jEnd; j++) {
				stars += "*";
			}
			
			System.out.println(stars);
		}
		
		 for (int i = iStart; i <= iEnd; i++) {
	            String stars = "";

	           
	            int jStart = 1;
	            int jEnd = i;

	            for (int j = jStart; j <= jEnd; j++) {
	                stars += " ";
	            }
	            jStart = i;
	            jEnd = userNumber-1; 

	            for (int j = jStart; j <= jEnd; j++) {
	                stars += "*";
	            }

	            System.out.println(stars);
	        }
		
		scanner.close();
		
	}
}	
	
	
		
		