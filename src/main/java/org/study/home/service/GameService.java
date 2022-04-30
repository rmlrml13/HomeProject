package org.study.home.service;

import java.util.List;

import org.study.home.model.GameDTO;

public interface GameService {

	List<GameDTO> gameList();

	GameDTO gameRead(String game_no);


	
}
