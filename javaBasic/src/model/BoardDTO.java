package model;

import java.util.Calendar;

public class BoardDTO {
	// 1. 글 번호
	private int id;
	// 2. 작성자 회원 번호
	private int writerId;
	// 3. 글 제목
	private String title;
	// 4. 작성 시간
	private Calendar writtenDate;
	// 5. 수정 시간
	private Calendar updatedDate;
	// 6. 글 내용
	private String content;

	// getter/setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWriterId() {
		return writerId;
	}

	public void setWriterId (int writerId) {
		this.writerId = writerId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Calendar getWrittenDate() {
		return writtenDate;
	}

	public void setWrittenDate(Calendar writtenDate) {
		this.writtenDate = writtenDate;
	}

	public Calendar getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Calendar updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean equals(Object o) {
		if (o instanceof BoardDTO) {
			BoardDTO b = (BoardDTO) o;
			if (id == b.id) {
				return true;
			}
		}

		return false;
	}

}
