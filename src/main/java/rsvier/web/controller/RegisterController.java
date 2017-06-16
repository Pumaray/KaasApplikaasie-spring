package rsvier.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import rsvier.model.Person;

//@Controller
public class RegisterController {

	private Person person;

	//@RequestMapping("/register")
	public String greeting(@RequestParam(value = "person", required = false) Person person,
			Model model) {
		// need implementation
		return "register";
	}
}
