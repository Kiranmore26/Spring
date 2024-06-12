package com.practice.Entity;

import com.practice.Enum.Gender;
import com.practice.Enum.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentDetails")
public class StudentsEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StudentId")
	private Integer studentId;
	
	@Column(name = "FirstName")
	private String studentFirstName;
	
	@Column(name = "LastName")
	private String studentLastName;
	
	@Column(name = "RollNo")
	private Integer studentRollNo;
	
	@Column(name = "Address")
	private String studentAddress;
	
	@Column(name = "Age")
	private Integer studentAge;
	
	
	@Column(name = "Gender")
	@Enumerated(EnumType.STRING)
	private Gender studentGender;
	
	
	@Column(name = "MobileNo")
	private String studentMobile;
	
	
	@Column(name = "Gmail")
	private String studentMailId;
	
	@Column(name = "Status")
	@Enumerated(EnumType.STRING)
	private Status status;

	public StudentsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentsEntity(Integer studentId, String studentFirstName, String studentLastName, Integer studentRollNo,
			String studentAddress, Integer studentAge, Gender studentGender, String studentMobile, String studentMailId,
			Status status) {
		super();
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentRollNo = studentRollNo;
		this.studentAddress = studentAddress;
		this.studentAge = studentAge;
		this.studentGender = studentGender;
		this.studentMobile = studentMobile;
		this.studentMailId = studentMailId;
		this.status = status;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public Integer getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(Integer studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	public Gender getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(Gender studentGender) {
		this.studentGender = studentGender;
	}

	public String getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}

	public String getStudentMailId() {
		return studentMailId;
	}

	public void setStudentMailId(String studentMailId) {
		this.studentMailId = studentMailId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	
	
	
}
