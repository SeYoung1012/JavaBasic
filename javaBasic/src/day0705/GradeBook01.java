package day0705;
//국어, 영어, 수학 점수를
//별 개의 int 변수가 아니라
//scoreArray 라는 int 배열을 사용한
//성적 입출력 프로그램을 작성하시오.
//단, 입력과 출력 기능은 분리되어 있고
//잘못된 점수는 올바른 점수가 입력 될 때까지 
//다시 입력 받게 하시오.

import java.util.Scanner;

public class GradeBook01 {
	public static void main(String [] args) {
		   Scanner scanner = new Scanner(System.in);
	        // 최저 점수를 저장하는 int 상수
	        final int SCORE_MIN = 0;
	        // 최고 점수를 저장하는 int 상수
	        final int SCORE_MAX = 100;
	        // 과목 숫자를 저장하는 int 상수
	        final int SUBJECT_SIZE = 3;
	        // 번호를 저장하는 int 변수
	        int id = 0;
	        // 이름을 저장하는 String 변수
	        String name = "";
	        // 점수를 저장하는 int[] 변수
	        int[] scoreArray = new int[SUBJECT_SIZE];
	        // 입력 여부를 저장한 boolean 변수
	        boolean inputSwitch = false;

	        while (true) {
	            System.out.println("1. 입력 2. 출력 3. 종료");
	            System.out.print("> ");
	            int userChoice = scanner.nextInt();

	            if (userChoice == 1) {
	                // 점수 입력
	                System.out.println("번호");
	                System.out.print("> ");
	                id = scanner.nextInt();

	                System.out.println("이름");
	                System.out.print("> ");
	                scanner.nextLine();
	                name = scanner.nextLine();

	                System.out.println("국어 점수");
	                System.out.print("> ");
	                scoreArray[0] = scanner.nextInt();
	                while (!(scoreArray[0] >= SCORE_MIN && scoreArray[0] <= SCORE_MAX)) {
	                    System.out.println("잘못 입력하셨습니다.");
	                    System.out.println("국어 점수");
	                    System.out.print("> ");
	                    scoreArray[0] = scanner.nextInt();
	                }

	                System.out.println("영어 점수");
	                System.out.print("> ");
	                scoreArray[1] = scanner.nextInt();
	                while (!(scoreArray[1] >= SCORE_MIN && scoreArray[1] <= SCORE_MAX)) {
	                    System.out.println("잘못 입력하셨습니다.");
	                    System.out.println("영어 점수");
	                    System.out.print("> ");
	                    scoreArray[1] = scanner.nextInt();
	                }

	                System.out.println("수학 점수");
	                System.out.print("> ");
	                scoreArray[2] = scanner.nextInt();
	                while (!(scoreArray[2] >= SCORE_MIN && scoreArray[2] <= SCORE_MAX)) {
	                    System.out.println("잘못 입력하셨습니다.");
	                    System.out.println("수학 점수");
	                    System.out.print("> ");
	                    scoreArray[2] = scanner.nextInt();
	                }

	                inputSwitch = true;

	            } else if (userChoice == 2) {
	                // 점수 출력

	                if (inputSwitch) {
	                    // 점수가 한번이라도 입력된 경우
	                    System.out.printf("번호: %03d번 이름: %s\n", id, name);
	                    System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", scoreArray[0], scoreArray[1], scoreArray[2]);
	                    int sum = scoreArray[0] + scoreArray[1] + scoreArray[2];
	                    double average = (double) sum / SUBJECT_SIZE;
	                    System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);

	                } else {
	                    // 점수가 한번도 입력안된 경우
	                    System.out.println("아직 입력된 정보가 존재하지 않습니다.");
	                }

	            } else if (userChoice == 3) {
	                // while(true) 종료
	                System.out.println("사용해주셔서 감사합니다.");
	                break;
	            }

	        }

	        scanner.close();
	    }
	}