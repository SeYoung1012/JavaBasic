package day0713;
//자바에서 시간 표시하기
//자바에서 시간을 담당하는 클래스는 여러 개가 있다. 
//그 중 가장 대표적으로 사용되는 것이 바로 Calendar 클래스인데
//기본적으로 시간을 다루는 클래스들은
//197년 1월 1일 0시 0분 0.00c (GMT 기준)
//부터 흘러간 시간을 1000분의 1초 단위로 가지고 있다. 
//그리고 내부적으로 그 시간을 년 월 일 시 분 초 로 환산해서 보여주게 된다. 

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex01Calendar {
	public static void main(String[] args) {
		Calendar cal;
		//캘린더 객체를 초기화 하는 방법은 2가지가 있는데
		//앞서 말한 1000분의 1초 단위로 직접 저장하는 것과 현재 시간을 저장하는 방법 두가지가 있다.
		// 물론 현재 시간을 저장했다고 해서 다른 시간으로 변경을 못하는 것은 아니다. 
		
		//현재 시간을 캘린더 객체에 넣는 방법
		cal = Calendar.getInstance();
		
		
		//캘린더 객체를 화면에 출력해보자.
		System.out.println(cal);
		
		//위에 캘린더 객체를 우리가 원하는 형식으로 출력해주기 위해서는 
		//SimpleDateFormat 이라는 것을 사용하여
		//printf 처럼 우리가 알파벳으로 
		//어디에 무엇이 들어갈 지를 정해주어야 한다. 
		
		//SimpleDateFormat 객체 생성
		//SimpleDateFormat 객체 생성자 안에는
		//우리가 출력하고자 하는 날짜의 양식을 넣어서 초기화가 가능하다. 
		//이때 각 알파벳 자리에 맞춰서 몇 자리가 출력될 지를 정해지는데
		//y : 년
		//M : 월
		//d : 일
		//H : 0~23시
		// h : 0~11시
		//m :분
		//s : 초
		//를 주로 사용하게 된다. 
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 HH시 mm 분 ss초");
		
		//그 다음 sdf 객체의 format 메소드를 사용하여
		//cal 의 시간을 출력해주면 된다.
		System.out.println(sdf.format(cal.getTime()));
		
		//Calendar 객체에 자기가 원하는 시간 집어 넣기
		//이 때에는 set(넣을 곳, 값)으로 시간을 넣게 된다. 
		//넣을 곳의 경우 Calendar 안에 내부적으로 적혀 있기 때문에
		//우리가 Calendar. 해서 필요한 곳을 찾으면 된다. 
		
		//1.연도 넣기
		
		cal.set(Calendar.YEAR, 1998);
		System.out.println(sdf.format(cal.getTime()));
		
		//2. 월 넣기
		cal.set(Calendar.MONTH,10);
		System.out.println(sdf.format(cal.getTime()));
		
		
		//3. 일 넣기
		cal.set(Calendar.DAY_OF_MONTH, 22);
		System.out.println(sdf.format(cal.getTime()));
		
		//4. 시 넣기
		cal.set(Calendar.HOUR_OF_DAY, 20);
		System.out.println(sdf.format(cal.getTime()));
		
		//5.분 넣기
		cal.set(Calendar.MINUTE, 17);
		System.out.println(sdf.format(cal.getTime()));
		
		//6. 초 넣기
		cal.set(Calendar.SECOND, 90);
		System.out.println(sdf.format(cal.getTime()));
		
		//시간을 넣을 때 두번째 방법은 연, 월, 일을 넣는 방법이다. 
		cal.set(2021, 6, 13);
		System.out.println(sdf.format(cal.getTime()));
		
		//시간을 넣을 때 마지막 방법은
		//연, 월, 일, 시 , 분, 초 를 넣는 방법이다. 
		cal.set(1998,11,31,23,45,51);
		System.out.println(sdf.format(cal.getTime()));
		
		
		
	}
	

}
