package org.study.home.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.study.home.mapper.GameMapper;
import org.study.home.model.Criteria;
import org.study.home.model.GameDTO;
import org.study.home.model.NoticeBoardDTO;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	private GameMapper mapper;

	@Override
	public GameDTO gameRead(String game_no) {
		return mapper.gameRead(game_no);
	}

	@Override
	public void saveImage(Map<String, Object> hmap) {
		mapper.saveImage(hmap);

	}

	@Override
	public void newInsert(GameDTO dto) {
		mapper.newInsert(dto);
	}


	@Override
	public List<GameDTO> gameSearch(String search) {
		return mapper.gameSearch(search);
	}
	
	  /* 게시판 목록(페이징 적용) */
    @Override
    public List<GameDTO> getListPaging(Criteria cri) {
        
        return mapper.getListPaging(cri);
    } 

    /* 게시물 총 갯수 */
    @Override
    public int getTotal() {
        
        return mapper.getTotal();
    } 

}
