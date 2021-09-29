package model;

public class CinemaDTO {
	private int id;
	private String cinemaName;
	private String cinemaMap;
	private int call;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCinemaName() {
		return cinemaName;
	}
	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}
	public String getCinemaMap() {
		return cinemaMap;
	}
	public void setCinemaMap(String cinemaMap) {
		this.cinemaMap = cinemaMap;
	}
	public int getCall() {
		return call;
	}
	public void setCall(int call) {
		this.call = call;
	}

	public boolean equals(Object o) {
		if (o instanceof ScoreDTO) {
			CinemaDTO c = (CinemaDTO) o;
			if (id == c.id) {
				return true;
			}
		}

		return false;
	}
	
}
