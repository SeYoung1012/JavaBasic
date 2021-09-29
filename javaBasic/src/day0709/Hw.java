package day0709;
//숙제 1 . Student 배열을 위한 ArrayUtil 메소드를 만들고

//		학생 관리 프로그램을 Student 데이터 타입을 사용하여 만드시오
//숙제 2. type에 Board 데이터 타입을 만들고 1번 과정과 같이 게시글 프로그램을 만드시오.

/*
import java.util.Scanner;

import type.Student;
import util.ArrayUtil;
import util.ScannerUtil;

public class Hw {
	   //  상수
    //  점수 최소 값
    static final int SCORE_MIN = 0;
    //  점수 최대 값
    static final int SCORE_MAX = 100;
    //  과목 숫자
    
    static final int SUBJECT_SIZE = 3;
    static final int SIZE = 5;
    //  전역 변수
    //  Scanner 클래스 변수
    
    static Student[] stu = new Student[0];
      
    
    static Scanner scanner = new Scanner(System.in);
    

    static int count = 0;
    
    
    static int id= 1;
    
    public static void main(String[] args) {
       
       
       
       showMenu();
    

    }
    public static void showMenu() {
        String message = "1. 입력 2. 출력 3. 종료";
        while(true) {
            int userChoice = ScannerUtil.nextInt(scanner, message,1,3);
            if(userChoice == 1) {
                //  입력 메소드 호출
                insert();
            }else if(userChoice == 2) {
                //  출력 메소드 호출
                print();
            }else if(userChoice == 3) {
                //  while 종료
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
        
        scanner.close();
    }
    public static void insert() {
       if(count == 0) {
           stu = new Student[1];
       }
        
        String message;
        
        stu[count] = new Student();
               
        stu[count].id = id++;
        //  이름 입력
        message = "이름을 입력해주세요.";
        String name = ScannerUtil.nextLine(scanner, message);
        stu[count].name = name;
      
        //  국어 점수 입력
        message = "국어 점수를 입력해주세요.";
        int korean = ScannerUtil.nextInt(scanner, message,SCORE_MIN, SCORE_MAX);
        stu[count].korean = korean;
        //  영어 점수 입력
        message = "영어 점수를 입력해주세요.";
        int english = ScannerUtil.nextInt(scanner, message,SCORE_MIN, SCORE_MAX);
        stu[count].english = english;
        //  수학 점수 입력
        message = "수학 점수를 입력해주세요.";
        int math = ScannerUtil.nextInt(scanner, message,SCORE_MIN, SCORE_MAX);
        stu[count].math = math;
        
        stu = ArrayUtil.add(stu, stu[count]);
        
        count++; 
    
    }
    public static void print() {
        

 //       if(count == 0) {
       if(ArrayUtil.isEmpty(stu)) {
            System.out.println("아직 입력된 학생이 존재하지 않습니다.");
        } else {
            for(int i = 0 ; i < stu.length-1; i++) {
                System.out.printf("%d. %s\n",i+1,stu[i].name);
            }
            //  사용자로부터 몇번 인덱스의 학생을 볼지 입력을 받는다.
            //  단, 한가지 주의할 것은 사용자가 입력할 번호와
            //  실제 인덱스가 다르다라는 것이다.
            String message = "상세보기할 학생의 번호를 입력하세요.\n뒤로 가실려면 0을 눌러주세요";
            int userChoice = ScannerUtil.nextInt(scanner, message,0,count) -1;
            if(userChoice != -1) {
                printByIndex(userChoice);
            }
        }
    }
    public static void printByIndex(int index) {
        System.out.printf("번호: %d번 이름:%s\n",(ArrayUtil.get(stu, index)).id
                ,(ArrayUtil.get(stu, index)).name);
        System.out.printf("국어 점수: %d 영어 점수: %d 수학 점수: %d\n",
                (ArrayUtil.get(stu, index)).korean,(ArrayUtil.get(stu, index)).english,
                (ArrayUtil.get(stu, index)).math);
        
        int sum = (ArrayUtil.get(stu, index)).korean + (ArrayUtil.get(stu, index)).english +
                (ArrayUtil.get(stu, index)).math;
        
        double average = (double)sum/SUBJECT_SIZE;
        System.out.printf("총점: %d점 평균: %6.2f점\n", sum, average);
        
        String message = "1. 수정 2. 삭제 3. 뒤로가기";
        int userChoice = ScannerUtil.nextInt(scanner, message,1,3);
        
        if(userChoice ==1) {
            update(index);
        }else if(userChoice == 2) {
            delete(index);
        }else if(userChoice ==3) {
            print();
        }
    }

    public static void update(int index) {
        //  수정의 경우, 번호, 이름은 수정할 수 없고
        //  국어, 영어, 수학만 새로운 값을 입력 받도록 한다.
        String message;
        message = "새로운 국어 점수를 입력해주세요(기존 점수 :"+(ArrayUtil.get(stu, index)).korean + "점)";
        stu[index].korean = ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
        
        message = "새로운 영어 점수를 입력해주세요(기존 점수 :"+ (ArrayUtil.get(stu, index)).english + "점)";
        stu[index].english = ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
        
        message = "새로운 수학 점수를 입력해주세요(기존 점수 :"+(ArrayUtil.get(stu, index)).math + "점)";
        stu[index].math = ScannerUtil.nextInt(scanner, message,SCORE_MIN,SCORE_MAX);
    
        printByIndex(index);
    
    }
    
    public static void delete(int index) {

        String message = "정말로 삭제하시겠습니까? (1: 예 2. 아니오)";
        int userChoice = ScannerUtil.nextInt(scanner, message);
        if(userChoice == 1) {

            count--;
            stu = ArrayUtil.remove(stu, index);
            print();
        }else {
            printByIndex(index);

        }
    }
    
} */