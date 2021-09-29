package viewer;
//Viewer 클래스

//뷰어 클래스의 경우 화면에 출력을 담당하게 되는데 웹프로그래밍의 경우 
//웹페이지 그 자체가 뷰어가 될 수도 있고
//클래스와 조합이 될 수도 있지만 우리는 콘솔 프로그래밍이므로 
//이 안에서 직접 콘솔에 출력하는 메소드들을 만들어준다. 

import java.util.ArrayList;
import java.util.Scanner;

import controller.StudentController;
import model.StudentDTO;
import util.ScannerUtil;

//또한 중간에서 뷰어로부터의 요청을 컨트롤러로 연결해줄 서버도 없기 때문에 
//내부적으로 컨트롤러를 필드로 가지고 있는다. 
//

public class StudentViewer {
    // 상수
    private final int SUBJECT_SIZE = 3;
    private final int SCORE_MIN = 0;
    private final int SCORE_MAX = 100;

    private StudentController studentController;
    private Scanner scanner;

    // StudentViewer의 생성자 메소드
    public StudentViewer() {
        studentController = new StudentController();
        scanner = new Scanner(System.in);
    }

    // 메뉴를 담당하는 showMenu()
    public void showMenu() {
        String message = new String("1. 입력 2. 출력 3. 종료");
        while (true) {
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            if (userChoice == 1) {
                insert();
            } else if (userChoice == 2) {
                printAll();
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    // 입력을 담당하는 insert() 메소드
    private void insert() {
        String message;
        StudentDTO s = new StudentDTO();

        message = new String("이름을 입력해주세요.");
        String name = ScannerUtil.nextLine(scanner, message);
        s.setName(name);

        message = new String("국어 점수를 입력해주세요.");
        int korean = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        s.setKorean(korean);

        message = new String("영어 점수를 입력해주세요.");
        int english = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        s.setEnglish(english);

        message = new String("수학 점수를 입력해주세요.");
        int math = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        s.setMath(math);

        studentController.insert(s);
    }

    // 학생의 목록을 간단하게 출력해주는
    // printAll() 메소드
    private void printAll() {
        // 먼저 목록을 받아온다.
        ArrayList<StudentDTO> temp = studentController.selectAll();
        if (temp.isEmpty()) {
            System.out.println("등록된 정보가 존재하지 않습니다.");
        } else {
            for (StudentDTO s : temp) {
                System.out.printf("%d번. %s 학생\n", s.getId(), s.getName());
            }
            StudentDTO s = validateId();
            if (s != null) {
                printOne(s.getId());
            }

        }
    }

    private StudentDTO validateId() {
        String message = new String("상세보기할 학생의 번호를 입력해주시거나 뒤로 가실려면 0을 입력해주세요.");
        int id = ScannerUtil.nextInt(scanner, message);

        StudentDTO s = studentController.selectOne(id);
        while (s == null && id != 0) {
            System.out.println("잘못 입력하셨습니다.");
            id = ScannerUtil.nextInt(scanner, message);
            s = studentController.selectOne(id);
        }

        return s;
    }

    private void printOne(int id) {
        StudentDTO s = studentController.selectOne(id);

        System.out.printf("번호: %03d번 이름: %s\n", s.getId(), s.getName());
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", s.getKorean(), s.getEnglish(), s.getMath());

        int sum = s.getKorean() + s.getEnglish() + s.getMath();
        double average = (double) sum / SUBJECT_SIZE;

        System.out.printf("총점: %03d점 평균: %06.2f점\n", sum, average);

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
        StudentDTO s = new StudentDTO();
        s.setId(id);

        String message;

        message = new String("국어 점수를 입력해주세요.");
        int korean = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        s.setKorean(korean);

        message = new String("영어 점수를 입력해주세요.");
        int english = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        s.setEnglish(english);

        message = new String("수학 점수를 입력해주세요.");
        int math = ScannerUtil.nextInt(scanner, message, SCORE_MIN, SCORE_MAX);
        s.setMath(math);

        message = new String("정말로 수정하시겠습니까? y/n");
        String yesNo = ScannerUtil.nextLine(scanner, message);
        if (yesNo.equalsIgnoreCase("y")) {
            StudentDTO origin = studentController.selectOne(id);
            s.setName(origin.getName());
            studentController.update(s);
        }

        printOne(id);
    }

    private void delete(int id) {
        String message = new String("해당 학생을 정말로 삭제하시겠습니까? y/n");
        String yesNo = ScannerUtil.nextLine(scanner, message);

        if (yesNo.equalsIgnoreCase("y")) {
            studentController.delete(id);
            printAll();
        } else {
            printOne(id);
        }
    }
}
