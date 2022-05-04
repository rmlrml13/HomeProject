package org.study.home.service;

import java.util.List;

import org.study.home.model.Criteria;
import org.study.home.model.NoticeBoardDTO;

public interface NoticeBoardService {

	void noticeBoardInsert(NoticeBoardDTO dto);

	List<NoticeBoardDTO> noticeBoardList();

	NoticeBoardDTO noticeBoardRead(String notice_no);

	void noticeBoardViewCount(String notice_no);
	
	/* 게시판 목록(페이징 적용) */
    public List<NoticeBoardDTO> getListPaging(Criteria cri);

    /* 게시판 총 갯수 */
    public int getTotal();

	List<NoticeBoardDTO> noticeBoardByCount();

}
