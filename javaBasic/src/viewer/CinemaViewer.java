package viewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import controller.CinemaController;
import model.CinemaDTO;
import util.ScannerUtil;

public class CinemaViewer {
	private CinemaController cinemaController;
	private CinemaDTO cinemaDTO;
	private Scanner scanner;

	public CinemaViewer() {

		cinemaController = new CinemaController();
		cinemaDTO = new CinemaDTO();
		scanner = new Scanner(System.in);

	}

	public static void main(String[] args) {
		MovieViewer movieViewer = new MovieViewer();
		movieViewer.showMenu();
	}
	
	 public void insert() {
	        ArrayList<CinemaDTO> temp = cinemaController.selectAll();
	        printList(temp);
	    }
	
	
	 
	 

	private void printAll() {

	}

	// 극장 목록보기
	public void printList(ArrayList<CinemaDTO> list) {
		if (list.isEmpty()) {
			System.out.println("---------------------------");

			System.out.println("아직 등록된 극장이 없습니다.");
		} else {
			for (CinemaDTO c : list) {
				 System.out.printf("극장 번호 : %d 극장명 : %s 극장장소 : %s \n", c.getId(), c.getCinemaName(), c.getCinemaMap());
				

				System.out.println();

			}

			while (true) {
				String message = new String("1. 극장개별보기 2.뒤로");
				int userChoice = ScannerUtil.nextInt(scanner, message, 1, 2);
				if (userChoice == 1) {
					printOne(cinemaDTO.getId());
				} else if (userChoice == 2) {
					break;
				}

			}

		}

	}

	// 극장 개별 보기
	public void printOne(int id) {
		CinemaDTO c = new CinemaDTO();
		SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m:s");
		System.out.println("===========================");
		System.out.printf("극장 번호 : %d 극장명 : %s 극장장소 : %s \n", c.getId(), c.getCinemaName(), c.getCinemaMap());
		System.out.println("===========================");
		//System.out.printf("상영시간 : ", c.getCall());

	}
}