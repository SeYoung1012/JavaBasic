package model;

public class MemberDTO {

	private int id; //회원번호

	private String username; //아이디

	private String password; //패스워드

	private String nickname; //닉네임

	private int userGrade; // 등급 ( 0: 일반회원 1: 평론가 2: 관리자 )


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getUserGrade() {
		return userGrade;
	}

	public void setUserGrade(int userGrade) {
		this.userGrade = userGrade;
	}

	public boolean equals(Object o) {
		if (o instanceof MemberDTO) {
			MemberDTO m = (MemberDTO) o;
			if (id == m.id) {
				return true;
			}
		}

		return false;
	}

}
