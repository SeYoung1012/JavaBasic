package day0629;
// 이름, 나이, 국어, 영어, 수학, 총점, 평균을 다음과 같은 양식으로 출력해라
//출력결과 : 
// 이름: ### 나이: ###
// 국어:0##점 영어:0##점 수학: 0##점
//총점 : 0##점 평균 : 0##.##점
//4시 50분까지

public class GradeBook03 {
	public static void main (String [] args ) {
		String name = "홍길동"; 
	    int age = 15;
	    int korean = 98; 
	    int english = 92;
	    int math = 93; 
	    
	    int sum = korean + english + math;
	    double average = (double)sum / 3;
	   
	   System.out.printf("이름: %s 나이: %03d세\n", name, age); 
	   System.out.printf("국어: %03d점 영어: %03d점 수학 %03d점 \n", korean, english, math);
	   System.out.printf("총점:%03d점 평균:%06.2f점\n", sum, average);
	  
	     
	}

}
