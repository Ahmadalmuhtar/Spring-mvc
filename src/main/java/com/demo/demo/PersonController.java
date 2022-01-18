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
				new Person(1, "hadi"),
				new Person(2, "Ahmad"),
				new Person(3, "Raghad"),
				new Person(4, "Inaam")));
		return "persons";
	}

}