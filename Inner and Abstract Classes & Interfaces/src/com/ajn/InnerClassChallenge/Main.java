package com.ajn.InnerClassChallenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;



public class Main {
	private static List<Album> albums = new ArrayList<Album>();

	public static void main(String[] args) {

		Album album = new Album("AOTP", "KSI");

		album.addSong("The moment", 3.01);
		album.addSong("number 2", 2.50);
		album.addSong("No time", 2.30);
		album.addSong("Really Love", 3.30);
		album.addSong("Madness", 2.45);
		album.addSong("Patience", 3.15);
		album.addSong("Don't play", 2.37);

		albums.add(album);

		Album album2 = new Album("Shoot for the stars aim for the moon", "Pop smoke");

		album2.addSong("aim for the moon", 2.55);
		album2.addSong("The Woo", 3.21);
		album2.addSong("Mood Swings", 3.33);
		album2.addSong("Got it on me", 2.44);
		album2.addSong("Dior", 3.36);
		album2.addSong("West coast shit", 3.12);
		album2.addSong("What you know about love", 2.40);

		albums.add(album2);

		List<Song> playList = new ArrayList<Song>();
		
		albums.get(0).addtoPlaylist(3, playList);
		albums.get(0).addtoPlaylist("Madness", playList);
		// albums.get(0).addtoPlaylist("Madness", playList);

		albums.get(0).addtoPlaylist("Holiday", playList);

		albums.get(1).addtoPlaylist("Dior", playList);
		albums.get(1).addtoPlaylist(6, playList);
		albums.get(1).addtoPlaylist(7, playList);
		albums.get(1).addtoPlaylist(2, playList);

		albums.get(1).addtoPlaylist(8, playList);

		play(playList);
	}

	public static void play(List<Song> playList) {

		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> songlist = playList.listIterator();
		
		printPlaylistMenu();
		
		while (!quit) {
			if (playList.size() == 0) {
				System.out.println("No songs in the playlist");
				return;
			} else {
				//System.out.println("Now playing= " + songlist.next().toString());
			
				int key = scanner.nextInt();
				scanner.nextLine();

				switch (key) {
				case 0:
					System.out.println("Playlist over");
					quit = true;
					break;

				case 1:
					if (!forward) {
						if (songlist.hasNext()) {
							songlist.next();
						}

						forward = true;
					}
					
					if (songlist.hasNext()) {
						System.out.println("Now playing= " + songlist.next().toString());
					} else {
						System.out.println("This is the last song in the playList");
						forward = false;
					}

					break;

				case 2:
					if (forward) {
						if (songlist.hasPrevious()) {
							songlist.previous();
						}
						forward = false;
					}
					
					if (songlist.hasPrevious()) {
						System.out.println("Now playing= " + songlist.previous().toString());
					} else {
						System.out.println("This is the first song in the playList");
						forward = true;
					}

					break;

				case 3:
						forward = replay(songlist,forward);
					break;

				case 4:
					 printlist(playList);
					break;

				case 5:
					printPlaylistMenu();
					break;
					
				case 6:
					if(playList.size()>0) {
						songlist.remove();
						if(songlist.hasNext()) {
							System.out.println("Now playing = " + songlist.next().toString());
						}else if(songlist.hasPrevious()) {
							System.out.println("Now playing= " + songlist.previous().toString());
						}
					}
					break;
					
				}

			}

		}

	}

	private static void printPlaylistMenu() {
		System.out.println("Available actions:\npress ");
		System.out.println(
				"0 - To quit \n" + "1 - Next song \n" + "2 - Previous Song \n" + "3 - Replay \n"
		+ "4 - List songs in the playlist \n"
		+"5 - Print the menu \n"
		+"6 - Remove song from playlist");
	}

	
	private static void printlist(List<Song> playList) {
//		for (Song playlistsong: playList) {
//			System.out.println(playlistsong.toString());
//		}
		
		Iterator<Song> iterator = playList.iterator();
		System.out.println("=============================");
		 while(iterator.hasNext()) {
			 System.out.println(iterator.next().toString());
		 }
		 System.out.println("=============================");
	}
	
	
	private static boolean replay(ListIterator<Song> songlist, boolean forward) {
		if (!forward) {
			if (songlist.hasNext()) {
				System.out.println("Replaying = " + songlist.next().toString());
			}
			
			forward = true;
			
			
		}else if (forward) {
			if (songlist.hasPrevious()) {
				System.out.println("Replaying = " + songlist.previous().toString());
			}
			forward = false;
		}
		
		return forward;
	}
}
