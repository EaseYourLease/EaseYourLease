package sjsu.jentab.EaseYourLease.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BaseController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String startPage(ModelMap model) {
		return "home";
	}


	@GetMapping("/")
	public String getIndex() {
		//return "index";
		return "home";
	}
}
