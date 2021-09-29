package model;
//모델(Model)
//모델의 경우 데이터 베이스로부터 받아올 값을 자바 객체의 모양으로
//덮어씌울 틀의 역할을 맡는다. 
//즉, 틀의 역할만 맡으면 되기 때문에
//모델 안에는 필드, 겟터셋터 그리고 java.lang.Object 클래스 메소드 중 
//오버라이드 할 메소드만 들어간다. 

//모델의 경우 주로 DTO 혹은 VO라는 접미사가 붙는데
//DTO 는 Date Transfer Object의 줄임말로써 사용자가 데이터를 받거나 보내거나 둘다 해야하는 경우에 주로 붙는다. 
//VO는 Value Object의 줄임말로 사용자가 데이터를 받기만 하는 경우에 주로 붙는다. 
//다만 2개의 구분은 엄격하지 않기 떄문에 주로 DTO를 쓰면 된다. 


public class StudentDTO {
	//필드
	private int id;
	private String name;
	private int korean;
	private int english;
	private int math;
	
	
	//겟터 셋터
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	//override
	public boolean equals(Object o) {
		if(o instanceof StudentDTO) {
			StudentDTO s = (StudentDTO)o;
			if(id ==s.id) {
				return true;
				
			}
			
		}
		return false;
	}
	//toString 
	public String toSting () {
		return "[id:  " + id +", name:  " +name+", korean :  "+korean+", english : "+ english+",  math: "+math+"]";
		
	}

}
