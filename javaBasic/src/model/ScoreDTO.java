package model;

public class ScoreDTO {

	private int id;
	private int userScore;
	private int movieScore;
	private String Review;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserScore() {
		return userScore;
	}

	public void setUserScore(int userScore) {
		this.userScore = userScore;
	}

	public int getMovieScore() {
		return movieScore;
	}

	public void setMovieScore(int movieScore) {
		movieScore = movieScore;
	}

	public String getReview() {
		return Review;
	}

	public void setReview(String review) {
		Review = review;
	}

	public boolean equals(Object o) {
		if (o instanceof ScoreDTO) {
			ScoreDTO s = (ScoreDTO) o;
			if (id == s.id) {
				return true;
			}
		}

		return false;
	}

}
