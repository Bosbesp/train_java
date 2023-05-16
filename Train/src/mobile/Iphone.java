package mobile;

public class Iphone extends SmartPhone implements MediaPlayer, GPS{
	public void installApplication(String appName) {
		
		System.out.println("Install : " + appName +" Completed. ");
		
	}
	
	public String playSong(String songName) {
		
		return " " + songName + " now ";
	}
	
	public String playVideo(String videoName) {
		
		return " " + videoName + " now ";
	}
	
	public String getLocation() {
		return "La: 1, Long : 1";
		
	}
}
