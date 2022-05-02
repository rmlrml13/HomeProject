package org.study.home.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.study.home.model.GameDTO;
import org.study.home.service.GameService;

@Controller
public class GameController {
	
	@Autowired
	private GameService gameService;
	
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
	
	@GetMapping("/gameInsert")
	public String formFile() {
		return "game/gameInsert";
	}
	
	@PostMapping("/saveImage")
	public String saveImage(@RequestParam("file") MultipartFile file, 
			@RequestParam("game_title")String game_title,
			@RequestParam("game_price")String game_price,
			@RequestParam("game_genre_no")String game_genre_no) {
		try {
			Map<String, Object> hmap = new HashMap<String, Object>();
			hmap.put("file", file.getBytes());
			hmap.put("game_title", game_title);
			hmap.put("game_price", game_price);
			hmap.put("game_genre_no", game_genre_no);
			gameService.saveImage(hmap);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/gameList";
	}
}
