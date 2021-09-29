package day0630;

// 사용자로부터 나이를 입력받아서
// 6세미만: 영유아입니다.
// ~13세이하: 어린이입니다.
// ~18세이하: 청소년입니다.
// 그외: 성인입니다.
// 가 출력되는 프로그램을 작성하시오
// 30분까지
import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 나이를 입력받아서 변수에 저장
        System.out.println("나이를 입력해주세요.");
        System.out.print("> ");
        int age = scanner.nextInt();

        // 2. if문으로 6세 미만인지 체크
        if (age < 6) {
            System.out.println("영유아입니다.");
            // 3. else if문으로 13세 이하인지 체크
        } else if (age <= 13) {
            System.out.println("어린이입니다.");
            // 4. else if문으로 18세 이하인지 체크
        } else if (age <= 18) {
            System.out.println("청소년입니다.");
            // 5. else 문으로 그 외의 경우 처리
        } else {
            System.out.println("성인입니다.");
        }

        scanner.close();
    }
}
