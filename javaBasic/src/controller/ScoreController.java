package controller;

import java.util.ArrayList;

import model.ScoreDTO;

public class ScoreController {
	
	private ArrayList<ScoreDTO> list;
	private int nextId;
	
	
	public ScoreController() {
		list = new ArrayList<>();
		nextId = 1;

	}
	public void insert(ScoreDTO s) {
		s.setId(nextId++);
		list.add(s);
	}	
	
	 public ArrayList<ScoreDTO> selectAll() {
	        return list;
	    }

	 public ScoreDTO selectOne(int id) {
	        ScoreDTO s = new ScoreDTO();
	        s.setId(id);
	        if (list.contains(s)) {
	            return list.get(list.indexOf(s));
	        }

	        return null;
	    }
	 public ArrayList<ScoreDTO> selectByMovied(int id) {
	        ArrayList<ScoreDTO> temp = new ArrayList<>();
	       
	        for (ScoreDTO s : list) {
	            if (s.getId() == id) {
	                temp.add(s);
	            }
	        }
	        return temp;
	    }
	

}
