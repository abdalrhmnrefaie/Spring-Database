package com.abdalrhmn.dao;

import java.util.List;

import javax.sql.DataSource;

import com.abdalrhmn.models.Student;

public interface StudentDAO {

	List<Student>getAllStudents();
	void saveStudent(Student student);
	Student getStudentById(int id);
	int update(Student student);
	int delete(int id);
	
	public void setDataSource(DataSource ds);
}
