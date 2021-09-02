package com.ajn.InnerClassChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Album {

	private String albumname;
	private String artist;
	private SongList songList;
	// private ArrayList<Song> songs;

	public Album(String albumname, String artist) {
		this.artist = artist;
		this.albumname = albumname;
		this.songList = new SongList();
		// this.songs = new ArrayList<Song>();
	}

	public String getAlbumname() {
		return albumname;
	}

	public String getArtist() {
		return artist;
	}

//	public ArrayList<Song> getSongs() {
//		return songs;
//	}

	public SongList getSongList() {
		return songList;
	}

	public boolean addtoPlaylist(int trackno, List<Song> playlist) {

		int index = trackno - 1;

		if (index < 0 || index >= songList.getSongs().size()) {
			System.out.println("Wrong Track number " + trackno);
			return false;
		} else {
			playlist.add(songList.getSongs().get(index));
			return true;
		}
	}

	public boolean addtoPlaylist(String title, List<Song> playlist) {

		int index = this.songList.getSongs().indexOf(songList.findSong(title));

		if (index < 0 || index > songList.getSongs().size()) {
			System.out.println("Wrong Track title " + title);
			return false;
		} else {
			playlist.add(songList.getSongs().get(index));
			return true;
		}
	}

	public boolean addSong(String title, double duration) {
		return songList.addSong(title, duration);
	}

	private class SongList {
		private ArrayList<Song> songs;

		private SongList() {
			this.songs = new ArrayList<Song>();
		}

		private ArrayList<Song> getSongs() {
			return songs;
		}

		private boolean addSong(String title, double duration) {

			if (findSong(title) != null) {
				System.out.println("song " + title + " already exists");
				return false;
			} else {
				this.songs.add(new Song(title, duration));
				return true;
			}
		}

		private Song findSong(String title) {

			for (int i = 0; i < this.songs.size(); i++) {
				Song song = this.songs.get(i);
				if (song.getTitle().equals(title)) {
					return song;
				}

			}

			return null;
		}

		private Song findSong(int trackno) {
			int index = trackno-1;
			if ((songs.get(index) != null) && index>0) {
				return songs.get(trackno - 1);
			} 
				return null;
			
		}

	}

}
