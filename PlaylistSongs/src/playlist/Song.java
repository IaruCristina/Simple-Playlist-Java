package playlist;

public class Song {

	private String title;
	private float duration;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	
		
	@Override 
	
	public String toString() {
		
		return ("Title: " + getTitle() + "\n" + "Duration: " + getDuration());
	}
	
}
