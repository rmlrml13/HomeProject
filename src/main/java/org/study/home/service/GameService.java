package org.study.home.service;

import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.study.home.model.GameDTO;

public interface GameService {


	GameDTO gameRead(String game_no);

	void saveImage(Map<String, Object> hmap);

	void newInsert(GameDTO dto);

	List<GameDTO> jjinList();

	List<GameDTO> gameSearch(String search);


}
