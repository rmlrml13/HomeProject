package org.study.home.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.study.home.model.NoticeBoardDTO;

@Mapper
public interface NoticeBoardMapper {

	void noticeBoardInsert(NoticeBoardDTO dto);

	List<NoticeBoardDTO> noticeBoardList();

	NoticeBoardDTO noticeBoardRead(String notice_no);

	void noticeBoardViewCount(String notice_no);

	List<NoticeBoardDTO> noticeBoardByCount();


}
