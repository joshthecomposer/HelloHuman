package com.jw.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping("/")
	public String index(
			@RequestParam(value="name", required=false) String nameQuery,
			@RequestParam(value="lname", required=false) String lnameQuery,
			@RequestParam(value="times", required=false) String times
			) {
		String query = "Welcome to the app, ";
		if (nameQuery != null) {
			query += nameQuery;
		}
		if (lnameQuery != null) {
			query += lnameQuery;
		}
		String temp = query;
		if (times != null) {
			for(int i = 0; i < Integer.parseInt(times) - 1; i++) {
				query += temp;
			}
		}
		return query;
	}
}
