package com.practice.Services;

import java.util.List;

import com.practice.Dto.StudentDto;
import com.practice.Entity.StudentsEntity;

import jakarta.servlet.http.HttpServletRequest;

public interface StudentService 
{
	StudentsEntity createStudent(StudentDto studentDto,HttpServletRequest httpServletRequest);
	 
	List<StudentsEntity>  displayAllDetails();
	
	StudentsEntity displayById(Integer id);
	
	void delete(Integer id);
	
	StudentsEntity update(StudentDto studentDto, Integer id);
	
}
