package org.study.home.service;

import java.util.List;

import org.study.home.model.NoticeBoardDTO;

public interface NoticeBoardService {

	void noticeBoardInsert(NoticeBoardDTO dto);

	List<NoticeBoardDTO> noticeBoardList();

	NoticeBoardDTO noticeBoardRead(String notice_no);

	void noticeBoardViewCount(String notice_no);

	List<NoticeBoardDTO> noticeBoardByCount();
	
}
