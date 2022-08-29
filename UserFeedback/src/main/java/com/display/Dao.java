package com.display;

import javax.swing.text.html.parser.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Dao {

	@Autowired
	private JdbcTemplate jdbctemplate;

int addForm(com.display.Entity form) {
	return jdbctemplate.update("insert into form(name,email,form) values(?,?,?)",
			form.getName(),form.getEmail(),form.getForm());
}


}
