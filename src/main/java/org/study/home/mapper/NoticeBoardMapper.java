package org.study.home.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.study.home.model.NoticeBoardDTO;

@Mapper
public interface NoticeBoardMapper {

	void noticeBoardInsert(NoticeBoardDTO dto);

}
