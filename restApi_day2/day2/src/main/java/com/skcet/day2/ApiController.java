package com.skcet.day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@Value("${studentName}")
    private String name;

    @GetMapping("/")
    public String display()
    {
    	return "My name is "+name;
    }
}
