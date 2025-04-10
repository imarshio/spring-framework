package org.springframework.demo.controller;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldController {

	static {
		System.out.println("HelloWorldController static block");
	}

	public HelloWorldController() {
		System.out.println("HelloWorldController");
	}

	public String sayHello() {
		return "Hello World!";
	}
}
