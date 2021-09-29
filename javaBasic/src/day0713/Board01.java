package day0713;
//게시판 프로그램에 입력날짜와 수정날짜를 추가하여 Board.java를 개조하여

//사용자가 글을 입력하면 자동으로 입력날짜 수정날자가 입력시간으로 입력되고
//사용자가 해당 글을 수정하면 자동으로 수정날짜가 수정시간으로 바뀌게 되는 프로그램을 만드시오
//단 주요 기능들 중 글 개별 보기나 수정 삭제는 인덱스가 아닌 글 번호로 접근하고
//그 외의 기능들은 기존 프로그램에서 복사 붙여넣기 하셔도 됩니다. 

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import type.Board;
import util.ScannerUtil;


public class Board01 {
	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Board> list = new ArrayList<>();
	private static int nextId= 1001;

	public static void main(String[] args) {
		showMenu();

	}

	private static void showMenu() {
		String message = new String("1. 입력 2. 출력 3. 종료");
		while (true) {
			int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
			
			if (userChoice == 1) {
				// 입력 메소드 실행
				insert();

			} else if (userChoice == 2) {
				// 출력 메소드 실행
				printAll();

			} else if (userChoice == 3) {
				// 메세지 출력 후 종료
				System.out.println("사용해주셔서 감사합니다. ");
				scanner.close();
				break;
			}

		}
		
	}
	private static void insert() {
		// 정보를 담아주는 Employee 객체 생성
		Board b = new Board();

		// 입력시 출력할 메세지를 담을 String 객체 생성
		

		// 글 번호 등록
		b.setId(nextId++);

		// 글 제목 등록
		String message = new String("제목을 입력해주세요.");
		b.setTitle(ScannerUtil.nextLine(scanner, message));

		//글 작성자 등록
		message = new String("작성자를 입력해주세요.");
		b.setWriter(ScannerUtil.nextLine(scanner, message));

		// 글 내용 등록 
		message = new String("내용을 입력해주세요.");
		b.setContent(ScannerUtil.nextLine(scanner, message));
		
		//글 작성 시간 등록
		b.setWrittenDate(Calendar.getInstance());
		
		//글 수정 시간 등록
		b.setUpdatedDate(Calendar.getInstance());
		
		// Employee 객체를 list에 저장
		list.add(b);

	}
	
	private static Board selectById(int id) {

		Board b = new Board();
		b.setId(id);
		if (list.contains(b)) {
			return list.get(list.indexOf(b));

		}

		return null;

	}

	private static void printAll() {
		if (list.isEmpty()) {
			System.out.println("아직 등록된 글이 존재하지 않습니다.");

		} else {
			
			for (int i = 0; i < list.size(); i++) {
				Board b =list.get(i);
				System.out.printf("%d. %s 작성자\n ", b.getId(), b.getWriter());
			}
			String message = new String("상세보기 할 글 번호나 뒤로 가시려면 0을 입력해주세요.");
			
			int userChoice = ScannerUtil.nextInt(scanner, message);

			while (selectById(userChoice) == null && userChoice != 0) {
				System.out.println("잘못 입력하셨습니다. ");
				userChoice = ScannerUtil.nextInt(scanner, message);

			}
			if (userChoice != 0) {
				printOne(userChoice);

			}

		}

	}

	

	private static void printOne(int id) {
		
		Board b = selectById(id);
		b.printInfo();
		String messagr = new String("1. 수정 2. 삭제 3. 뒤로가기");
		int userChoice = ScannerUtil.nextInt(scanner, messagr, 1, 3);
		if (userChoice == 1) {
			update(id);

		} else if (userChoice == 2) {
			delete(id);

		} else if (userChoice == 3) {
			printAll();
		}

	}

	private static void update(int id) {
		Board b = selectById(id);
		String message;
		

		// 제목 수정
		message = new String("새로운 제목을 입력해주세요.");
		String title = ScannerUtil.nextLine(scanner, message);
		b.setTitle(title);

		// 내용 수정
		message = new String("새로운 내용을 입력해주세요.");
		String content = ScannerUtil.nextLine(scanner, message);
		b.setContent(content);
		
		//시간 수정
		b.setUpdatedDate(Calendar.getInstance());
		
		printOne(id);

	}

	private static void delete(int id) {
		Board b = selectById(id);
		String message = new String("정말로 삭제하시겠습니까? y/n");
		String yesNo = ScannerUtil.nextLine(scanner, message);
		if (yesNo.equalsIgnoreCase("y")) {
			list.remove(b);
			printAll();

		} else {
			printOne(id);
		}

	}

}
