package com.zenosys.vinod.lo4j2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zenosys.vinod.lo4j2.entity.Student;
import com.zenosys.vinod.lo4j2.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public Student findStudentById(final int id) {
		return studentRepository.findOne(id);
	}

	public List<Student> findAllStudent() {
		return studentRepository.findAll();
	}

	public Student saveStudent(final Student student) {
		return studentRepository.save(student);
	}

	public void deleteStudentById(final int id) {
		studentRepository.delete(id);
	}
}
