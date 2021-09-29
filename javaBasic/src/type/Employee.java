package type;

public class Employee {
	//필드
	
	// 사원 번호
	private int id;

	// 사원 이름
	private String name;
	
	// 사원 부서
	private String team;

	// 사원 직급
	private String position;

	// 사원 연봉
	private int salary;
	
	//getter/setter
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

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	

	// 사원의 정보를 알려주는 메소드 ()
	public void printInfo() {
		System.out.println("--------------------------------");
		System.out.printf("사원 번호: %03d번 사원 이름: %s\n", id, name);
		System.out.println("--------------------------------");
		System.out.printf("사원 부서: %s  사원 직급: %s\n ", team, position);
		System.out.printf("사원 연봉: %d원 \n ",salary );
		System.out.println("--------------------------------");
	}

	

	public Employee(int id, String name, String team, String position, int salary) {

		this.id = id;
		this.name = name;
		this.team = team;
		this.position = position;
		this.salary = salary;
	}
	
	 public Employee() {
	        this.id = 0;
	        this.name = "아직 입력 안됨";
	        this.team = "아직 입력 안됨";
	        this.position = "아직 입력 안됨";
	        this.salary = 0;
	    }
	
	 public boolean equals(Object o) {
	        
	        if (o instanceof Employee) {
	            // 만약 파라미터로 들어온 o 가 Student 클래스 객체가
	            // 맞을 경우에는 true, 그 외에는 false가 리턴된다.

	            // 이 때에는 Object 클래스 객체 o를
	            // 형변환을 통해서 Student 클래스 s로 만들어줄 수 있다.
	        	Employee e = (Employee) o;

	            // 형변환한 s와 이 equals() 메소드를 실행하는 객체의
	            // 특정 값을 비교하여
	            // 같으면 true를 리턴하게 한다.
	            if (id == e.id) {
	                return true;
	            }
	        }

	        return false;
	    }
	 
	}


