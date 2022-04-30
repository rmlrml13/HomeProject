package org.study.home.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.study.home.model.GameDTO;
import org.study.home.model.NoticeBoardDTO;

@Mapper
public interface GameMapper {

	List<GameDTO> gameList();

	GameDTO gameRead(String game_no);

}
