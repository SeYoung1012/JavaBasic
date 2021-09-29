package controller;

import java.util.ArrayList;
import java.util.Calendar;

import model.ReplyDTO;

public class ReplyController {
	private ArrayList<ReplyDTO> list;
	private int nextId;

	public ReplyController() {
		list = new ArrayList<>();
		nextId = 1;

	}

	// 댓글을 리스트에 추가하는
	// insert(ReplyDTO)
	public void insert(ReplyDTO r) {
		r.setId(nextId++);
		r.setWrittenDate(Calendar.getInstance());

		list.add(r);
	}

	// 해당 댓글번호를 가진 댓글을
	// 리스트에서 삭제하는
	// delete(int)
	public void delete(int id) {
		ReplyDTO temp = new ReplyDTO();
		temp.setId(id);
		list.remove(temp);
	}

	// 해당 게시글번호를 가진 댓글을
	// 어레이리스트에 담아서 리턴하는
	// selectByBoardId(int)
	public ArrayList<ReplyDTO> selectByBoardId(int boardId) {
		ArrayList<ReplyDTO> temp = new ArrayList<>();

		for (ReplyDTO r : list) {
			if (r.getBoardId() == boardId) {
				temp.add(r);
			}
		}
		return temp;
	}

	// 해당 작성자번호를 가진 댓글을
	// 어레이리스트에 담아서 리턴하는
	// selectByWriterId(int)
	public ArrayList<ReplyDTO> selectByWriterId(int writerId) {
		ArrayList<ReplyDTO> temp = new ArrayList<>();
		for (ReplyDTO r : list) {
			if (r.getWriterId() == writerId) {
				temp.add(r);
			}
		}

		return temp;
	}

	// 탈퇴한 회원의 번호와 일치하는
	// 작성자 번호를 가진 객체의
	// 내용을 수정하는
	// updateWriterId(int) 안쓰느 번호 0로 확인
	public void updateWriterId(int writerId) {
		for (ReplyDTO r : list) {
			if (r.getWriterId() == writerId) {
				r.setWriterId(0);
			}
		}

	}

	// 댓글 번호와 일치하는
	// ReplyDTO 객체를 리턴하는
	// selectOne(int)
	public ReplyDTO selectOne(int id) {
		ReplyDTO r = new ReplyDTO();
		r.setId(id);
		if (list.contains(r)) {
			int index = list.indexOf(r); // id랑 일치하는 값이 몇번째 인덱스에 있는지
			return list.get(index);
		}

		return null;
	}
}