package com.practice.exp.controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.exp.beans.Student;
import com.practice.exp.beans.StudentRegistration;
import com.practice.exp.beans.*;

//@Controller
@RestController
public class StudentRetrieveController {

	@RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
	 @ResponseBody	
	  public List<Student> getAllStudents() {
	//public @ResponseBody List<Student> getAllStudents() {
	  return StudentRegistration.getInstance().getStudentRecords();
	  }
	

}
