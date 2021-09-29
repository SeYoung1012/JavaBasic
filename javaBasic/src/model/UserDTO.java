package model;
//사용자 기능을 MVC 패턴으로 구현하시오.

public class UserDTO {

	// 1. 사용자 번호
	private int id;
	// 2. 사용자 username
	private String username;
	// 3. 사용자 비밀번호
	private String password;
	// 4. 사용자 닉네임
	private String nickname;

	// 겟터 셋터
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

	//override
	public boolean equals(Object o) {
		if (o instanceof UserDTO) {
			UserDTO u = (UserDTO) o;
			if (id == u.id) {
				return true;
			}
		}

		return false;
	}

}
