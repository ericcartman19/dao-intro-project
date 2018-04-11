package com.valoyes.patterns.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DaoIntroProjectApplicationTests {

	// Spring automaticamente inyecta EmployeeDAOImpl al ser la unica clase
	// que implement EmployeeDAO
	@Autowired
	EmployeeDAO employeeDao;
	
	@Autowired
	StudentPrivateSchoolDAO studentDao;
	
	@Test
	public void test_createMethod() {
		Employee employee = new Employee();
		employee.setId(345);
		employee.setName("Elito");
		employeeDao.create(employee);
	}
	
	@Test
	public void test_createStudent() {
		StudentPrivateSchool student = new StudentPrivateSchool();
		student.setId(2);
		student.setName("Tom Riddle");
		student.setSchoolName("Slytherin");
		studentDao.create(student);
	}
	
	@Test
	public void tes_deleteStudent() {
		studentDao.delete(2);
	}

}
