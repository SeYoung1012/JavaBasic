package viewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import controller.MemberController;
import controller.MovieInfoController;
import model.MovieDTO;
import model.MovieInfoDTO;
import util.ScannerUtil;

public class MovieInfoViewer {
	private MovieInfoDTO movieInfoDTO;
	private MovieInfoController movieInfocontroller;
	private Scanner scanner;
	private MovieViewer movieViewer;
	private MemberController memberController;
	private Calendar cal;
	private SimpleDateFormat sdf;

	public MovieInfoViewer() {
		movieInfocontroller = new MovieInfoController();
		movieInfoDTO = new MovieInfoDTO();
		scanner = new Scanner(System.in);
		movieViewer = new MovieViewer();

	}

	public static void main(String[] args) {
		MovieInfoViewer movieInfoViewer = new MovieInfoViewer();
		movieInfoViewer.printList();
	}

	// 상영 중인 영화 목록
	public void printList(ArrayList<MovieDTO> list) {
		if (list.isEmpty()) {
			System.out.println("---------------------------");

			System.out.println("아직 등록된 상영정보가 없습니다.");
		} else {
			for (MovieDTO m : list) {
				System.out.printf("영화 번호 : %d 영화 제목 : %s \n", m.getId(), m.getTitle());
				System.out.println();

			}

			while (true) {
				String message = new String("1. 상영 정보보기 2.뒤로");
				int userChoice = ScannerUtil.nextInt(scanner, message, 1, 2);
				if (userChoice == 1) {
					printOne(movieInfoDTO.getId());
				} else if (userChoice == 2) {
					break;
				}

			}

		}

	}

	// 상영 정보 프린트원
	public void printOne(int id) {
		MovieInfoDTO f = new MovieInfoDTO();
		MovieDTO m = new MovieDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m:s");
		System.out.println("===========================");
		System.out.printf("영화번호 : %d 영화 제목 : %s \n", m.getId(), m.getTitle());
		System.out.printf("상영 시간 : %s 종료 시간 : %s \n", sdf.format(f.getShowTime()), sdf.format(f.getCloseTime()));
		System.out.println("===========================");

	}

	// 관. 상영정보 등록

	public void movieUp() {
		String message = new String("상영 일을 입력해주세요.");
		cal.set(Calendar.DAY_OF_MONTH, ScannerUtil.nextInt(scanner, message));

		message = new String("상영 시간을 입력해주세요.");
		cal.set(Calendar.HOUR_OF_DAY, ScannerUtil.nextInt(scanner, message));

		message = new String("상영 분을 입력해주세요.");
		cal.set(Calendar.MINUTE, ScannerUtil.nextInt(scanner, message));

		// s에 입력받은 일 시 분을 삽입한다.
		n.setShowTime(sdf.format(cal.getTime()));

		movieInfocontroller.insert(n);

	}

	// 관. 상영정보 등록

	public void update() {

	}

	private void delete() {
		String message = new String("상영정보를 삭제하시겠습니까? y/n");
		String yesNo = ScannerUtil.nextLine(scanner, message);
		// if (yesNo.equalsIgnoreCase("y")) {
		// membController.delete(logIn.getId());
		// logIn = null;
	}
}

//}
