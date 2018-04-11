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
	
	@Test
	public void test_createMethod() {
		Employee employee = new Employee();
		employee.setId(345);
		employee.setName("Elito");
		employeeDao.create(employee);
	}

}
