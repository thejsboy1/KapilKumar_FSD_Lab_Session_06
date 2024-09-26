package com.gl.ssrs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/tasks")
	public List<Task> listTasks() {

		List<Task> tasks = new ArrayList<>();

		Task t1 = new Task();
		t1.setName("t1");
		t1.setDescription("task description");

		Task t2 = new Task();
		t2.setName("t2");
		t2.setDescription("task description");

		tasks.add(t1);
		tasks.add(t2);

		return tasks;
	}
}

class Task {
	String name;
	String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}