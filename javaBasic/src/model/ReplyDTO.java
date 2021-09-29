package model;

import java.util.Calendar;

//댓글은 댓글 번호, 댓글이 달린 게시판 번호, 댓글을 단 사람의 번호, 
//댓글 내용, 댓글 입력시간의 정보가 필요합니다. 


public class ReplyDTO {
	
	//댓글 번호
	private int id;
	//댓글 게시판 번호
	private int boardId;
	//유저 번호
	private int writerId;
	//댓글 내용
	private String content;
	//댓글 입력 시간 
	private Calendar writtenDate;

	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getBoardId() {
		return boardId;
	}



	public void setBoardId(int boradId) {
		this.boardId = boradId;
	}



	public int getWriterId() {
		return writerId;
	}



	public void setWriterId(int writerId) {
		this.writerId = writerId;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public Calendar getWrittenDate() {
		return writtenDate;
	}



	public void setWrittenDate(Calendar writtenDate) {
		this.writtenDate = writtenDate;
	}



	public boolean equals(Object o) {
		if (o instanceof ReplyDTO) {
			ReplyDTO r = (ReplyDTO) o;
			if (id ==r.id ) {
				return true;
			}
		}

		return false;
	}
	
	
	
}
