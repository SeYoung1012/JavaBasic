package viewer;

import java.util.Scanner;

import controller.MemberController;
import model.MemberDTO;
import util.ScannerUtil;

public class MemberViewer {

	private Scanner scanner;
	private MemberController memberController;
	private MemberDTO logIn;
	private MemberDTO memberDTO;

	public MemberViewer() {
		memberController = new MemberController();
		memberDTO = new MemberDTO();
		scanner = new Scanner(System.in);
	}

	public void showIndex() {
		String message = new String("1. 로그인 2. 회원가입 3. 종료");
		while (true) {
			int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
			if (userChoice == 1) {
				logIn();

			} else if (userChoice == 2) {
				choiceMember();

			} else if (userChoice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				scanner.close();
				break;
			}
		}
	}
	public static void main(String[] args) {
		   MemberViewer memberViewer = new MemberViewer();
	       memberViewer.showIndex();
	    }
		
	
	public void choiceMember() { // 유저 등급 설정
		String message = "선택하세요";
		message = new String("1. 일반회원 2. 평론가 3. 관리자 4. 뒤로가기");
		while (true) {
			int userChoice = ScannerUtil.nextInt(scanner, message, 1, 4);
			if (userChoice == 1) {
				memberDTO.setUserGrade(0);
				register();

			} else if (userChoice == 2) {
				memberDTO.setUserGrade(1);
				register();

			} else if (userChoice == 3) {
				memberDTO.setUserGrade(2);
				register();

			} else if (userChoice == 4) {
				break;
			}
		}
	}

	public void register() {
		String message;
		MemberDTO m = new MemberDTO();

		// 사용할 username 입력
		message = new String("사용하실 아이디를 입력해주세요.");
		String username = ScannerUtil.nextLine(scanner, message);

		// username 검증
		while (memberController.validateUsername(username)) {
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
			m.setUsername(username);
			m.setPassword(password);
			m.setNickname(nickname);

			// 컨트롤러에 u 추가
			memberController.insert(m);
		}
	}

	public MemberDTO logIn() {
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
		while (memberController.logIn(username, password) == null) {
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
			return memberController.logIn(username, password);

		}

		return null;

	}

	private void showMenu() {
		String message = new String("1. 정보 보기 2. 정보 수정 3. 회원 탈퇴 4. 로그아웃");
		while (true) {
			int userChoice = ScannerUtil.nextInt(scanner, message, 1, 4);
			if (userChoice == 1) {
				// 정보 보기 메소드 호출
				printOne();
			} else if (userChoice == 2) {
				// 정보 수정 메소드 호출
				update();
			} else if (userChoice == 3) {
				delete();
			} else if (userChoice == 4) {
				logOut();
			}

			if (logIn == null) {
				// 사용자가 회원 탈퇴를 했거나 로그아웃을 한 상태이므로
				// 무한루프를 종료 시킨다.
				break;
			}
		}
	}

	private void printOne() {
		System.out.println("---------------------------------");
		System.out.println("회원 번호: " + logIn.getId());
		System.out.println("회원 아이디: " + logIn.getUsername());
		System.out.println("회원 닉네임: " + logIn.getNickname());
		System.out.println("---------------------------------");
		String message = new String("1. 수정 2. 회원 탈퇴 3. 뒤로 가기");
		int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
		if (userChoice == 1) {
			update();
		} else if (userChoice == 2) {
			delete();
		}
	}

	private void update() {
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
			if (!password.isEmpty()) {
				logIn.setPassword(password);
			}

			if (!nickname.isEmpty()) {
				logIn.setNickname(nickname);
			}

			memberController.update(logIn);
		}

	}

	private void delete() {
		String message = new String("정말로 탈퇴하시겠습니까? y/n");
		String yesNo = ScannerUtil.nextLine(scanner, message);
		if (yesNo.equalsIgnoreCase("y")) {
			memberController.delete(logIn.getId());
			logIn = null;
		}
	}

	private void logOut() {
		System.out.println("정상적으로 로그아웃 되셨습니다.");
		logIn = null;
	}

	public MemberDTO selectById(int id) {
		return memberController.selectOne(id);
	}

}