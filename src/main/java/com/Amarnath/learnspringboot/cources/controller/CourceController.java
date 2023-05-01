package com.Amarnath.learnspringboot.cources.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Amarnath.learnspringboot.cources.bean.Course;
import com.Amarnath.learnspringboot.cources.repository.CourseRepository;

@RestController
public class CourceController {

	@Autowired
	private CourseRepository repository;

	// http:localhost:8000/amar
	@GetMapping("/amar")
	public List<Course> getCourses1() {

		return repository.findAll();

		// return List.of(new Course(1, "Learn Spring Boot", "Amarnath Sah"), new
		// Course(2, "Java", "Amarnath Sah"));

	}

	// http:localhost:8000/amar/1
	@GetMapping("amar/{id}")
	public Course getCourses2(@PathVariable long id) {

		Optional<Course> course = repository.findById(id);
		if (course.isEmpty()) {
			throw new RuntimeException("Course not found with id = " + id + " Error 404");
		}
		return course.get();
		// return new Courses2(2, "Python", "Amarnath Sah");

		// http:localhost:8000/h2-console
	}

	@PostMapping("/amar")
	public void createCourse(@RequestBody Course course) {

		repository.save(course);

	}

	@PutMapping("/amar/{id}")
	public void updateCourse(@PathVariable long id, @RequestBody Course course) {
		repository.save(course);
	}

	@DeleteMapping("/amar/{id}")
	public void deleteCourse(@PathVariable long id) {
		Optional<Course> coursea = repository.findById(id);
		if (coursea.isEmpty()) {
			throw new RuntimeException("The course you are trying to delete does not exixs " + id);

		}
		repository.deleteById(id);
	}

	// GET - To get data to the web
	// POST - To create a new data
	// PUT - To update all data
	// PATCH - To update a part of a data
	// DELETE - To delete data

}
