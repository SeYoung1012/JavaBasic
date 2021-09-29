package model;

import java.util.Calendar;

public class MovieInfoDTO {

	private int id;
    private int screen;
    private Calendar showTime;
    private Calendar closeTime;


    public int getScreen() {
        return screen;
    }
    public void setScreen(int screen) {
        this.screen = screen;
    }
    public Calendar getCloseTime() {
        return closeTime;
    }
    public void setCloseTime(Calendar closeTime) {
        this.closeTime = closeTime;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Calendar getShowTime() {
        return showTime;
    }
    public void setShowTime(Calendar calendar) {
        this.showTime = calendar;
    }
    
    

	public boolean equals(Object o) {
		if (o instanceof ScoreDTO) {
			MovieInfoDTO n = (MovieInfoDTO) o;
			if (id == n.id) {
				return true;
			}
		}

		return false;
	}

}
