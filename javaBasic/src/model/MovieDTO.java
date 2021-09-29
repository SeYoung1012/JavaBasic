package model;

public class MovieDTO {
	
	private int id;

	private String title;

	private String story;

	private String movieGrade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getMovieGrade() {
		return movieGrade;
	}

	public void setMovieGrade(String movieGrade) {
		this.movieGrade = movieGrade;
	}
	
	public boolean equals(Object o) {
		if (o instanceof MemberDTO) {
			MovieDTO v = (MovieDTO) o;
			if (id == v.id) {
				return true;
			}
		}

		return false;
	}
	
	
	
}
