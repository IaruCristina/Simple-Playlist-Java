package playlist;

import java.util.ArrayList;

public class Playlist {

	private ArrayList<Album> listOfAlbums = new ArrayList<>();
	private boolean isPlaying;
	private int currentSongPosition;
	
	public int getCurrentSongPosition() {
		return currentSongPosition;
	}
	public void setCurrentSongPosition(int currentSongPosition) {
		this.currentSongPosition = currentSongPosition;
	}
	
	public boolean isPlaying() {
		return isPlaying;
	}
	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}
	public ArrayList<Album> getAlbums (){
		
		return this.listOfAlbums;
		
	}
	public void setAlbums(ArrayList<Album> listOfAlbums) {
		this.listOfAlbums = listOfAlbums;
	}
	
	public void playSong(Song song) {
		
		isPlaying = true;

		System.out.println(song.getTitle() + " playing.");
	}
	
	public void addSong(Song songToBeAdded) {

		for (Album a : listOfAlbums) {

			for (int index = 0; index < a.getSongs().size(); index++) {
				a.getSongs().add(songToBeAdded);
				setCurrentSongPosition(1);
			}
		}
	}
	
	public void addAlbum(Album album) {
		listOfAlbums.add(album);
	}

	
	public void skipForward(Song song) {
		
		for(Album a : listOfAlbums) {
			{
				for(int index=0;index<a.getSongs().size();index++)
				{
					if(song == a.getSongs().get(index))
					{	
						song = a.getSongs().get(index+1);
						
					}

				}
					
			}
		}
		System.out.println("Skipped forward");

	}
	
	public void skipBackwards(Song song) {
		
		for(Album a : listOfAlbums) 
		{
			
				for(int index=0;index<a.getSongs().size();index++)
				{
					if(a.getSongs().contains(song))
					{
						song = a.getSongs().get(index-1);
					}
				}
					
			}
		System.out.println("Skipped backwards");

	}
		

	public void quit(boolean isPlaying) {
		
		if(isPlaying == false)
			System.out.println("Quit");
		else
			System.out.println("Song still playing");
		
	}
	
	public void removeSongFromPlaylist(Song song) {
		
		for(Album a : getAlbums()) 
		{
			for(Song s : a.getSongs())
			{
				if(song == s)
					{
						a.getSongs().remove(s);
						System.out.println("Song removed");
						System.out.println(a.getSongs());
					}
				
			}
			
		}
			
	}
	
	public void replaySong(Song song) {
		for(Album a : listOfAlbums) 
		{
			
				for(int index=0;index<a.getSongs().size();index++)
				{
					if(a.getSongs().contains(song))
					{
						System.out.println(song);
						System.out.println("Replay");
					}
				}
					
			}
	}
	
}
