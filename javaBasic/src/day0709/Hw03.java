package day0709;

import java.util.Scanner;

import type.Board;
import util.ScannerUtil;

public class Hw03 {

	// 전역 변수
	static Scanner scanner = new Scanner(System.in);
	static Board b = new Board();

	public static void main(String[] args) {
		// 메뉴 출력 메소드 호출
		showMenu();
	}

	public static void showMenu() {
		String message = "1. 입력 2. 출력 3. 종료";
		while (true) {
			int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
			if (userChoice == 1) {
				// 입력 메소드 호출
			//	insert();
			} else if (userChoice == 2) {
				// 출력 메소드 호출
			//	print();
			} else if (userChoice == 3) {
				// while 종료
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
		}

		scanner.close();
	}

/*	public static void insert() {
		// 각종 출력에 사용할 메시지
		String message;

		// 번호 입력
		b.idArray = ArrayUtil.add(b.idArray, b.id++);

		// 이름 입력
		message = "이름을 입력해주세요.";
		b.nameArray = ArrayUtil.add(b.nameArray, ScannerUtil.nextLine(scanner, message));

		// 직급 입력
		message = "부서를 입력해주세요.";
		b.departmentArray = ArrayUtil.add(b.departmentArray, ScannerUtil.nextLine(scanner, message));

		// 영어 점수 입력
		message = "직급을 입력해주세요.";
		b.rankArray = ArrayUtil.add(b.rankArray, ScannerUtil.nextLine(scanner, message));

		// 수학 점수 입력
		message = "연봉을 입력해주세요.";
		b.salaryArray = ArrayUtil.add(b.salaryArray, ScannerUtil.nextInt(scanner, message));
	}

	public static void print() {
		if (ArrayUtil.isEmpty(b.idArray)) {
			System.out.println("아직 입력된 학생이 존재하지 않습니다.");
		} else {
			for (int i = 0; i < b.idArray.length; i++) {
				System.out.printf("%d. %s\n", i + 1, b.nameArray[i]);
			}
			// 사용자로부터 몇번 인덱스의 학생을 볼지 입력을 받는다.
			// 단, 한가지 주의할 것은 사용자가 입력할 번호와
			// 실제 인덱스가 다르다라는 것이다!
			String message = "상세보기할 사원의 번호를 입력하세요.\n뒤로 가실려면 0을 눌러주세요.";
			int userChoice = ScannerUtil.nextInt(scanner, message, 0, b.idArray.length) - 1;
			if (userChoice != -1) {
				printByIndex(userChoice);
			}
		}
	}

	public static void printByIndex(int index) {
		int id = ArrayUtil.get(b.idArray, index);
		String name = ArrayUtil.get(b.nameArray, index);
		System.out.printf("번호: %d번 이름:%s\n", b.idArray, b.nameArray);
		String department = ArrayUtil.get(b.departmentArray, index);
		String rank = ArrayUtil.get(b.rankArray, index);
		int salary = ArrayUtil.get(b.salaryArray, index);
		System.out.printf("부서: %s점 직급: %s점 연봉: %4d점\n", b.departmentArray, b.rankArray, b.salaryArray);

		String message = "1. 수정 2. 삭제 3. 뒤로가기";
		int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);

		if (userChoice == 1) {
			// 수정 메소드 호출
			update(index);
		} else if (userChoice == 2) {
			// 삭제 메소드 호출
			delete(index);
		} else if (userChoice == 3) {
			print();
		}
	}

	public static void update(int index) {
		// 수정의 경우, 번호나 이름은 수정할 수 없고
		// 국어 영어 수학만 새로운 값을 입력 받도록 한다.
		String message;
		message = "새로운 부서를 입력해주세요(기존 부서: " + b.departmentArray[index] + "부서)";
		b.departmentArray[index] = ScannerUtil.nextLine(scanner, message);

		message = "새로운 직급을 입력해주세요(기존 직급: " + b.rankArray[index] + "직급)";
		b.rankArray[index] = ScannerUtil.nextLine(scanner, message);

		message = "새로운 연봉을 입력해주세요(기존 연봉: " + b.salaryArray[index] + "연봉)";
		b.salaryArray[index] = ScannerUtil.nextInt(scanner, message);

		printByIndex(index);
	}

	public static void delete(int index) {

		String message = "정말로 삭제하시겠습니까? (1: 예 2: 아니오)";
		int userChoice = ScannerUtil.nextInt(scanner, message);
		if (userChoice == 1) {

			b.idArray = ArrayUtil.remove(b.idArray, index);
			b.nameArray = ArrayUtil.remove(b.nameArray, index);
			b.departmentArray = ArrayUtil.remove(b.departmentArray, index);
			b.rankArray = ArrayUtil.remove(b.rankArray, index);
			b.salaryArray = ArrayUtil.remove(b.salaryArray, index);
			print();
		} else {
			// index번 학생 개별 보기로 돌아간다.
			printByIndex(index);
		}
	}

*/}
