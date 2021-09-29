package day0708;
// 컴퓨터의 숫자를 뽑고

// 사용자로부터 입력을 받아서
// 자동 혹은 수동으로 숫자를 뽑아서
// 결과(몇개 맞았는지)를 출력해주는 프로그램을 작성하시오.
// 단, 메소드를 적극적으로 만들어서 프로그램을 작성하시오.

import java.util.Scanner;
import java.util.Random;
import util.ScannerUtil;
import util.ArrayUtil;

public class LottoGame4 {
    static final int SIZE = 6;
    static final int NUMBER_MIN = 1;
    static final int NUMBER_MAX = 45;

    public static void main(String[] args) {
        // 변수
        Scanner scanner = new Scanner(System.in);
        int[] userNumbers = new int[0];
        int[] computerNumbers = new int[0];

        // computer 숫자 결정
        computerNumbers = setRandom(computerNumbers);

        // 사용자 숫자 결정
        userNumbers = setMode(scanner, userNumbers);

        // 결과 출력
        printResult(userNumbers, computerNumbers);

        scanner.close();
    }

    // 자동으로 숫자를 입력해주는 메소드
    public static int[] setRandom(int[] arr) {
        Random random = new Random();
        while (ArrayUtil.size(arr) < SIZE) {
            int number = random.nextInt(NUMBER_MAX) + 1;
            if (!ArrayUtil.contains(arr, number)) {
                arr = ArrayUtil.add(arr, number);
            }
        }
        sort(arr);
        return arr;
    }

    // 수동으로 숫자를 입력해주는 메소드
    public static int[] setManual(Scanner scanner, int[] arr) {
        String message = "1~45 사이의 숫자를 입력해주세요.";
        while (ArrayUtil.size(arr) < SIZE) {
            System.out.println();
            System.out.println("===================");
            System.out.printf("[%d]번 숫자\n", ArrayUtil.size(arr) + 1);
            System.out.println("===================");
            System.out.println();
            int number = ScannerUtil.nextInt(scanner, message, NUMBER_MIN, NUMBER_MAX);

            if (!ArrayUtil.contains(arr, number)) {
                arr = ArrayUtil.add(arr, number);
            } else {
                System.out.println("중복된 숫자입니다.");
            }

        }
        sort(arr);
        return arr;
    }

    // 정렬해주는 메소드
    public static void sort(int[] arr) {
        for (int i = 0; i < ArrayUtil.size(arr) - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
            }
        }
    }

    // 사용자로부터 자동으로 할지 수동으로 할지 입력받는 메소드
    public static int[] setMode(Scanner scanner, int[] arr) {
        String message = "1. 자동 2. 수동";
        int userChoice = ScannerUtil.nextInt(scanner, message, 1, 2);
        if (userChoice == 1) {
            arr = setRandom(arr);
        } else if (userChoice == 2) {
            arr = setManual(scanner, arr);
        }

        return arr;
    }

    // 배열을 출력하는 메소드
    public static void print(int[] arr) {
        System.out.println();
        System.out.println("-----------------------");
        for (int i = 0; i < ArrayUtil.size(arr); i++) {
            System.out.printf("%2d ", ArrayUtil.get(arr, i));
        }
        System.out.println();
        System.out.println("-----------------------");
        System.out.println();
    }

    // 결과를 보여줄 메소드
    public static void printResult(int[] userNumbers, int[] computerNumbers) {
        // 컴퓨터 숫자 출력
        System.out.println("컴퓨터 숫자");
        print(computerNumbers);
        // 사용자 숫자 출력
        System.out.println("사용자 숫자");
        print(userNumbers);

        // 메소드를 사용하여 총 몇개를 맞췄는지
        // 리턴받아서 출력
        System.out.println("총 맞은 갯수: " + compare(userNumbers, computerNumbers));
    }

    // 2개의 배열을 비교해서
    // 총 몇개가 맞았는지 리턴해줄
    // compare() 메소드
    public static int compare(int[] arr1, int[] arr2) {
        int count = 0;
        for (int i = 0; i < ArrayUtil.size(arr1); i++) {
            for (int j = 0; j < ArrayUtil.size(arr2); j++) {
                if (ArrayUtil.get(arr1, i) == ArrayUtil.get(arr2, j)) {
                    count++;
                }
            }
        }

        return count;
    }
}
