package com.display;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	private Dao dao;
	@RequestMapping(value="/form" ,method=RequestMethod.POST)
	public ResponseEntity<String> addForm(Entity form){
		int add=dao.addForm(form);
	if(add>0)
		return new ResponseEntity<String>("Form is submitted", HttpStatus.OK);
	else
		return new ResponseEntity<String>("An Error Occured", HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
