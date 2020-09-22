package spring.mvc.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

	@RequestMapping(value = "/")
	public String index(final Model model) {
		model.addAttribute("message", "hello");
		return "index";
	}
}
