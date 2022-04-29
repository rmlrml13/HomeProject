package org.study.home.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.study.home.mapper.NoticeBoardMapper;
import org.study.home.model.NoticeBoardDTO;

@Service
public class NoticeBoardServiceImpl implements NoticeBoardService {

	@Autowired
	private NoticeBoardMapper mapper;
	
	@Override
	public void noticeBoardInsert(NoticeBoardDTO dto) {
		System.out.println("in Service");
		mapper.noticeBoardInsert(dto);
	}

}
