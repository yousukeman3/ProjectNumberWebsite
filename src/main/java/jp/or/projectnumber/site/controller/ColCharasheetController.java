package jp.or.projectnumber.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/col/sheet")
public class ColCharasheetController {
	
	@GetMapping("chara")
	public String getSheet() {
		log.info("繋がったよ");
		return "/col/sheet/chara";
	}

}
