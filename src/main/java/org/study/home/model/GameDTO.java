package org.study.home.model;

import java.security.Timestamp;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class GameDTO {

	private int game_no;
	private String game_title;
	private int game_price;
	private String game_genre_no;
	private Timestamp game_regdate;
	private int game_sellcount;
	private boolean game_adultcheck;

	private MultipartFile file;

	public MultipartFile getImgFile() {
		return file;
	}

	public void setImgFile(MultipartFile file) {
		this.file = file;
	}
}
