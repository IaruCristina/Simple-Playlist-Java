package playlist;

import java.util.ArrayList;

public class Album {

	private String albumName;
	ArrayList<Song> listOfSongs = new ArrayList<>();
	
	public ArrayList<Song> getSongs(){
		
		return listOfSongs;
	}
	
	public void setSongs(ArrayList<Song> songs) {
		
		this.listOfSongs = songs;
	}
	
	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	
	public boolean checkIfSongExists(Song songToCheck) {
		
		for(int index=0;index<listOfSongs.size();index++)
		{
			if(songToCheck.getTitle() == listOfSongs.get(index).getTitle() && songToCheck.getDuration() == listOfSongs.get(index).getDuration())
				
				return true;
		}
		return false;
		
	}
	
	public void printAlbum(){
		
		System.out.println("Album name: " + getAlbumName());
		
		System.out.println(" -----Song List-----");
		
		for(Song s : getSongs())
			
			System.out.println(s);
	}
	
}
