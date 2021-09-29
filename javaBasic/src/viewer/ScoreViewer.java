package viewer;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ScoreController;
import model.MemberDTO;
import model.MovieDTO;
import model.ScoreDTO;
import util.ScannerUtil;

public class ScoreViewer {

	private ScoreDTO scoreDTO;
	private MemberDTO memberDTO;
	private ScoreController scoreController;
	private Scanner scanner;
	private MovieDTO movieDTO;

	public ScoreViewer() {

		scoreDTO = new ScoreDTO();
		scoreController = new ScoreController();
		scanner = new Scanner(System.in);
		memberDTO = new MemberDTO();

	}
	
	public static void main(String[] args) {
		   ScoreViewer scoreViewer = new ScoreViewer();
	       scoreViewer.showMenu();
	    }

	public void showMenu() {
		String message = new String("1. 전체 평점 보기 2.일반관객 평점  3. 뒤로가기");
		ArrayList<ScoreDTO> temp = scoreController.selectAll();
		while (true) {
			int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
			if (userChoice == 1) {
				//전체 평점 보기
				printList(temp);
			} else if (userChoice == 2) {
				//일반 관람객 평점 보기
				printUserScore();
				
			} else if (userChoice == 3) {
				//뒤로가기
				System.out.println("사용해주셔서 감사합니다.");
				scanner.close();
				break;
			}

		}
	}

	//평점 목록 보기
	public void printList(ArrayList<ScoreDTO> list) {
        if (list.isEmpty()) {
            System.out.println("---------------------------");

            System.out.println("아직 등록된 평점이 없습니다.");
        } else {
            for (ScoreDTO s : list) {
                System.out.printf("일반 관람객 평점 %d점 : \n", s.getMovieScore() );
                System.out.printf("평론가 평점 : %d점 : \n", s.getMovieScore());
              //  System.out.printf("평론가 평론 : %s \n", s.getReview() );
                System.out.println();

            }
            
            while(true) {
                String message = new String ("1. 영화 평론 보기 2.뒤로");
                int userChoice = ScannerUtil.nextInt(scanner, message, 1, 2);
                if(userChoice == 1) {
                    printOne(movieDTO.getId());
                } else if(userChoice == 2){
                    break;
                }
                
            }

        }
    
    }
		
		
	
	//평점 작성 받기.
	public void printOne(int id) {
        ScoreDTO s = new ScoreDTO();
        System.out.println("===========================");
        System.out.printf("일반 관람객 평점 %d점 : \n", s.getMovieScore() );
        System.out.printf("평론가 평점 : %d \n", s.getMovieScore());
        System.out.printf("평론가 평론 : %s \n", s.getReview() );
        System.out.println("===========================");
        
    }
	
	//일반인 평점 받기
	private void userInput() {
		String message;
		ScoreDTO s = new ScoreDTO();
		
		message = new String("평점을 입력해주세요. \n 평점은 1~5점까지 줄 수 있습니다.");
		int userScore = ScannerUtil.nextInt(scanner, message);
		s.setUserScore(userScore);
		
		scoreController.insert(s);
		
	}
	
	
	//평론가 평점 받기
	
	private void input () {
		String message;
		ScoreDTO s = new ScoreDTO();
		

		message = new String("평점을 입력해주세요. \n 평점은 1~5점까지 줄 수 있습니다.");
		int movieScore = ScannerUtil.nextInt(scanner, message);
		s.setMovieScore(movieScore);

		message = new String("평론를 입력해주세요.");
		String review = ScannerUtil.nextLine(scanner, message);
		s.setReview(review);

		scoreController.insert(s);
	
	}
	
	
	
	public void selectByWriterId() {
		
		
	}
	
	//일반 관람객 평점
	public void printUserScore( ) {
		ArrayList<ScoreDTO> temp = scoreController.selectByMovied (memberDTO.getId());

		printList(temp);
	}
	
	
	
	//영화별 평점
	public void printUsermovie(int movieId) {
		ArrayList<ScoreDTO> temp =  scoreController.selectByMovied(movieDTO.getId());
		printList(temp);
	}
	
	
	

}
