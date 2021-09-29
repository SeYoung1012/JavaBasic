package day0705;

// 별찍기 9번
import java.util.Scanner;

public class StarPrinter09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("별찍기 9번");
        System.out.println("출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int lineNumber = scanner.nextInt();

        for (int i = 1; i <= 2 * lineNumber - 1; i++) {
            String stars = "";
            // 각 줄의 공백의 갯수
            int spaceWidth;
            // 각 줄의 별의 갯수
            int starWidth;
            if (i < lineNumber) {
                // 윗부분

                // 공백의 갯수
                spaceWidth = lineNumber - i;

                // 별의 갯수
                starWidth = i * 2 - 1;
            } else {
                // 아랫부분
                int lowerI = 2 * lineNumber - i;

                // 공백의 갯수
                spaceWidth = lineNumber - lowerI;

                // 별의 갯수
                starWidth = lowerI * 2 - 1;
            }

            // 공백을 담당하는 j for 문
            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }

            // 별을 담당하는 j for 문
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }

            System.out.println(stars);
        }

        scanner.close();
    }
}
