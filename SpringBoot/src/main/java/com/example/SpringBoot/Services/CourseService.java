package com.example.SpringBoot.Services;

import java.util.List;
import java.util.Optional;

import com.example.SpringBoot.Domain.Course;

public interface CourseService {

	public List<Course> getCourse();

	public Optional<Course> getCourse(long courseId);

	public Course addCourse(Course course);

	public String deleteById(Course courseId);
}
