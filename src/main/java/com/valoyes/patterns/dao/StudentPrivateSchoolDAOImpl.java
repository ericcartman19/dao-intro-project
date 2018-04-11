package com.valoyes.patterns.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentPrivateSchoolDAOImpl implements StudentPrivateSchoolDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;  
	
	@Override
	public void create(StudentPrivateSchool student) {

		String sql = "insert into student_private_school values (?, ?, ?)";
		jdbcTemplate.update(sql, student.getId(), student.getName(), student.getSchoolName());
	}

	@Override
	public void delete(int id) {
		
		String sql = "delete from student_private_school where id = ?";
		jdbcTemplate.update(sql, id);
	}

	
}
