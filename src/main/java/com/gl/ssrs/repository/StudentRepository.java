/**
 * 
 */
package com.gl.ssrs.repository;

/**
 * 
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.ssrs.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}