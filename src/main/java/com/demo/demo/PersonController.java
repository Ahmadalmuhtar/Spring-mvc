package com.demo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;

@Controller
public class PersonController {

	@GetMapping("/people")
	public String greeting(Model model) {
		model.addAttribute("persons", Arrays.asList(
				new Person(1, "Ahmad"),
				new Person(2, "Luke"),
				new Person(3, "Chrisitan"),
				new Person(4, "1234")));
		return "persons";
	}

}