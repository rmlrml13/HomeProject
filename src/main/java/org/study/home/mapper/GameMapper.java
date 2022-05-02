package org.study.home.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.study.home.model.GameDTO;

@Mapper
public interface GameMapper {

	List<GameDTO> gameList();

	GameDTO gameRead(String game_no);

	void saveImage(Map<String, Object> hmap);
	
}
