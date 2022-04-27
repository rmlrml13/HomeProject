package org.study.home.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.study.home.model.BoardDTO;

@Mapper
public interface BoardMapper {

	public void boardInsert(BoardDTO dto);

}
