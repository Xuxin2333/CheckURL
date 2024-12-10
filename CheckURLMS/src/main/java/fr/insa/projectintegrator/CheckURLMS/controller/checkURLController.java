package fr.insa.projectintegrator.CheckURLMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import fr.insa.projectintegrator.CheckURLMS.service.checkURLService;

public class checkURLController {
	
	@Autowired
    private checkURLService checkURLService;
	
	@GetMapping("/")
    public String getConnection () {
		return checkURLService.TestConnection();
    }
	

}
