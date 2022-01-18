package com.example.productservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productservice.ProductserviceApplication;

@RestController
public class ProductController {

	@Value("${server.port}")
	private String port;

	public ProductController() {
	super();
	}

	@GetMapping("/product")
	public String getPort() {
		return "El puerto del micro es " + port;
	}

}