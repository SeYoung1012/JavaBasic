package day0702;
//중첩 for 문 (Nested For Loop)
//
//중첩 for문이란, for문 안에 또 다른 for문이 들어가 있는 형태가 된다. 
//중첩 while과 마찬가지, 바깥쪽 for문이 한번 실행될 때마다
//안쪽 for문은 처음부터 끝까지 반복이 된다. 
public class Ex05NestedFor {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 41; j <=44; j++) {
				System.out.printf("i: [%d]  j: [%d]\n" , i , j);
			}
		
			for (int j =141; j <=143; j++) {
				System.out.printf("i:[%d]  j: [%d]\n" , i, j);
			}
		 System.out.println("----------------------------------");	
			
		}
		
		
		
		
	}

}
