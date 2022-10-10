package com.example.SpringBoot.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot.Domain.Course;
import com.example.SpringBoot.Services.CourseService;

@RestController
public class ControllerExample {
	
	
	@Autowired
	private CourseService courseService; 
	@GetMapping("/home")
	public String home() {
		return "This is your home page!!!!";
	}
	
	@GetMapping("/about")
	public String about() {
		return "This is your about page!!!!";
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/courses")
	public List<Course> getCourses(){
		List<Course> list1 = courseService.getCourse();
		
		return list1;
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/courses/{courseId}")
	public Optional<Course> getCourse(@PathVariable String courseId) {
		
		return this.courseService.getCourse(Long.parseLong(courseId));
	
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/courses/{courseId}")
	public String deleteCourse(@PathVariable Course courseId) {
		return (String) this.courseService.deleteById(courseId);
	}

}
