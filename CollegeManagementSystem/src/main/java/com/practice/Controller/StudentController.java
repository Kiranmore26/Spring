package com.practice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.Dto.StudentDto;
import com.practice.Entity.StudentsEntity;
import com.practice.Enum.ResponseHandler;
import com.practice.Services.StudentService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class StudentController 
{
	@Autowired
	StudentService studentService ;
	
	ResponseHandler responseHandler = new ResponseHandler();
	
	@PostMapping("/create")
	public ResponseHandler createStudent(@RequestBody StudentDto studentDto,HttpServletRequest httpServletRequest) 
	{
		//TODO: process POST request
		 try
		 {
			
			 StudentsEntity student = studentService.createStudent(studentDto, httpServletRequest);
			 
			 responseHandler.setStatus(true);
			 responseHandler.setMessage("Data Saved Sucessfully");
		 }
		 catch (IllegalArgumentException e) 
		 {
			responseHandler.setStatus(false);
			responseHandler.setMessage(e.getMessage());
		 }
		 
		return responseHandler;
	}
	
	@GetMapping("/display")
	public List<StudentsEntity> displayallDetails() 
	{
		return studentService.displayAllDetails();
	}
	
	
	@GetMapping("/display/{id}")
	public StudentsEntity displaybyid(@PathVariable Integer id)
	{
		return studentService.displayById(id);
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseHandler delete(@PathVariable Integer id)
	{
		 try
		 {
			
			  studentService.delete(id);
			 
			 responseHandler.setStatus(true);
			 responseHandler.setMessage("Data Saved Sucessfully");
		 }
		 catch (IllegalArgumentException e) 
		 {
			responseHandler.setStatus(false);
			responseHandler.setMessage(e.getMessage());
		 }
		 
		return responseHandler;
	}
}

