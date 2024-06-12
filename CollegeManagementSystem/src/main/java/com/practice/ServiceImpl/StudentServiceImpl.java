package com.practice.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.Dto.StudentDto;
import com.practice.Entity.StudentsEntity;
import com.practice.Enum.Status;
import com.practice.Repository.StudentRepository;
import com.practice.Services.StudentService;

import jakarta.servlet.http.HttpServletRequest;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	StudentRepository studentRepository;

	@Override
	public StudentsEntity createStudent(StudentDto studentDto, HttpServletRequest httpServletRequest) 
	{
		// TODO Auto-generated method stub
		StudentsEntity studentsEntity = new StudentsEntity();
		
		studentsEntity.setStudentFirstName(studentDto.getStudentFirstName());
		studentsEntity.setStudentLastName(studentDto.getStudentLastName());
		studentsEntity.setStudentAddress(studentDto.getStudentAddress());
		studentsEntity.setStudentAge(studentDto.getStudentAge());
		studentsEntity.setStudentGender(studentDto.getStudentGender());
		studentsEntity.setStudentMailId(studentDto.getStudentMailId());
		studentsEntity.setStudentMobile(studentDto.getStudentMobile());
		studentsEntity.setStudentRollNo(studentDto.getStudentRollNo());
		
		studentRepository.save(studentsEntity);
		return null;
	}

	@Override
	public List<StudentsEntity> displayAllDetails() 
	{
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public StudentsEntity displayById(Integer id) 
	{
		StudentsEntity  studentsEntity=studentRepository.findById(id).get();
		
		if(studentsEntity!=null)
		{
			return studentsEntity;
		}
		else
		{
			throw new IllegalArgumentException("Id Not Available");
		}
		
		
	}

	@Override
	public void delete(Integer id) 
	{
		
		StudentsEntity  studentsEntity=studentRepository.findById(id).get();
		
		if(studentsEntity!=null)
		{
			studentsEntity.setStatus(Status.Inactive);
		}
		else
		{
			throw new IllegalArgumentException("Id Not Available");
		}
		
	}

	@Override
	public StudentsEntity update(StudentDto studentDto, Integer id) 
	{
		// TODO Auto-generated method stub
		
		StudentsEntity  studentsEntity=studentRepository.findById(id).get();
		if(studentsEntity!=null)
		{
			
		}
		else
		{
			
		}
		return null;
	}

}
