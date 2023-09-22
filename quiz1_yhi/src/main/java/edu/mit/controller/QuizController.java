package edu.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuizController {

	@GetMapping("/quiz/quiz1")
	public void quiz(Model model) {
		model.addAttribute("today", "오늘은 금요일");
	}
	
}
