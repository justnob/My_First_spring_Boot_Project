package com.Amarnath.learnspringboot.cources.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Amarnath.learnspringboot.cources.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
	
	

}
