package day0705;
//사용자로부터 로또 숫자를 입력 받아 정렬하여 출력하는 프로그램. 

//단 사용자가 1~45를 벗어나거나 중복된 숫자를 입력할 수 없도록 합니다. 
//4시 10분까지 

import java.util.Random;
import java.util.Scanner;

public class LottoGame04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		final int SIZE = 6;
		final int NUMBER_MIN = 1;
		final int NUMBER_MAX = 45;

		// 숫자를 저장할 int 배열
		int[] numbers = new int[SIZE];
		
		//for 문을 사용하여 숫자를 입력 받는다. 
		
		for(int i = 0; i <numbers.length; i++) {
			//	1.	숫자를 입력 받는다. 
			System.out.printf("%d번째 숫자\n" , i +1);
			System.out.println("1~45사이의 숫자를 입력해주세요.");
			int number = scanner.nextInt();
			
			
			//	2.	숫자가 올바르면 true , 올바르지 않으면 false 를 가질 
			//		boolean 변수 
			boolean numberCheck = true;
			
			//	3.	해당 숫자가 배열에 존재하는 지 체크한다. 
			
			numberCheck = (number >= NUMBER_MIN && number <=NUMBER_MAX);
			
			//4. 해당 숫자가 배열에 존재하는 지 체크한다.중복된 숫자 체크.
			
			for(int j = 0; j < numbers.length; j++) {
				if(number == numbers[j]) {
					numberCheck = false;
					
				}
			}
			
			//	5.	만약 숫자가 범위를 벗어나거나
			//		배열에 이미 존재하면
			//		경고 메세지를 출력하고
			//		i를 1 감소 시킨다. 
			if(numberCheck) {
				numbers [i] = number;
				
			}else {
				System.out.println("범위를 벗어나거나 중복인 숫자입니다. ");
				i--;
			}
			
		}
		for(int i = 0; i <numbers.length -1; i++) {
			if(numbers[i] > numbers[i+1]) {
				int temp = numbers[i];
				numbers[i] = numbers[i+1];
				numbers[i+1] = temp;
				i = -1;
			}
		}
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.printf(" numbers [%d] :%d\n ", i, numbers[i]);
		}
		
		scanner.close();
	}

}
