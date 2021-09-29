package day0707;
//다차원 배열
//배열은 "똑같은 데이터 타입을 모아둔 하나의 데이터 타입"이다. 
//즉, 하나의 데이터 타입이라는 의미인데
//그렇다면
//배열을 모아둔 배열을 우리가 만들어 줄 수 있지 않을까??
//이렇게 배열을 모아둔 배열을 우리는 "다차원 배열 "이라고 한다. 

//다차원 배열은 다음과 같은 형식으로 만들어준다. 

//데이터 타입[] [] 배열 이름 = new 데이터 타입 [크기 1] [크기 2]

//크기 1 : 해당 배열이 갖고 있는 배열의 갯수
//크기 2 : 해당 배열이 가지고 있는 배열 안의 데이터 타입을 모아둔 갯수
//			단 , 크기 2는 생략 가능한데 이때에는 각각의 배열의 길이가
//			달라질 수 있다는 것을 의미한다. 
//
//예시 : int [3] [4]의 경우
// int가 4개 모여 있는 배열이 총 3개 있는 2차원 배열이 된다. 


public class Ex01MultiArray {
	public static void main(String [] args) {
		//int 가 3개 모여 있는 배열이
		//2개 모여있는 2차원 배열을 만들어보자. 
		
		int[] [] intArr = new int[2][3] ;
		
		//2차원 배열 intArr 의 내용을 찍어보자. 
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
			
		}
		//다차원 배열의 경우, 우리가 중첩 for문을 사용해야
		//모든 element(요소)들을 출력해 볼 수 있다. 
		
		for(int i = 0; i <intArr.length; i++) {
			for(int j =0; j < intArr[i].length; j++) {
				System.out.printf("intArr[%d] [%d] : %d\n", i, j, intArr[i][j]);
			}
			
		}
		
		
	}
	
	

}
