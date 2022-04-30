package org.study.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.study.home.mapper.GameMapper;
import org.study.home.mapper.NoticeBoardMapper;
import org.study.home.model.GameDTO;
import org.study.home.model.NoticeBoardDTO;

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


}
