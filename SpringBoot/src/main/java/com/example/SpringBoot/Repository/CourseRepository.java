package com.example.SpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBoot.Domain.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

}
