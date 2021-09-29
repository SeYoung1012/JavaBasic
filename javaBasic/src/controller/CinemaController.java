package controller;

import java.util.ArrayList;

import model.CinemaDTO;

public class CinemaController {

	private ArrayList<CinemaDTO> list;
	private int nextId;

	public CinemaController() {
		list = new ArrayList<>();
		nextId = 1;

		for (int i = 1; i < 4; i++) {
			CinemaDTO c = new CinemaDTO();
			c.setId(nextId++);
			c.setCinemaName("극장이름 " + i);
			c.setCinemaMap("극장 장소 " + i);

			list.add(c);

		}

	}

	public void insert(CinemaDTO c) {
		c.setId(nextId++);
		list.add(c);
	}

	public ArrayList<CinemaDTO> selectAll() {
		return list;
	}
	public CinemaDTO selectOne(int id) {
		CinemaDTO c = new CinemaDTO();
		c.setId(id);
		if (list.contains(c)) {
			int index = list.indexOf(c);
			return list.get(index);
		}
		return null;
	}
	public void update(CinemaDTO c) {
		CinemaDTO origin = selectOne(c.getId());
		c.setCinemaName(origin.getCinemaName());
		int index = list.indexOf(c);
		list.set(index, c);

	}

	public void delete(int id) {
		CinemaDTO c = new CinemaDTO();
		c.setId(id);
		list.remove(c);

	}
	
	

}
