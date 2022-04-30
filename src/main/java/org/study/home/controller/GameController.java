package org.study.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.study.home.model.GameDTO;
import org.study.home.service.GameService;

@Controller
public class GameController {
	
	@Autowired
	private GameService gameService;

	@GetMapping("/gameInsert")
	public String gameInsert() {
		return "game/gameInsert";
	}
	
	@PostMapping("/gameInsert")
	public String gameInsertProcess(GameDTO dto) {
		return "redirect:/gameInsert";
	}
	
	@GetMapping("/gameList")
	public String gameList(Model model) {
		List<GameDTO> list = gameService.gameList();
		model.addAttribute("list", list);
		return "game/gameList";
	}
	
	@GetMapping("/gameRead")
	public String gameRead(@RequestParam("game_no") String game_no, Model model) {
		GameDTO dto = gameService.gameRead(game_no);
		model.addAttribute("dto", dto);
		return "game/gameRead";
	}
}
