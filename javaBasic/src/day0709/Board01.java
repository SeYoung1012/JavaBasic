package day0709;
//게시판 프로그램을 작성하시오

//게시글에는
//글 번호, 제목, 작성자, 내용이 들어가며
//글 번호는 자동으로 부여됩니다
//또한 목록보기 기능이 있으며
//목록보기 기능을 실행시에는
//인덱스. 제목이 출력되며
//개별 글 보기 기능이 있어야 합니다
//또한 개별 글 수정/삭제 기능이 있어야 합니다.

import java.util.Scanner;

import util.ArrayUtil;
import util.ScannerUtil;

public class Board01 {

	// 변수
	// Scanner 클래스 변수
	static Scanner scanner = new Scanner(System.in);
	// 번호 배열
	static int[] idArray = new int[0];
	static int id = 1;
	// 제목, 작성자, 내용 배열
	static String[] titleArray = new String[0];
	static String[] writeArray = new String[0];
	static String[] contentArray = new String[0];
	// 다음에 입력할 인덱스
	static int index = 0;

	public static void main(String[] args) {
		showMenu();
	}

	public static void showMenu() {
		String message = "1. 입력 2. 출력 3. 종료";
		while (true) {
			int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
			if (userChoice == 1) {
				insert();

			} else if (userChoice == 2) {
				print();

			} else if (userChoice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
		}

		scanner.close();
	}

	public static void insert() {
		// 각종 입력 시 출력 메시지를 저장할 String 변수
		String message;

		// 번호
		idArray = ArrayUtil.add(idArray, id++);

		// 제목
		message = "제목을 입력해주세요.";
		String name = ScannerUtil.nextLine(scanner, message);
		titleArray = ArrayUtil.add(titleArray, name);

		// 작성자
		message = "작성자를 입력해주세요.";
		String write = ScannerUtil.nextLine(scanner, message);
		writeArray = ArrayUtil.add(writeArray, write);

		// 내용
		message = "내용을 입력해주세요.";
		String content = ScannerUtil.nextLine(scanner, message);
		contentArray = ArrayUtil.add(contentArray, content);
	}

	public static void print() {
		if (ArrayUtil.isEmpty(idArray)) {
			System.out.println("아직 입력된 내용이 존재하지 않습니다");
		} else {
			for (int i = 0; i < idArray.length; i++) {
				// printByIndex(i);
				System.out.printf("%d. %s\n", i + 1, titleArray[i]);
			}
			String message = "상세보기 할 번호를 입력하세요\n뒤로 가시려면 0을 눌러주세요.";
			int userChoice = ScannerUtil.nextInt(scanner, message, 0, idArray.length) - 1;
			if (userChoice != -1) { // 뒤로가기
				printByIndex(userChoice); // 기능
			}
		}
	}

	public static void printByIndex(int index) {
		int id = ArrayUtil.get(idArray, index);
		String title = ArrayUtil.get(titleArray, index);
		String write = ArrayUtil.get(writeArray, index);
		String content = ArrayUtil.get(contentArray, index);
		System.out.printf("번호: %d번 제목: %s 작성자: %s\n", id, title, write);
		System.out.printf("내용: %s\n", content);

		String message = "1.수정 2. 삭제 3. 뒤로가기";
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
			String message;
			message = "새로운 제목를 입력해주세요(기존 제목: " + titleArray[index];
			titleArray[index] = ScannerUtil.nextLine(scanner,  message);
			
			message = "새로운 작성자를 입력해주세요(기존 작성자: " + writeArray[index];
			writeArray[index] = ScannerUtil.nextLine(scanner,  message);
			
			message = "새로운 내용 입력해주세요(기존 내용: " + contentArray[index];
			contentArray[index] = ScannerUtil.nextLine(scanner,  message);
		
			printByIndex(index);
			
		}
	    
	    
	    
	    public static void delete(int index) {
			String message = "정말로 삭제하시겠습니다? (1: 예 2: 아니오)";
			int userChoice = ScannerUtil.nextInt(scanner, message);
			if(userChoice == 1) {
				idArray = ArrayUtil.remove(idArray, index);
				titleArray = ArrayUtil.remove(titleArray, index);
				writeArray = ArrayUtil.remove(writeArray, index);
				contentArray = ArrayUtil.remove(contentArray, index);
				print(); 
			} else {
				printByIndex(index);
			}
			
		}

	}


