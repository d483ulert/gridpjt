package com.my.gridpjt.boardcontroller;
import com.my.gridpjt.service.*;
import com.my.gridpjt.domain.BoardVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.log4j.Log4j;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Log4j
@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	private BoardService service;
	
	@GetMapping("/list")
	public void list(Model model)
	{
		model.addAttribute("list",service.getList());
	}
}
