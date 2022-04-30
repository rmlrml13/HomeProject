package org.study.home.service;

import java.util.List;

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
		mapper.noticeBoardInsert(dto);
	}

	@Override
	public List<NoticeBoardDTO> noticeBoardList() {
		return mapper.noticeBoardList();
	}

	@Override
	public NoticeBoardDTO noticeBoardRead(String notice_no) {
		return mapper.noticeBoardRead(notice_no);
	}

	@Override
	public void noticeBoardViewCount(String notice_no) {
		mapper.noticeBoardViewCount(notice_no);
	}

}
