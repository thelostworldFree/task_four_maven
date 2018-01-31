package com.fuwei.service;

import java.util.List;

import com.fuwei.pojo.Student;

public interface StudentService {

	List<Student> list();
	int count(int state);
	void add(Student s);
	void update(Student s);
	void delete(Student s);
	Student get(int id);

}
