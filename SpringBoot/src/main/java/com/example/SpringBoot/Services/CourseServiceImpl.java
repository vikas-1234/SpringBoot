package com.example.SpringBoot.Services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBoot.Domain.Course;
import com.example.SpringBoot.Repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	
	@Autowired
	
	CourseRepository repository;
	
//	List<Course> list;
//	
//	public CourseServiceImpl() {
//		super();
//		
//		list=new ArrayList<>();
//		list.add(new Course(145,"Java Core Course","'This Course contains basic of java"));
//		list.add(new Course(146,"pyhton Core Course","'This Course contains basic of python"));
//	}

	@Override
	public List<Course> getCourse() {
		
		return repository.findAll();
		
//		return list;
	}

	@Override
	public Optional<Course> getCourse(long courseId) {
		
		
//		Course c=null;
//		
//		for (Course course : list) {
//			
//			if(course.getId()==courseId)
//			{
//				c=course;
//				break;
//			}
//			
//		}
//		return c;
		
		return repository.findById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
//		return course;
		
		return repository.save(course);
	}

	@Override
	public String deleteById(Course courseId) {
		
		repository.delete(courseId);
		return "Course has been deleted *******"+ courseId;
	}

}
