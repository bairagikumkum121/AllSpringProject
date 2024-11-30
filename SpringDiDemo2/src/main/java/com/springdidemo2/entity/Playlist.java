package com.springdidemo2.entity;

import java.util.Set;

public class Playlist {
	private Set<String> songList;

	public Playlist(Set<String> songList) {
		this.songList = songList;
	}

	public Set<String> getSongList() {
		return songList;
	}

	public void setSongList(Set<String> songList) {
		this.songList = songList;
	}
}
