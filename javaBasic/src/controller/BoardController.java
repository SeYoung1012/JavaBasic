package controller;

import java.util.ArrayList;
import java.util.Calendar;

import model.BoardDTO;

public class BoardController {
	 private ArrayList<BoardDTO> list;
	    private int nextId;

	    // 생성자
	    public BoardController() {
	        list = new ArrayList<>();
	        nextId = 1;

	        for (int i = 1; i < 3; i++) {
	            BoardDTO b = new BoardDTO();
	            b.setId(nextId++);
	            b.setTitle("제목 " + i);
	            b.setWriterId(i);
	            b.setContent("내용 " + i);
	            b.setWrittenDate(Calendar.getInstance());
	            b.setUpdatedDate(Calendar.getInstance());

	            list.add(b);
	        }
	    }

	    // insert(BoardDTO b)
	    public int insert(BoardDTO b) {
	        b.setId(nextId++);
	        b.setWrittenDate(Calendar.getInstance());
	        b.setUpdatedDate(Calendar.getInstance());

	        list.add(b);

	        return b.getId();
	    }

	    // selectAll()
	    public ArrayList<BoardDTO> selectAll() {
	        return list;
	    }

	    // selectByWriterId(int writerId)
	    public ArrayList<BoardDTO> selectByWriterId(int writerId) {
	        // 원래 데이터들이 저장되어있는
	        // 필드 list에서 해당 작성자 회원 번호를 가진
	        // 객체들을 뽑아서
	        // 저장할 ArrayList 객체
	        ArrayList<BoardDTO> temp = new ArrayList<>();

	        // list 전체를 확인하여
	        // 해당 writerId값을 가진 객체를 temp에 추가한다.
	        for (BoardDTO b : list) {
	            if (b.getWriterId() == writerId) {
	                temp.add(b);
	            }
	        }

	        // 해당 작성자 번호를 가지고 있는 객체를 모두 담은
	        // temp를 리턴한다.
	        return temp;
	    }

	    // selectOne(int id)
	    public BoardDTO selectOne(int id) {
	        BoardDTO b = new BoardDTO();
	        b.setId(id);
	        if (list.contains(b)) {
	            return list.get(list.indexOf(b));
	        }

	        return null;
	    }

	    // update(BoardDTO b)
	    public void update(BoardDTO b) {
	        int index = list.indexOf(b);
	        BoardDTO origin = list.get(index);
	        b.setWriterId(origin.getWriterId());
	        b.setWrittenDate(origin.getWrittenDate());
	        b.setUpdatedDate(Calendar.getInstance());

	        list.set(index, b);
	    }

	    // delete(int id)
	    public void delete(int id) {
	        BoardDTO b = new BoardDTO();
	        b.setId(id);
	        list.remove(b);
	    }

	    // 파라미터로 들어온 회원번호와 일치하는
	    // 작성자 회원번호를 가진 글들을
	    // 모두 리스트에서 삭제하는
	    // deleteByWriterId(int writerId)
	    public void deleteByWriterId(int writerId) {
	        // 우리가 출력에서 사용하던 forEach 문의 경우,
	        // 해당 리스트의 크기가 변경되면 에러가 발생하므로
	        // 기존의 for문을 사용한다.
	        for (int i = 0; i < list.size(); i++) {
	            if (list.get(i).getWriterId() == writerId) {
	                list.remove(i);
	                i--;
	            }
	        }

	    }
	}