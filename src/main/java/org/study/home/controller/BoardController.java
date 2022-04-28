package org.study.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.study.home.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@GetMapping("/boardInsert")
	public String boardInsert() {
		return "board/boardInsert";
	}
	
	@PostMapping("/boardInsert")
	public String boardInsertProcess() {
		return "redirect:/boardList";
	}
}
