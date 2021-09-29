package viewer;

import java.util.Scanner;

import controller.UserController;
import model.UserDTO;
import util.ScannerUtil;

public class UserViewer {
	private UserController userController;
	private Scanner scanner;
	private BoardViewer boardViewer;
	private ReplyViewer replyViewer;

	public UserViewer() {
		userController = new UserController();
		scanner = new Scanner(System.in);
	}

	public void setBoardViewer(BoardViewer boardViewer) {
		this.boardViewer = boardViewer;
	}

	public void setReplyViewer(ReplyViewer replyViewer) {
		this.replyViewer = replyViewer;
	}

	public void register() {
		String message;
		UserDTO u = new UserDTO();

		// 사용할 username 입력
		message = new String("사용하실 아이디를 입력해주세요.");
		String username = ScannerUtil.nextLine(scanner, message);

		// username 검증
		while (userController.validateUsername(username)) {
			System.out.println("해당 아이디는 사용하실 수 없습니다.");
			System.out.println("만약 회원가입을 원치 않으시면 x를 입력해주세요.");
			username = ScannerUtil.nextLine(scanner, message);
			if (username.equalsIgnoreCase("x")) {
				break;
			}
		}

		// username의 현재값이 대소문자 구분 없이 x가 아닐 경우
		if (!username.equalsIgnoreCase("x")) {
			// 사용할 비밀번호 입력
			message = new String("사용하실 비밀번호를 입력해주세요.");
			String password = ScannerUtil.nextLine(scanner, message);

			// 사용할 닉네임 입력
			message = new String("사용하실 닉네임을 입력해주세요.");
			String nickname = ScannerUtil.nextLine(scanner, message);

			// 입력 받은 값들을 u에 저장
			u.setUsername(username);
			u.setPassword(password);
			u.setNickname(nickname);

			// 컨트롤러에 u 추가
			userController.insert(u);
		}
	}

	public UserDTO logIn() {
		String message;
		// username 입력 받는다.
		message = new String("ID: ");
		String username = ScannerUtil.nextLine(scanner, message);

		// password 입력 받는다.
		message = new String("PW: ");
		String password = ScannerUtil.nextLine(scanner, message);

		// 일치하는 회원이 나올 때 까지
		// 다시 username과 password를 입력 받거나
		// 아니면 사용자가 더이상 로그인을 원하지 않는지 입력 받는다.
		while (userController.logIn(username, password) == null) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("아이디와 비밀번호를 다시 확인해주세요.");

			message = new String("아이디를 입력하시거나 뒤로 가실려면 x를 눌러주세요.");
			username = ScannerUtil.nextLine(scanner, message);

			if (username.equalsIgnoreCase("x")) {
				break;
			}

			message = new String("비밀번호를 입력해주세요.");
			password = ScannerUtil.nextLine(scanner, message);

		}

		if (!username.equalsIgnoreCase("x")) {
			// 사용자가 로그인을 원하고 일치하는 회원이 나왔을 경우
			// 해당 회원으로 UserDTO logIn 객체를 초기화한다.
			return userController.logIn(username, password);

		}

		return null;

	}

	public UserDTO printOne(int id) {
		UserDTO u = userController.selectOne(id);
		System.out.println("---------------------------------");
		System.out.println("회원 번호: " + u.getId());
		System.out.println("회원 아이디: " + u.getUsername());
		System.out.println("회원 닉네임: " + u.getNickname());
		System.out.println("---------------------------------");

		String message = new String("1. 작성글 보기 2. 작성댓글 보기 3. 수정 4. 회원 탈퇴 5. 뒤로 가기");

		int userChoice = ScannerUtil.nextInt(scanner, message, 1, 4);
		if (userChoice == 1) {
			boardViewer.printUserBoard(id);
		} else if (userChoice == 2) {
			replyViewer.printUserReply(id);
		} else if (userChoice == 3) {
			update(id);
		} else if (userChoice == 4) {
			u = delete(id);
		}

		return u;
	}

	private void update(int id) {
		String message = new String("비밀번호를 수정 하시겠습니까? y/n");
		String yesNo = ScannerUtil.nextLine(scanner, message);
		String password = new String();
		if (yesNo.equalsIgnoreCase("y")) {
			message = new String("새로운 비밀번호를 입력해주세요.");
			password = ScannerUtil.nextLine(scanner, message);
		}

		message = new String("닉네임을 수정 하시겠습니까? y/n");
		yesNo = ScannerUtil.nextLine(scanner, message);
		String nickname = new String();
		if (yesNo.equalsIgnoreCase("y")) {
			message = new String("새로운 닉네임을 입력해주세요.");
			nickname = ScannerUtil.nextLine(scanner, message);
		}

		message = new String("입력하신 정보로 수정 하시겠습니까? y/n");
		yesNo = ScannerUtil.nextLine(scanner, message);
		if (yesNo.equalsIgnoreCase("y")) {
			UserDTO u = userController.selectOne(id);

			if (!password.isEmpty()) {
				u.setPassword(password);
			}

			if (!nickname.isEmpty()) {
				u.setNickname(nickname);
			}

			userController.update(u);
		}

	}

	private UserDTO delete(int id) {
		String message = new String("정말로 탈퇴하시겠습니까? y/n");
		String yesNo = ScannerUtil.nextLine(scanner, message);
		if (yesNo.equalsIgnoreCase("y")) {
			// 해당 회원 번호를 작성자 회원 번호로 가진
			// 게시글 삭제를 할 메소드를 여기서 실행시킨다.
			boardViewer.deleteByWriterId(id);
			replyViewer.updateWriterId(id);
			userController.delete(id);
			return null;
		}

		return userController.selectOne(id);
	}

	public UserDTO selectById(int id) {
		return userController.selectOne(id);
	}
}