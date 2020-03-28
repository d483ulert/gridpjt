package com.my.gridpjt.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/member/*")
@Controller
public class MemberCotroller {
	
	@GetMapping("/All")
	public void All() {
		
	}
	
	@GetMapping("/Member")
	public void Member() {
		
	
	}

	@GetMapping("/Admin")
	public void Admin() {
		
		
	}

}
