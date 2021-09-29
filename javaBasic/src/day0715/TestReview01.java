package day0715;
/*
 * 문항 1] 배열에 정수넣기.
 * 크기가 5인 배열을 만들고 
 * for문을 사용하여 2 4 8 16 32 를 할당하는
 * 프로그램을 만들어 코드를 여기에 붙여넣으시오.
 * 
 * 
 */

public class TestReview01 {

	public static void main(String[] args) {
		// 1. 크기가 5인 int 배열을 선언한다.
		int[] arr = new int[5];
		// 2. 총 5번 반복이 되는 for문을 만든다.
		int temp = 1;
		for (int i = 0; i < 5; i++) {
			// 3. 배열의 0번 칸부터 for문의 i 값과
			// 현재 배열의 i번째에 저장될 값을 곱하기 할당연산하여
			// 해당 칸에 저장될 값을 계산한다.
			// 계산하면 temp = 2 * temp (or temp *2)
			temp *= 2;
			// 4. 해당 값을 i 번째 값에 할당한다.
			arr[i] = temp;

		}

	}

}
