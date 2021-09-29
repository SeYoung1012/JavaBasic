package viewer;

import java.util.Scanner;

import model.UserDTO;
import util.ScannerUtil;

public class TotalViewer {
    private BoardViewer boardViewer;
    private UserViewer userViewer;
    private ReplyViewer replyViewer;
    private Scanner scanner;
    private UserDTO logIn;

    public TotalViewer() {
        boardViewer = new BoardViewer();
        userViewer = new UserViewer();
        replyViewer = new ReplyViewer();
        scanner = new Scanner(System.in);
    }

    public void showIndex() {
        String message = new String("1. 로그인 2. 회원가입 3. 종료");
        while (true) {
            int userChoice = ScannerUtil.nextInt(scanner, message);
            if (userChoice == 1) {
                // 로그인 메소드 실행 후
                // 해당 메소드의 리턴 값으로 필드 logIn을 초기화
                // logIn 객체가 null 이 아니면 메인 화면으로 이동
                logIn = userViewer.logIn();

                if (logIn != null) {
                    // 메뉴 메소드 호출
                    inject();
                    showMenu();
                }
            } else if (userChoice == 2) {
                // 회원 가입 메소드 실행
                userViewer.register();
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                scanner.close();
                break;
            }
        }
    }

    private void showMenu() {
        String message = new String("1. 게시판 가기 2. 자기 정보 보기 3. 로그아웃");
        while (true) {
            int userChoice = ScannerUtil.nextInt(scanner, message);
            if (userChoice == 1) {
                // 게시판 목록 보여주는 곳으로 이동
                boardViewer.printAll();
            } else if (userChoice == 2) {
                // 자기 정보 출력
                logIn = userViewer.printOne(logIn.getId());
            } else if (userChoice == 3) {
                System.out.println("정상적으로 로그아웃 되셨습니다.");
                logIn = null;
            }

            if (logIn == null) {
                break;
            }
        }
    }

    private void inject() {
        boardViewer.setLogIn(logIn);
        boardViewer.setUserViwer(userViewer);
        boardViewer.setReplyViewer(replyViewer);

        userViewer.setBoardViewer(boardViewer);
        userViewer.setReplyViewer(replyViewer);

        replyViewer.setUserViewer(userViewer);
        replyViewer.setLogIn(logIn);
    }
}