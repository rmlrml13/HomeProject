package org.study.home.service;

import java.util.List;
import java.util.Map;

import org.study.home.model.GameDTO;

public interface GameService {

	List<GameDTO> gameList();

	GameDTO gameRead(String game_no);

	void saveImage(Map<String, Object> hmap);


	
}
