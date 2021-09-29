package controller;

import java.util.ArrayList;

import model.UserDTO;

public class UserController {

	private ArrayList<UserDTO> list;
	private int nextId;

	public UserController() {
		list = new ArrayList<>();
		nextId = 1;

		for (int i = 0; i <= 3; i++) {
			UserDTO u = new UserDTO();
			u.setUsername("u" + i);
			u.setPassword("1");
			u.setNickname("유저 " + i);
			insert(u);

		}

	}

	public void insert(UserDTO u) {
		u.setId(nextId++);
		list.add(u);
	}

	public ArrayList<UserDTO> selectAll() {
		return list;
	}

	public UserDTO selectOne(int id) {
		UserDTO u = new UserDTO();
		u.setId(id);
		if (list.contains(u)) {
			int index = list.indexOf(u);
			return list.get(index);
		}
		return null;
	}

	public boolean validateUsername(String username) {
		for (UserDTO u : list) {

			if (u.getUsername().equalsIgnoreCase(username)) {
				return true;
			}
		}
		return false;

	}

	public UserDTO logIn(String username, String password) {
		for (UserDTO u : list) {
			if (u.getUsername().equalsIgnoreCase(username) && u.getPassword().equalsIgnoreCase(password)) {
				return u;
			}
		}
		return null;
	}

	public void update(UserDTO u) {
		UserDTO origin = selectOne(u.getId());
		u.setUsername(origin.getUsername());
		int index = list.indexOf(u);
		list.set(index, u);

	}

	public void delete(int id) {
		UserDTO u = new UserDTO();
		u.setId(id);
		list.remove(u);

	}
}
