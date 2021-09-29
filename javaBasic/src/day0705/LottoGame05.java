package day0705;

// 로또게임 최종버젼
// 컴퓨터 숫자를 뽑고 나서
// 사용자로부터 자동으로 할지 수동으로 할지 입력 받아서
// 각각에 코드를 구현하고
// 
// 맨 마지막에
// 컴퓨터의 숫자와 사용자의 숫자를 쭉 출력한 후에
// 컴퓨터 숫자를 기준으로 하여 총 몇개가 맞았는지 출력하는 프로그램을 작성하시오.
// 5시 20분
import java.util.Random;
import java.util.Scanner;

public class LottoGame05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final int SIZE = 6;
        final int NUMBER_MIN = 1;
        final int NUMBER_MAX = 45;

        int[] userArray = new int[SIZE];
        int[] computerArray = new int[SIZE];

        // 1. 컴퓨터 숫자 결정
        // 숫자를 하나 뽑아서
        // 중복이 아니면 추가
        // 중복이면 다시 뽑기

        // 몇번째 인덱스에 추가할지를 저장한
        // int 변수
        int index = 0;

        while (index < SIZE) {
            // 숫자를 하나 뽑는다.
            int number = random.nextInt(NUMBER_MAX) + 1;
            // 중복이 아니면 true, 중복이면 false의 값을 가질
            // boolean 변수
            boolean checkNumber = true;

            for (int i = 0; i < computerArray.length; i++) {
                if (number == computerArray[i]) {
                    checkNumber = false;
                }
            }

            if (checkNumber) {
                computerArray[index] = number;
                index++;
            }
        }

        // 뽑은 숫자들을 정렬한다.
        for (int i = 0; i < computerArray.length - 1; i++) {
            if (computerArray[i] > computerArray[i + 1]) {
                int temp = computerArray[i];
                computerArray[i] = computerArray[i + 1];
                computerArray[i + 1] = temp;
                i = -1;
            }
        }

        // 2. 사용자 숫자 결정

        // 사용자로부터 수동으로 할지 자동으로 할지 입력을 받는다.
        System.out.println("1. 자동 2. 수동");
        System.out.print("> ");
        int userChoice = scanner.nextInt();

        // 사용자가 입력한 숫자가 1 혹은 2가 맞는지 확인
        while (!(userChoice >= 1 && userChoice <= 2)) {
            System.out.println("잘못 입력하셨습니다.");
            System.out.println("1. 자동 2. 수동");
            System.out.print("> ");
            userChoice = scanner.nextInt();
        }

        // 자동이면 위의 코드처럼해서
        // 사용자 숫자 배열에 숫자를 추가한다.

        // 수동이면 사용자로부터 숫자를 입력 받아서
        // 유효한 숫자이면 추가
        // 아니면 다시 입력을 받는다.

        // 입력할 위치를 저장할 변수 index의 값을 0으로 초기화해준다.
        index = 0;
        if (userChoice == 1) {
            // 자동으로 숫자 추가하는 코드 구현
            while (index < userArray.length) {
                // 1~45 사이의 랜덤 숫자를 뽑는다.
                int number = random.nextInt(NUMBER_MAX) + 1;
                // 중복이면 false이고 그 외는 항상 true를 저장할
                // boolean 변수
                boolean checkNumber = true;

                for (int i = 0; i < userArray.length; i++) {
                    if (number == userArray[i]) {
                        checkNumber = false;
                    }
                }

                if (checkNumber) {
                    userArray[index] = number;
                    index++;
                }

            }

        } else if (userChoice == 2) {
            // 수동으로 숫자 추가하는 코드 구현
            while (index < userArray.length) {
                System.out.println("-----------------------------");
                System.out.printf("%d번째 숫자", index + 1);
                System.out.println("1~45 사이의 숫자를 입력해주세요.");

                int number = scanner.nextInt();

                // 사용자가 입력한 숫자가 유효하면 true,
                // 유효하지 않으면 false를 저장할 변수
                boolean checkNumber = true;

                // 사용자의 숫자가 1~45를 벗어났는지 체크한다.
                checkNumber = number >= NUMBER_MIN && number <= NUMBER_MAX;

                // 사용자의 숫자가 중복인지 체크한다.
                for (int i = 0; i < userArray.length; i++) {
                    if (number == userArray[i]) {
                        checkNumber = false;
                    }
                }

                // 사용자의 숫자가 올바른 숫자이면
                // 배열의 index번 칸에 추가하고
                // 아니면 경고 메시지를 출력한다.
                if (checkNumber) {
                    userArray[index] = number;
                    index++;
                } else {
                    System.out.println("잘못 입력하셨습니다.");
                }

                System.out.println("-----------------------------");
            }
        }

        // 자동 혹은 수동을 통해서 완성된 배열을
        // 정렬한다.

        for (int i = 0; i < userArray.length - 1; i++) {
            if (userArray[i] > userArray[i + 1]) {
                int temp = userArray[i];
                userArray[i] = userArray[i + 1];
                userArray[i + 1] = temp;
                i = -1;
            }
        }

        // 3. 결과 비교
        System.out.println("-----------------------------");
        System.out.println("결과");
        System.out.println("-----------------------------");

        // 컴퓨터 배열 출력
        System.out.println("-----------------------------");
        System.out.println("컴퓨터 숫자");
        System.out.println("-----------------------------");
        for (int i = 0; i < computerArray.length; i++) {
            System.out.printf("[%2d] ", computerArray[i]);
        }
        System.out.println();

        // 사용자 배열 출력
        System.out.println("-----------------------------");
        System.out.println("사용자 숫자");
        System.out.println("-----------------------------");
        for (int i = 0; i < userArray.length; i++) {
            System.out.printf("[%2d] ", userArray[i]);
        }
        System.out.println();

        // 총 몇개의 숫자가 같은지 저장할
        // int 변수
        int count = 0;

        // 2중 for문을 사용하여
        // computerArray[i] 번째가 userArray[j]와 같으면
        // count를 1 증가 시킨다.
        for (int i = 0; i < computerArray.length; i++) {
            for (int j = 0; j < userArray.length; j++) {
                if (computerArray[i] == userArray[j]) {
                    count++;
                }
            }
        }

        // count를 출력한다.
        System.out.printf("총 맞은 갯수: %d개\n", count);

        scanner.close();
    }
}
