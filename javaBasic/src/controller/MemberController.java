package controller;

import java.util.ArrayList;

import model.MemberDTO;

public class MemberController {

	private ArrayList<MemberDTO> list;
	private int nextId;

	public MemberController() {
		list = new ArrayList<>();
		nextId = 1;

	}

	public void insert(MemberDTO m) {
		m.setId(nextId++);
		list.add(m);
	}

	public ArrayList<MemberDTO> selectAll() {
		return list;
	}

	public MemberDTO selectOne(int id) {
		MemberDTO m = new MemberDTO();
		m.setId(id);
		if (list.contains(m)) {
			int index = list.indexOf(m);
			return list.get(index);
		}
		return null;
	}

	public boolean validateUsername(String username) {
		for (MemberDTO m : list) {

			if (m.getUsername().equalsIgnoreCase(username)) {
				return true;
			}
		}
		return false;

	}

	public MemberDTO logIn(String username, String password) {
		for (MemberDTO m : list) {
			if (m.getUsername().equalsIgnoreCase(username) && m.getPassword().equalsIgnoreCase(password)) {
				return m;
			}
		}
		return null;

	}

	public void update(MemberDTO m) {
		MemberDTO origin = selectOne(m.getId());
		m.setUsername(origin.getUsername());
		int index = list.indexOf(m);
		list.set(index, m);

	}

	public void delete(int id) {
		MemberDTO m = new MemberDTO();
		m.setId(id);
		list.remove(m);

	}

}
