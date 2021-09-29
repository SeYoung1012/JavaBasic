package day0630;
// 검증(Validation)
// 검증이란 어떠한 값이 올바른 값인지를 검사하는 것을
// 검증이라고 한다.

// 자바에서는 처리해야할 데이터가 올바른 값인지를 검증하는 방법이
// 다양하지만
// 우리는 여기서
// 조건식을 빡빡하게 잡아서 검증하기 와
// 올바른 범위에 속하는지 먼저 검증하고
// 처리하는 방식 2가지 방법의 검증 방법을 알아볼 것이다.

import java.util.Scanner;

public class Ex07Validation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        System.out.print("> ");
        int score = scanner.nextInt();

        String result;
        if (score >= 90) {
            result = "A";
        } else if (score >= 80) {
            result = "B";
        } else if (score >= 70) {
            result = "C";
        } else if (score >= 60) {
            result = "D";
        } else {
            result = "F";
        }

        System.out.println("1. 검증이 안된 결과");
        System.out.printf("사용자의 점수: [%2d]점\n", score);
        System.out.printf("최종 성적: [%s]\n", result);
        System.out.println("\n ================ \n");
        
        // 검증 1. 빡빡한 조건식을 사용하여
        //        해당 결과가 나오는 구간을 정확하게
        //        잡아주는 방법
        // 이 검증 방법은 올바른 값의 범위가 연속적이지 않고
        // 분리가 되어있고 범위의 종류가 많지 않을때 사용하면
        // 편하다.
        
        if(score >= 90 && score <= 100) {
            result = "A";
        } else if(score >= 80 && score <= 89) {
            result = "B";
        } else if(score >= 70 && score <= 79) {
            result = "C";
        } else if(score >= 60 && score <= 69) {
            result = "D";
        } else if(score >= 0 && score <= 59) {
            result = "F";
        } else {
            result = "잘못 입력하셨습니다.";
        }
        
        System.out.println("검증 1. 빡빡한 조건식");
        System.out.printf("사용자의 점수: [%2d]점\n", score);
        System.out.printf("최종 성적: [%s]\n", result);
        System.out.println("\n ================ \n");
        
        // 검증 2. 중첩 if문을 사용하는 경우
        // 먼저 사용자가 입력한 값이
        // 올바른 값의 전체 범위에 속하는지 체크하여
        // 만약 올바른 값이면
        // 그 안에서 if-else if 구조를 사용하여
        // 처리를 해주고
        // 올바르지 않다면
        // 경고 메시지등의 처리를 해주면 된다.
        
        System.out.println("검증 2. 올바른 범위 선검사");
        if(score >= 0 && score <= 100) {
            
            // 점수가 올바른 범위이므로 
            // if-else if로 결과를 구한다.
            if (score >= 90) {
                result = "A";
            } else if (score >= 80) {
                result = "B";
            } else if (score >= 70) {
                result = "C";
            } else if (score >= 60) {
                result = "D";
            } else {
                result = "F";
            }

            System.out.printf("사용자의 점수: [%2d]점\n", score);
            System.out.printf("최종 성적: [%s]\n", result);
            
            
        } else {
            // 점수가 올바른 범위에 속하지 않으므로 경고 메시지만 출력
            System.out.println("잘못된 점수입니다.");
            
        }
        System.out.println("\n ================ \n");
        
        scanner.close();
    }
}













