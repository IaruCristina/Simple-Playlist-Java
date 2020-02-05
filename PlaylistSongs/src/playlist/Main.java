package playlist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Playlist myPlaylist = new Playlist();
		
		ArrayList<Album> myAlbumList = new ArrayList<>();
		
		Song firstSong = new Song();
		Song secondSong = new Song();
		Song thirdSong = new Song();
		Song fourthSong = new Song();
		Song fifthSong = new Song();
		Song sixthSong = new Song();
		Song seventhSong = new Song();
		Song eighthSong = new Song();
		
		firstSong.setTitle("Do I Wanna Know");
		firstSong.setDuration(3.20f);
		secondSong.setTitle("I wanna be yours");
		secondSong.setDuration(3.15f);
		thirdSong.setTitle("Twisted");
		thirdSong.setDuration(4.05f);
		fourthSong.setTitle("Make it rain");
		fourthSong.setDuration(2.50f);
		fifthSong.setTitle("Don't stop me now");
		fifthSong.setDuration(4.05f);
		sixthSong.setTitle("Old Yellow Bricks");
		sixthSong.setDuration(3.09f);
		seventhSong.setTitle("One for the road");
		seventhSong.setDuration(2.40f);
		eighthSong.setTitle("Lost the game");
		eighthSong.setDuration(3.25f);
		
		Album myFirstAlbum = new Album();
		Album mySecondAlbum = new Album();
		
		myFirstAlbum.setAlbumName("Arctic Monkeys");
		
		if(myFirstAlbum.checkIfSongExists(firstSong) == false && myFirstAlbum.checkIfSongExists(secondSong) && myFirstAlbum.checkIfSongExists(sixthSong) == false && myFirstAlbum.checkIfSongExists(seventhSong));
		{	
			myFirstAlbum.getSongs().add(firstSong);
			myFirstAlbum.getSongs().add(secondSong);
			myFirstAlbum.getSongs().add(sixthSong);
			myFirstAlbum.getSongs().add(seventhSong);


		}
		
		mySecondAlbum.setAlbumName("Two Feet");
		if(mySecondAlbum.checkIfSongExists(eighthSong) == false && mySecondAlbum.checkIfSongExists(thirdSong) == false)
		{
			mySecondAlbum.getSongs().add(thirdSong);
			mySecondAlbum.getSongs().add(eighthSong);
		}
	
		
		myAlbumList.add(myFirstAlbum);
		
		System.out.println("          First album           ");
		myFirstAlbum.printAlbum();
		boolean choice = true;
		
		myAlbumList.add(mySecondAlbum);
		myPlaylist.setAlbums(myAlbumList);
		System.out.println("          Second album          ");
		mySecondAlbum.printAlbum();
	
		while(choice)
		{
			System.out.println("Optiuni: ");
			System.out.println("1.Skip forward song.");
			System.out.println("2.Skip backwards song.");
			System.out.println("3.Quit song.");
			System.out.println("4.Repeat the current song.");
			System.out.println("5.Remove the current song.");
			int option;
			@SuppressWarnings("resource")
			Scanner sc = new Scanner (System.in);
			option = Integer.parseInt(sc.nextLine());
			switch(option) {
			
			//Skip Forward
			case 1:
				Song songToSkip = new Song();
				songToSkip.setTitle("Do I Wanna Know");
				songToSkip.setDuration(3.20f);
				myPlaylist.playSong(songToSkip);
				myPlaylist.skipForward(songToSkip);
				
				break;
				
			//Skip backwards
			case 2:
				Song songToSkipBack = new Song();
				songToSkipBack.setTitle("Do I Wanna Know");
				songToSkipBack.setDuration(3.20f);
				myPlaylist.skipBackwards(songToSkipBack);
				break;
				
			//Quit song
			case 3:
				Song songToQuit = new Song();
				songToQuit.setTitle("Do I Wanna Know");
				songToQuit.setDuration(3.20f);
				myPlaylist.quit(false);
				break;
			//Repeat
			case 4:
				Song songToReplay = new Song();
				songToReplay.setTitle("Do I Wanna Know");
				songToReplay.setDuration(3.20f);
				myPlaylist.replaySong(songToReplay);
				break;
				
			//Remove song from playlist
			case 5:
				Song songToRemove = new Song();
				songToRemove.setTitle("Do I Wanna Know");
				songToRemove.setDuration(3.20f);
				myPlaylist.removeSongFromPlaylist(songToRemove);
				break;
			default :
			{
				break;
			}
			
		}
	
	}
		
}
	
}
