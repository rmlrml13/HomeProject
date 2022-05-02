package org.study.home.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.study.home.mapper.GameMapper;
import org.study.home.model.GameDTO;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	private GameMapper mapper;
	
	@Override
	public List<GameDTO> gameList() {
		return mapper.gameList();
	}

	@Override
	public GameDTO gameRead(String game_no) {
		return mapper.gameRead(game_no);
	}

	@Override
	public void saveImage(Map<String, Object> hmap) {
		mapper.saveImage(hmap);
		
	}





}
