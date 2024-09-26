/**
 * 
 */
package com.gl.ssrs.service.implementation;

/**
 * 
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.ssrs.entity.Student;
import com.gl.ssrs.repository.StudentRepository;
import com.gl.ssrs.service.StudentService;

@Service
public class StudentServiceImplementation implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {

		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	public void save(Student student) {
		studentRepository.save(student);
	}

	@Override
	public Student findById(int studentId) {
		return studentRepository.findById(studentId).get();
	}

	@Override
	public void deleteById(int id) {
		studentRepository.deleteById(id);
	}

}