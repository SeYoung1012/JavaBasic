package viewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import controller.BoardController;
import model.BoardDTO;
import model.UserDTO;
import util.ScannerUtil;

public class BoardViewer {
	private BoardController boardController;
	private Scanner scanner;
	private UserDTO logIn;
	private UserViewer userViewer;
	private ReplyViewer replyViewer;

	public BoardViewer() {
		boardController = new BoardController();
		scanner = new Scanner(System.in);
	}

	public void setLogIn(UserDTO logIn) {
		this.logIn = logIn;
	}

	public void setUserViwer(UserViewer userViewer) {
		this.userViewer = userViewer;
	}

	public void setReplyViewer(ReplyViewer replyViewer) {
		this.replyViewer = replyViewer;
	}

	private void insert() {
		BoardDTO b = new BoardDTO();
		String message;

		message = new String("제목을 입력해주세요.");
		String title = ScannerUtil.nextLine(scanner, message);
		b.setTitle(title);

		b.setWriterId(logIn.getId());

		message = new String("내용을 입력해주세요.");
		String content = ScannerUtil.nextLine(scanner, message);
		b.setContent(content);

		int id = boardController.insert(b);
		printOne(id);
	}

	public void printAll() {
		ArrayList<BoardDTO> temp = boardController.selectAll();

		printList(temp);

		String message;
		if (temp.isEmpty()) {
			message = new String("1. 새 글 쓰기 2. 뒤로 가기");
		} else {
			message = new String("1. 새 글 쓰기 2. 게시글 개별 보기 3. 뒤로");
		}

		// 사용자로부터 다음에 실행할 기능을 입력 받는다.
		int userChoice = ScannerUtil.nextInt(scanner, message);

		if (userChoice == 1) {
			// 사용자가 글 쓰기를 골랐을 경우, 새글 쓰기 메소드인
			// insert()를 실행시킨다.
			insert();
		} else if (!temp.isEmpty() && userChoice == 2) {
			// 글 목록이 저장되어있는 temp의 isEmpty()가 true가 아니고
			// 사용자가 2를 골랐을 경우에는
			// 사용자가 게시글 개별 보기를 선택한 경우이므로
			// 상세보기할 게시글 번호를 입력 받는다.
			int userInput = validateId();
			if (userInput != 0) {
				printOne(userInput);
			}
		}
	}

	public void printUserBoard(int writerId) {
		ArrayList<BoardDTO> temp = boardController.selectByWriterId(writerId);

		printList(temp);
	}

	// 파라미터로 들어온 어레이리스트를 '출력만' 해주는
	// printList(ArrayList<BoardDTO> list)
	public void printList(ArrayList<BoardDTO> list) {
		System.out.println("=====================================");
		System.out.println();
		if (list.isEmpty()) {
			System.out.println("아직 등록된 글이 없습니다.");
		} else {
			for (BoardDTO b : list) {
				UserDTO u = userViewer.selectById(b.getWriterId());

				System.out.printf("%d. %s - %s\n", b.getId(), b.getTitle(), u.getNickname());

			}
		}
		System.out.println();
		System.out.println("=====================================");
	}

	private int validateId() {
		String message = new String("상세보기할 글 번호나 뒤로갈려면 0을 입력해주세요.");
		int userInput = ScannerUtil.nextInt(scanner, message);
		while (userInput != 0 && boardController.selectOne(userInput) == null) {
			System.out.println("해당 글 번호는 유효하지 않습니다.");
			userInput = ScannerUtil.nextInt(scanner, message);
		}
		return userInput;
	}

	private void printOne(int id) {
		BoardDTO b = boardController.selectOne(id);
		SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m:s");
		System.out.println("===========================");
		System.out.println("제목: " + b.getTitle());
		UserDTO u = userViewer.selectById(b.getWriterId());
		System.out.printf("번호: %d 작성자: %s\n", b.getId(), u.getNickname());
		System.out.printf("작성일: %s 수정일: %s\n", sdf.format(b.getWrittenDate().getTime()),
				sdf.format(b.getUpdatedDate().getTime()));
		System.out.println("---------------------------");
		System.out.println(b.getContent());
		System.out.println("===========================");

		// 해당 게시글에 달린 댓글을 쭉 출력한다.
		replyViewer.printBoardReply(id);

		// 만약 로그인 한 유저가 해당 글의 작성자와 일치하는 경우,
		// 글 수정, 삭제 기능을 실행시킬수 있는
		// showBoardMenu() 메소드를 실행시킨다.
		// 아닐 경우에는 "1. 뒤로가기" 를 출력해서
		// 사용자가 목록으로 돌아가기만 가능하게 만들어준다.

		if (b.getWriterId() == logIn.getId()) {
			showBoardMenu(id);
		} else {
			String message = new String("1. 댓글 입력 2. 댓글 삭제 3. 뒤로가기");
			int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
			if (userChoice == 1) {
				// 댓글 입력을 담당하는
				// replyViewer의 메소드 실행
				replyViewer.insert(id);
			} else if (userChoice == 2) {
				// 댓글 삭제를 담당하는
				// replyViewer의 메소드 실행
				replyViewer.delete(id);
			}

			if (userChoice != 3) {
				printOne(id);
			}
		}

	}

	private void showBoardMenu(int id) {
		String message = new String("1. 수정 2. 삭제 3. 뒤로가기");
		int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
		if (userChoice == 1) {
			update(id);
		} else if (userChoice == 2) {
			delete(id);
		} else if (userChoice == 3) {
			printAll();
		}
	}

	private void update(int id) {
		String message;

		message = new String("새로운 제목을 입력해주세요.");
		String title = ScannerUtil.nextLine(scanner, message);

		message = new String("새로운 내용을 입력해주세요.");
		String content = ScannerUtil.nextLine(scanner, message);

		message = new String("정말로 수정하시겠습니까? y/n");
		String yesNo = ScannerUtil.nextLine(scanner, message);

		if (yesNo.equalsIgnoreCase("y")) {
			BoardDTO b = new BoardDTO();
			b.setId(id);
			b.setTitle(title);
			b.setContent(content);
			boardController.update(b);
		}

		printOne(id);
	}

	private void delete(int id) {
		String message = new String("정말로 삭제하시겠습니까? y/n");
		String yesNo = ScannerUtil.nextLine(scanner, message);
		if (yesNo.equalsIgnoreCase("y")) {
			boardController.delete(id);
			printAll();
		} else {
			printOne(id);
		}
	}

	public void deleteByWriterId(int writerId) {
		boardController.deleteByWriterId(writerId);
	}
}