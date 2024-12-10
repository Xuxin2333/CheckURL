package fr.insa.projectintegrator.CheckURLMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import fr.insa.projectintegrator.CheckURLMS.repository.checkURLRepository;

public class checkURLService {

	@Autowired
	private checkURLRepository checkURLRepository;
	
		
	public String TestConnection() {
		return "Good connection";
	}
	
	
}
