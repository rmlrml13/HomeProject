package org.study.home.model;

import lombok.Data;

@Data
public class CartDTO {
	
	private int cart_no;
	private int game_no;
	private String cart_user_id;
	
	//game
	private GameDTO gameDTO;
	
	
}
