package day0705;
//사용자로부터 총 5명까지의 학생의 정보를 관리하는 프로그램

//단, 입력과 출력을 분리한다. 
//또한, 사용자가 5명을 초과해서 입력하려고 하면
//더이상 입력하실 수 없습니다!라고 뜨게 만들어야 한다. 
//예시: 입력할 대 "1번째 학생의 정보를 입력하세요."
//		출력할 때 입력된 학생들만 출력을 한다. 

// 즉, 번호, 이름, 국어, 영어, 수학이 각각 배열로..

//힌트 : 몇번째에 입력할 인덱스인지를 저장할 변수가 있으면?

import java.util.Scanner;

public class GradeBook02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        // 상수
        // 1. 과목의 숫자
        final int SUBJECT_SIZE = 3;
        // 2. 점수의 최소값
        final int SCORE_MIN = 0;
        // 3. 점수의 최대값
        final int SCORE_MAX = 100;
        // 4. 최대 학생 숫자
        final int STUDENT_SIZE = 5;

        // 변수
        // 1. 번호를 저장할 배열
        int[] idArray = new int[STUDENT_SIZE];
        // 2. 이름을 저장할 배열
        String[] nameArray = new String[STUDENT_SIZE];
        // 3. 국어 점수를 저장할 배열
        int[] koreanArray = new int[STUDENT_SIZE];
        // 4. 영어 점수를 저장할 배열
        int[] englishArray = new int[STUDENT_SIZE];
        // 5. 수학 점수를 저장할 배열
        int[] mathArray = new int[STUDENT_SIZE];
        // 6. 입력할 인덱스를 저장할 변수
        int index = 0;

        while (true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                // 입력 코드 구현
                if (index < STUDENT_SIZE) {
                    // 입력 가능한 상태
                    // 각 배열의
                    // index번 칸에
                    // 정보를 입력한다.
                    System.out.println("번호를 입력해주세요.");
                    System.out.print("> ");
                    idArray[index] = scanner.nextInt();

                    System.out.println("이름을 입력해주세요.");
                    System.out.print("> ");
                    scanner.nextLine();
                    nameArray[index] = scanner.nextLine();

                    int score;

                    System.out.println("국어 점수를 입력해주세요.");
                    System.out.print("> ");
                    score = scanner.nextInt();
                    while (!(score >= SCORE_MIN && score <= SCORE_MAX)) {
                        System.out.println("잘못입력하셨습니다.");
                        System.out.println("국어 점수를 입력해주세요.");
                        System.out.print("> ");
                        score = scanner.nextInt();
                    }

                    koreanArray[index] = score;

                    System.out.println("영어 점수를 입력해주세요.");
                    System.out.print("> ");
                    score = scanner.nextInt();
                    while (!(score >= SCORE_MIN && score <= SCORE_MAX)) {
                        System.out.println("잘못입력하셨습니다.");
                        System.out.println("영어 점수를 입력해주세요.");
                        System.out.print("> ");
                        score = scanner.nextInt();
                    }

                    englishArray[index] = score;

                    System.out.println("수학 점수를 입력해주세요.");
                    System.out.print("> ");
                    score = scanner.nextInt();
                    while (!(score >= SCORE_MIN && score <= SCORE_MAX)) {
                        System.out.println("잘못입력하셨습니다.");
                        System.out.println("수학 점수를 입력해주세요.");
                        System.out.print("> ");
                        score = scanner.nextInt();
                    }

                    mathArray[index] = score;

                    // 다음 입력할 순서를
                    // 1 증가시킨다.
                    index++;

                } else {
                    // 더이상 입력할 수 없는 상태
                    System.out.println("이미 5명의 정보를 입력했습니다.");
                }

            } else if (userChoice == 2) {
                // 출력 코드 구현
                if (index == 0) {
                    // 아직 한명도 입력이 안되어있는 상태
                    System.out.println("아직 한명도 입력되지 않았습니다.");
                } else {
                    // 한명 이상이 입력되어있는 상태
                    for (int i = 0; i < index; i++) {
                        // 총점 계산
                        int sum = koreanArray[i] + englishArray[i] + mathArray[i];
                        // 평균 계산
                        double average = (double) sum / SUBJECT_SIZE;
                        // 출력
                        System.out.printf("번호: %03d번 이름: %s\n", idArray[i], nameArray[i]);
                        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", koreanArray[i], englishArray[i],
                                mathArray[i]);
                        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);

                    }
                }

            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }

        scanner.close();
    }
}
		
		
		
