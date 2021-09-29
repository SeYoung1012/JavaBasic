package day0702;

import java.util.Scanner;

//별찍기 10번 
/*  *********
 *  **** ****
 *  ***   ***
 *  **     **
 *	*       *
 *  **     **
 *  ***   ***
 *  **** ****
 *  *********
 * 
 */
public class StarPrinter10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("별찍기 10번");
		System.out.println("출력할 줄 수를 입력해주세요.");
		System.out.print(">");
		int userNumber = scanner. nextInt();
		 
	        int iStart = 1;
	        int iEnd = 2 * userNumber - 1;

	        for (int i = 1; i <= iEnd; i++) {
	            String star = "*";

	            System.out.print("*");
	        }
	        System.out.println();

	        iStart = 1;
	        iEnd = userNumber - 1;
	        for (int i = iStart; i <= iEnd; i++) {
	            String stars = "";

	            int jStart = i;
	            int jEnd = userNumber - 1;

	            for (int j = jStart; j <= jEnd; j++) {
	                stars += "*";
	            }

	            jStart = 1;
	            jEnd = 2 * i - 1;

	            for (int j = jStart; j <= jEnd; j++) {
	                stars += " ";
	            }


	            jStart = i;
	            jEnd = userNumber - 1;

	            for (int j = jStart; j <= jEnd; j++) {
	                stars += "*";
	            }

	            System.out.println(stars);
	        }

	        iEnd = userNumber - 2;

	        for (int i = iStart; i <= iEnd; i++) {
	            String stars = "";

	            int jStart = 1;
	            int jEnd = i + 1;

	            for (int j = jStart; j <= jEnd; j++) {
	                stars += "*";
	            }

	            jStart = 2 * i - 5;
	            jEnd = 1;
	            for (int j = jStart; j <= jEnd; j++) {
	                stars += " ";
	            }
	            
	            jStart = 1;
	            jEnd = i + 1;
	            for (int j = jStart; j <= jEnd; j++) {
	                stars += "*";
	            }

	            System.out.println(stars);
	        }
	        
	        iStart = 1;
	        iEnd = 2 * userNumber - 1;
	        
	        for (int i = 1; i <= iEnd; i++) {
	            String star = "*";

	            System.out.print("*");
	        }
		
		scanner.close();
		
	}

}
