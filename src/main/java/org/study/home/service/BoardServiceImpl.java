package org.study.home.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.study.home.mapper.BoardMapper;
import org.study.home.model.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void boardInsert(BoardDTO dto) {
		mapper.boardInsert(dto);
	}

	
}
