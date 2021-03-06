package org.study.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.study.home.model.Criteria;
import org.study.home.model.NoticeBoardDTO;
import org.study.home.model.PageMakerDTO;
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
		noticeBoardService.noticeBoardInsert(dto);
		return "redirect:/noticeBoardList";
	}
	
	@GetMapping("/noticeBoardList")
	public String noticeBoardList(Model model, Criteria cri) {
		int total = noticeBoardService.getTotal();
       model.addAttribute("list", noticeBoardService.getListPaging(cri));
       PageMakerDTO pageMake = new PageMakerDTO(cri, total);
       model.addAttribute("pageMaker", pageMake); 
       
		return "board/noticeBoardList";
	}
	
	@GetMapping("/noticeBoardRead")
	public String noticeBoardRead(@RequestParam("notice_no") String notice_no, Model model) {
		noticeBoardService.noticeBoardViewCount(notice_no);
		NoticeBoardDTO dto = noticeBoardService.noticeBoardRead(notice_no);
		model.addAttribute("dto", dto);
		return "board/noticeBoardRead";
	}
	
	@GetMapping("/noticeBoardByCount")
	public String noticeBoardByCount(Model model, Criteria cri) {
		List<NoticeBoardDTO> list = noticeBoardService.noticeBoardByCount();
		model.addAttribute("list", list);
		return "board/noticeBoardList";
	}
	
	@GetMapping("/boardSearch")
	public String boardSearch(@RequestParam("boardSearch") Model model, Criteria cri) {
		List<NoticeBoardDTO> list = noticeBoardService.noticeBoardList();
		model.addAttribute("list", list);
		return "board/noticeBoardList";
	}
	

}
