package day0702;
//2중 for문을 사용하여
//1부터 100까지의 소수를 구하는 프로그램

//1.	소수란 무엇인가
// 		1과 자기 자신 외에는 약수가 없는 숫자
//		= 약수가 2개인 숫자

//2.	약수란 무엇인가
//		어떤 수를 나눴을 때 나눠 떨어지는 수
// 		예) A를 B로 나눠서 떨어지면 B는 A의 약수이다.
//		A를 B로 나눠서 나머지가 0이면 B는 A의 약수이다. 

//3. 	어떤 숫자의 가장 큰 약수는?
//		자기 자신이다.
public class Ex06PrimeNumber {
	
	public static void main(String[] args) {
		//i for문을 만드는데
		//변수 i는 소수인지 아닌지 검사할 숫자가 된다.
		//그렇다면 i의 최소값은?1
		//그렇다면 i의 최대값은?100
		
		int iStart = 1;
		int iEnd =100;
		
		for(int i = iStart; i <= iEnd; i++) {
			//i의 약수의 갯수를 저장할
			//int 변수 count 
			int count = 0;
			
			//j for 문을 만드는데
			//변수 j는 i의 약수인지 아닌지를 검사할 숫자가 된다. 
			//그렇다면 j의 최소값은? 1
			//그렇다면 j의 최대값은? i
			
			int jStart = 1;
			int jEnd = i;
			
			for (int j= jStart; j <= jEnd; j++) {
				if(i % j == 0) {
					count++;
					
				}
			}
			
			if(count ==2) {
				System.out.printf("%-3d는 약수입니다.\n", i);
			}
		}
		
	}

}
