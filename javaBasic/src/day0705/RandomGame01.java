package day0705;
//숙제 2. 숫자 맞추기 게임에서 점수를 총 5개까지 보관하고

//점수는 자동으로 오름차순 정렬해서 보여주게 만들어 주는 프로그램

import java.util.Random;
import java.util.Scanner;

public class RandomGame01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		// 변수
		// 1.사용자가 입력 가능한 최소값을 저장한 int상수
		final int NUMBER_MIN = 1;
		// 2.사용자가 입력 가능한 최대값을 저장한 int 상수
		final int NUMBER_MAX = 100;
		// 3.5개 점수를 저장한 int 상수
		final int USER_CHOICE = 5;
		// 변수
		// 1.컴퓨터 숫자를 저장할 배열
		int[] computerArray = new int[USER_CHOICE];
		// 2. 사용자 숫자를 저장할 배열
		int[] userArray = new int[USER_CHOICE];

		// int 변수
		int index = 0;

		while (true) {

			System.out.println("1. 플레이 하기 2. 5개 숫자 3. 종료");
			System.out.print("> ");

			int userChoice = scanner.nextInt();

			if (userChoice == 1) {
				// 입력 코드
				int computerNumber = random.nextInt(NUMBER_MAX) + 1;

				int userNumber = 0;
				int currentScore = 0;

				// .3.userNumber가 computerNumber와 다르면
				// while을 반복한다.
				while (userNumber != computerNumber) {
					// 사용자로부터 숫자를 입력받아 검증한다.
					System.out.println("1~100사이의 숫자를 입력해주세요.");
					userNumber = scanner.nextInt();

					while (!(userNumber >= NUMBER_MIN && userNumber <= NUMBER_MAX)) {
						System.out.println("잘못입력하셨습니다.");
						System.out.println("1~100사이의 숫자를 입력하세요.");
						userNumber = scanner.nextInt();

					}
					// 사용자의 숫자와 컴퓨터의 숫자를 비교하여
					// UP 혹은 DOWN을 입력한다.
					if (userNumber < computerNumber) {
						System.out.println("UP");
					} else if (userNumber > computerNumber) {
						System.out.println("DOWN");
					}
				}

			} else if (userChoice == 2) {
				// 출력 코드
				if (index == 0) {
					// 아직 숫자가 입력이 안되어있는 상태
					System.out.println("아직 숫자가 입력되지 않았습니다.");

				} else {
					// 한 번은 입력되어 있는 상태인데
					// 한번 입력해도 저장이 안됨.출력도 안됨.
					System.out.println("-----------------------------");
					System.out.println("사용자 숫자");
					System.out.println("-----------------------------");
					for (int i = 0; i < userArray.length; i++) {
						System.out.printf("[%2d] ", userArray[i]);
					}
					System.out.println();
					
					for (int i = 0; i < userArray.length - 1; i++) {
						if(userArray[i] > userArray [i+1]) {
							int temp = userArray[i];
							userArray[i] = userArray[i+1];
							userArray[i+1] = temp;
							i = -1;
						}
						
					}
					for (int i = 0; i < userArray.length; i++) {
						System.out.printf("5개의 숫자", i, userArray[i]);
					}
				}
			}

			else if (userChoice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
		}

		scanner.close();
	}
}