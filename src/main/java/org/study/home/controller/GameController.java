package org.study.home.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.study.home.model.Criteria;
import org.study.home.model.GameDTO;
import org.study.home.service.GameService;

@Controller
public class GameController {

	@Autowired
	private GameService gameService;

	@GetMapping("/gameList")
	public String result(Model model, Criteria cri) {
		
		List<GameDTO> jjin = gameService.jjinList();
//		int total = gameService.getTotal();
//		model.addAttribute("list", gameService.getListPaging(cri));
		List<String> imgList = new ArrayList<String>();
		for(int i = 0; i < jjin.size(); i++) {
			imgList.add("data:image/;base64,"+Base64.getEncoder().encodeToString(jjin.get(i).getFile())); 
		}
		
		model.addAttribute("jjin", jjin);
		model.addAttribute("img",imgList);
		
		return "game/gameList";
	}
	
	@GetMapping("/gameRead")
	public String gameRead(@RequestParam("game_no") String game_no, Model model) {
		GameDTO dto = gameService.gameRead(game_no);
		model.addAttribute("dto", dto);
		dto.getGame_regdate();
		dto.getFile();
		return "game/gameRead";
	}

	@GetMapping("/gameInsert")
	public String formFile() {
		return "game/gameInsert";
	}

	@PostMapping("/saveImage")
	public String saveImage(@RequestParam("file") MultipartFile file, @RequestParam("game_title") String game_title,
			@RequestParam("game_price") String game_price, @RequestParam("game_genre_no") String game_genre_no) {
		try {
			byte[] arr = file.getBytes();
			GameDTO dto = new GameDTO();
			dto.setGame_title(game_title);
			dto.setGame_price(Integer.parseInt(game_price));
			dto.setGame_genre_no(game_genre_no);
			dto.setFile(arr);
			
			gameService.newInsert(dto);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/gameList";
	}

	
	@GetMapping("gameSearch")
	public String gameSearch(@RequestParam("search") String search, Model model) {
		List<GameDTO> jjin = gameService.gameSearch(search);
		
		List<String> imgList = new ArrayList<String>();
		for(int i = 0; i < jjin.size(); i++) {
			imgList.add("data:image/jpeg;base64,"+Base64.getEncoder().encodeToString(jjin.get(i).getFile())); 
		}
		
		model.addAttribute("jjin", jjin);
		model.addAttribute("img",imgList);
		
		return "game/gameList";
	}
}
