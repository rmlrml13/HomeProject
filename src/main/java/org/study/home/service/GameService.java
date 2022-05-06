package org.study.home.service;

import java.util.List;
import java.util.Map;

import org.study.home.model.Criteria;
import org.study.home.model.GameDTO;

public interface GameService {


	GameDTO gameRead(String game_no);

	void saveImage(Map<String, Object> hmap);

	void newInsert(GameDTO dto);


	List<GameDTO> gameSearch(String search);

	/* 게시판 목록(페이징 적용) */
    public List<GameDTO> getListPaging(Criteria cri);

    /* 게시판 총 갯수 */
    public int getTotal();
}
