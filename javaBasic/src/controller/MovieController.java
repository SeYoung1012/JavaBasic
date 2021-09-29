package controller;

import java.util.ArrayList;

import model.MovieDTO;

public class MovieController {
	
	private ArrayList<MovieDTO> list;
	private int nextId;
	
	
	public MovieController() {
		list = new ArrayList<>();
		nextId = 1;
		
		for (int i = 1; i < 3; i++) {
			MovieDTO v = new MovieDTO();
            v.setId(nextId++);
            v.setTitle("제목 " + i);
            v.setStory("줄거리 "+ i);
           

            list.add(v);
        }
    }
		
	
	public void insert(MovieDTO v) {
		v.setId(nextId++);
		list.add(v);
	}

	public ArrayList<MovieDTO> selectAll() {
		return list;
	}
	
	public MovieDTO selectOne(int id) {
		MovieDTO v = new MovieDTO();
		v.setId(id);
		if (list.contains(v)) {
			int index = list.indexOf(v);
			return list.get(index);
		}
		return null;
	}
	
    public void update(MovieDTO v) {
        int index = list.indexOf(v);
        MovieDTO origin = list.get(index);
        v.setId(origin.getId());
     
        list.set(index, v);
    }

    // delete(int id)
    public void delete(int id) {
       MovieDTO v = new MovieDTO();
        v.setId(id);
        list.remove(v);
    }

	
	
	

}
