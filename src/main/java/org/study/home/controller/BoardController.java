package org.study.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.study.home.model.BoardDTO;
import org.study.home.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@GetMapping("boardList")
	public String boardList() {
		return "board/boardList";
	}
	
	@GetMapping("boardInsert")
	public String boardInsert() {
		return "board/boardInsert";
	}
	
	@PostMapping("boardInsert")
	public String boardInsertProcess(BoardDTO dto) {
		boardService.boardInsert(dto);
		return "redirect:/boardList";
	}
	
	
}
