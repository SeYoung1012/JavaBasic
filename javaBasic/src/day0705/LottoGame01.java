package day0705;

import java.util.Random;
import java.util.Scanner;

///로또 번호 생성기
//배열에 6개의 1~45 사이의 숫자를 담아서
//출력하는 프로그램을 작성해보시오
//45분까지
public class LottoGame01 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		//상수
		//로또 번호 수
		final int SIZE = 6;
		//최대 번호
		final int NUMBER_MAX = 45;
		
		//랜덤한 숫자를 담을 배열
		int [] numbers = new int[SIZE];
		
		//for문을 사용하여
		//각 인덱스에 랜덤 숫자를 넣어준다.
		for(int i = 0; i <numbers.length; i++) {
			numbers[i] =random.nextInt(NUMBER_MAX) +1;
		}
		//for문을 사용하여
		//모든 칸을 출력한다. 
		for(int i = 0; i <numbers.length; i++) {
			System.out.printf("numbers[%d] : %2d\n", i , numbers[i]);
		}
		
		
		scanner.close();
		
	}
	
	
}
