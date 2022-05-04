package org.study.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.study.home.mapper.NoticeBoardMapper;
import org.study.home.model.Criteria;
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

	@Override
	public List<NoticeBoardDTO> noticeBoardByCount() {
		return mapper.noticeBoardByCount();
	}

	  /* 게시판 목록(페이징 적용) */
    @Override
    public List<NoticeBoardDTO> getListPaging(Criteria cri) {
        
        return mapper.getListPaging(cri);
    } 

    /* 게시물 총 갯수 */
    @Override
    public int getTotal() {
        
        return mapper.getTotal();
    } 
}
