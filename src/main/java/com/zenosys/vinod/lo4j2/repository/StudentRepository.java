package com.zenosys.vinod.lo4j2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zenosys.vinod.lo4j2.entity.Student;

/**
 * StudentRepository - All Student CRUD Operations
 * @author VPillai
 *
 */
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
