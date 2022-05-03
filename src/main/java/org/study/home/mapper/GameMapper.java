package org.study.home.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.study.home.model.GameDTO;

@Mapper
public interface GameMapper {


	GameDTO gameRead(String game_no);

	void saveImage(Map<String, Object> hmap);

	void newInsert(GameDTO dto);

	List<GameDTO> jjinList();

	void gameSearch(String search);
	
}
