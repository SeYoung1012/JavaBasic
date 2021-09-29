package day0630;
//사용자로부터 성별, 나이, 신체등급순으로 입력 받아서

//현역, 공익, 면제를 출력해주는 프로그램.
//조건1. 단, 사용자가 성별을 입력할 때. 여성으로 입력하는 경우,
//		 추가적인 입력 없이
//		"여성에게는 국방의 의무가 부여되지 않습니다." 만 출력되게 하시오.
//조건2. 단, 사용자가 남성이지만 미성년자일 경우,
//		추가적인 입력 없이
//		"미성년자는 아직 신체 등급이 부여되지 않습니다."만 출력되게 하시오.
//	현역 1~3급
//	공익: 4급
//	면제: 그외

//	성별을 입력 받을 때에는
//1이면 남자 2면 여자로 입력 받읍시다.

import java.util.Scanner;

public class ArmyPrinter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1. 사용자로부터 성별을 입력받는다.
		System.out.println("성별을 입력해주세요.(1은 남자,2는 여자)");
		System.out.print(" > ");
		int gender = scanner.nextInt();

		if (gender == 1) {
			// 1-1 남성일 경우 나이를 입력받는다.
			System.out.println("나이를 입력해주세요.");
			System.out.print("> ");
			int age = scanner.nextInt();

			if (age >= 19) {
				// 2-1 나이가 성인일 경우, 신체 등급을 받는다.
				System.out.println("신체등급을 입력해주세요.");
				System.out.print("> ");
				int category = scanner.nextInt();

				// 3. 카테고리의 값에 맞춰서
				// 현역, 공익, 면제를 출력한다.
				if (category <= 3) {
					System.out.println("현역입니다.");
				} else if (category == 4) {
					System.out.println("공익입니다.");
				} else {
					System.out.println("면제입니다.");
				}

			} else {
				// 2-2나이가 미성년자 일 경우 메시지만 출력한다.
				System.out.println("아직 미성년자에게는 신체등급이 존재하지 않습니다.");
			}

		} else {
			// 1-2 여성일 경우 메시지만 출력한다.
			System.out.println("여성에게는 국방의 의무가 주어지지 않습니다.");
		}

		scanner.close();

	}

}
