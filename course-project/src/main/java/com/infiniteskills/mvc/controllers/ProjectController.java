package com.infiniteskills.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infiniteskills.mvc.data.services.ProjectService;

@Controller
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value="/find")
	public String find(Model model){
		model.addAttribute("projects", this.projectService.findAll());
		return "projects";
	}

	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addProject(){
		System.out.println("invoking addProject");
		return "project_add";
	}

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String saveProject(){
		System.out.println("invoking saveProject");
		return "project_add";
	}

	@RequestMapping(value="/add", method=RequestMethod.POST, params={"type=multi"})
	public String saveMultiYearProject(){
		System.out.println("invoking saveMultiYearProject");
		return "project_add";
	}

	@RequestMapping(value="/add", method=RequestMethod.POST, params={"type=multi","special"})
	public String saveSpecialProject(){
		System.out.println("invoking saveSpecialProject");
		return "project_add";
	}
}
