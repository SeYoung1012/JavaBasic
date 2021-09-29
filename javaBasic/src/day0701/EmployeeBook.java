package day0701;
// 사원의 정보를 저장하고 출력하는 프로그램을 작성하시오.

// 단, 사원의 정보를 입력할 때에는
// 메뉴에서 "입력" 이라는 글자를 입력해야 입력 기능이 실행되고
// 출력할 때에는 마찬가지 "출력" 이라고 입력해야 출력 기능이 실행되게
// 프로그램을 작성하시오
// (힌트: 참조형 데이터타입의 비교는?)
// 또한 아무런 정보가 입력되지 않은 상태에서는 
// 사용자가 출력을 선택하면, 입력된 정보가 없음을 알려야 합니다.

// 사원의 정보에는 다음과 같은것이 있어야 합니다.
// 1. 사원 번호
// 2. 사원 이름
// 3. 사원 직급
// 4. 사원 부서
// 5. 사원 월급

// 쉬는시간 포함 4시 40분까지

/*
 * 0. 변수 선언
   int id 
   String name
   String rank
   String department
   int salary
   boolean inputSwitch

1. 메뉴 구현
   단, 각 기능 실행은
   해당 기능의 글자를 입력해서
   실행한다.
   String userChoice
   
   userChoice.이퀄즈("입력")
1-1. 입력
   A. 사원 번호
   B. 사원 이름
   C. 사원 직급
   D. 사원 부서
   E. 사원 월급
   F. inputSwitch = true

1-2. 출력
   A. inputSwitch == true
      출력
   B. else
      "아직 입력된 정보 x"

1-3. 종료
*/

import java.util.Scanner;

public class EmployeeBook {
    private static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = 0;
        String name = "";
        String rank = "";
        String department = "";
        int salary = 0;
        boolean inputSwitch = false;

        while (true) {
            System.out.println("입력 출력 종료 중 실행할 기능을 입력하세요.");
            System.out.print("> ");
            String userChoice = scanner.nextLine();

            if (userChoice.equals("입력")) {
                System.out.println("번호");
                System.out.print("> ");
                id = scanner.nextInt();

                System.out.println("이름");
                System.out.print("> ");
                scanner.nextLine();
                name = scanner.nextLine();

                System.out.println("직급");
                System.out.print("> ");
                rank = scanner.nextLine();

                System.out.println("부서");
                System.out.print("> ");
                department = scanner.nextLine();

                System.out.println("월급");
                System.out.print("> ");
                salary = scanner.nextInt();

                scanner.nextLine();

                inputSwitch = true;

            } else if (userChoice.equals("출력")) {

                if (inputSwitch) {

                    System.out.printf("사원 번호: %03d번 이름: %s\n", id, name);
                    System.out.printf("사원 부서: %s 사원 직급: %s\n", department, rank);
                    System.out.printf("사원 월급: %03d만원\n", salary);

                } else {

                    System.out.println("아직 입력된 정보가 없습니다.");

                }

            } else if (userChoice.equals("종료")) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }

        }

        scanner.close();
    }
}
