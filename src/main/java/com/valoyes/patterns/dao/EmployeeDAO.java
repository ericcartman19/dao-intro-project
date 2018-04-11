package com.valoyes.patterns.dao;

/**
 * Interface that enforces the DAO pattern (meaning 
 * CRUD operations for the employee table and entity)
 */
public interface EmployeeDAO {

	void create(Employee employee);
}
