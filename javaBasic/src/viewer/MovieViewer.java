package viewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import controller.MovieController;
import model.MovieDTO;
import util.ScannerUtil;



public class MovieViewer {

	private MovieController movieController;
	private MovieDTO movieDTO;
	private Scanner scanner;
	private CinemaViewer cinemaViewer;

	public MovieViewer() {

		movieController = new MovieController();
		movieDTO  = new MovieDTO(); 
		scanner = new Scanner(System.in);
		cinemaViewer = new CinemaViewer();

	}
	
	public static void main(String[] args) {
		   MovieViewer movieViewer = new MovieViewer();
	       movieViewer.showMenu();
	    }

	public void showMenu() {
		String message = new String("1. 영화 목록 보기 2. 극장목록보기 3. 종료");
		ArrayList<MovieDTO> temp = movieController.selectAll();
		while (true) {
			int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
			if (userChoice == 1) {
				printList(temp);
			} else if (userChoice == 2) {
				cinemaViewer.insert();	
			} else if (userChoice == 3) {
				System.out.println("사용해주셔서 감사합니다.");
				scanner.close();
				break;
			}

		}
	}

	public void insert() {
		ArrayList<MovieDTO> temp = movieController.selectAll();

		while (true) {
			String message = new String("1. 영화 2. 극장 3. 상영정보 4.  ");
			int adminChoice = ScannerUtil.nextInt(scanner, message, 1, 2);

			if (adminChoice == 1) {

			} else if (adminChoice == 2) {
				

			} else if(adminChoice ==3) {
				System.out.println("사용해주셔서 감사합니다. ");
				scanner.close();
				break;
				
			}

		}

	}

	// 관리자 영화등록
	public void movieUp() {
		String message;
		MovieDTO v = new MovieDTO();

		message = new String("영화 제목을 입력해주세요.");
		String title = ScannerUtil.nextLine(scanner, message);
		v.setTitle(title);

		message = new String("영화 줄거리를 입력해주세요.");
		String story = ScannerUtil.nextLine(scanner, message);
		v.setStory(story);

		message = new String("영화 등급을 입력해주세요.");
		String movieGrade = ScannerUtil.nextLine(scanner, message);
		v.setMovieGrade(movieGrade);

		movieController.insert(v);

	}

	private void printAll() {

	}

	// 영화 목록보기
	public void printList(ArrayList<MovieDTO> list) {
		if (list.isEmpty()) {
			System.out.println("---------------------------");

			System.out.println("아직 등록된 글이 없습니다.");
		} else {
			for (MovieDTO v : list) {
				System.out.printf("제목 : %s 영화등급 : %s \n", v.getTitle(), v.getMovieGrade());
				System.out.printf("줄거리 : %s ", v.getStory());
				System.out.println();

			}
			while (true) {
				String message = new String("1. 영화 개별보기 2. 뒤로  ");
				int userChoice = ScannerUtil.nextInt(scanner, message, 1, 2);
				if (userChoice == 1) {
					printOne(movieDTO.getId());
				} else if (userChoice == 2) {
					showMenu();

				}

			}
		}

	}

	// 영화 개별 보기
	public void printOne(int id) {
		MovieDTO v = new MovieDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m:s");
		System.out.println("===========================");
		System.out.printf("제목 : %s 영화등급 : %s \n", v.getTitle(), v.getMovieGrade());
		System.out.printf("줄거리 : %s ", v.getStory());
		System.out.println("===========================");
		System.out.printf("일반 관람객 평점 : %s ", v.getStory());
		System.out.printf("평론가 평점 : %s ", v.getStory());
		System.out.printf("상영정보  : %s ", v.getStory());

	}

	// 관리자 영화 수정
	private void update(int id) {
		String message;

		message = new String("새로운 제목을 입력해주세요.");
		String title = ScannerUtil.nextLine(scanner, message);

		message = new String("새로운 내용을 입력해주세요.");
		String story = ScannerUtil.nextLine(scanner, message);

		message = new String("새로운 영화 등급을 입력해주세요.");
		String movieGrade = ScannerUtil.nextLine(scanner, message);

		message = new String("정말로 수정하시겠습니까? y/n");
		String yesNo = ScannerUtil.nextLine(scanner, message);

		if (yesNo.equalsIgnoreCase("y")) {
			MovieDTO v = new MovieDTO();
			v.setTitle(title);
			v.setStory(story);
			v.setMovieGrade(movieGrade);
			movieController.update(v);
		}

		printOne(id);
	}

	// 관리자 영화 삭제
	private void delete(int id) {
		String message = new String("정말로 삭제하시겠습니까? y/n");
		String yesNo = ScannerUtil.nextLine(scanner, message);
		if (yesNo.equalsIgnoreCase("y")) {
			movieController.delete(id);
			printAll();
		} else {
			printOne(id);
		}

	}

}