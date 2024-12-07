package com.klef.jfsd.exam.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientServiceImpl implements ClientService
{
	@Autowired
	public RestTemplate restTemplate;

	@Override
	public List<Object> getcomments() 
	{
		Object[] posts = restTemplate.getForObject("https://jsonplaceholder.typicode.com/comments", Object[].class);
	    return Arrays.asList(posts);
	}
	
}
