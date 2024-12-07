package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.klef.jfsd.exam.service.ClientService;

@Controller
@RequestMapping("/api")
public class ClientController 
{
	@Autowired
	public ClientService clientService;
	
	@GetMapping("/getcomments")
	@ResponseBody
	public List<Object> getcomments()
	{
		return clientService.getcomments();
	}
}
