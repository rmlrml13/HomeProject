package org.study.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.study.home.model.NoticeBoardDTO;
import org.study.home.service.NoticeBoardService;

@Controller
public class NoticeBoardController {
	
	@Autowired
	private NoticeBoardService noticeBoardService;
	
	@GetMapping("/noticeBoardInsert")
	public String noticeBoardInsert() {
		return "board/noticeBoardInsert";
	}
	
	@PostMapping("/noticeBoardInsert")
	public String noticeBoardInsertProcess(NoticeBoardDTO dto) {
		System.out.println("test");
		System.out.println("dto 값 : " + dto.toString());
		noticeBoardService.noticeBoardInsert(dto);
		return "redirect:/board/noticeBoardList";
	}
}
