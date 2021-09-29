package controller;

import java.util.ArrayList;

import model.MovieInfoDTO;

public class MovieInfoController {

	private ArrayList<MovieInfoDTO> list;
	private int nextId;

	public MovieInfoController() {
		list = new ArrayList<>();
		nextId = 1;
		for (int i = 1; i < 4; i++) {
			MovieInfoDTO n = new MovieInfoDTO();
			n.setId(nextId++);
			

			list.add(n);
		}
	}

	public int insert(MovieInfoDTO n) {
		n.setId(nextId++);

		list.add(n);

		return n.getId();

	}

	public ArrayList<MovieInfoDTO> selecAll() {

		return list;

	}

	public MovieInfoDTO selectOne(int id) {
		MovieInfoDTO n = new MovieInfoDTO();
		n.setId(id);
		if (list.contains(n)) {
			int index = list.indexOf(n);
			return list.get(index);
		}
		return null;
	}

	public void update(MovieInfoDTO n) {
		int index = list.indexOf(n);
		list.set(index, n);

	}

	public void delete(int id) {
		MovieInfoDTO n = selectOne(id);
		if (n != null) {
			list.remove(n);

		}

	}

}
