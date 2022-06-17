package com.example.springbootzuulgatwayproxystudentservice;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootZuulgatwayproxyStudentServiceApplication {

	@RequestMapping(value = "/getBook/{name}")
	public String echoStudentName(@PathVariable(name = "name") String name) {
		return "Book " + name + " Responsed on : " + new Date();
	}

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulgatwayproxyStudentServiceApplication.class, args);
	}
}

class Student {
	String name;
	String address;
	String cls;

	public Student(String name, String address, String cls) {
		super();
		this.name = name;
		this.address = address;
		this.cls = cls;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getCls() {
		return cls;
	}

}
