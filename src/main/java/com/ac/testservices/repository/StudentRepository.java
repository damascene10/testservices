package com.ac.testservices.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ac.testservices.model.Student;
@Repository
public interface StudentRepository  extends JpaRepository<Student,Long>{
@Query("SELECT s from Student s WHERE s. email=?1")
	Student findByEmail(String email);
	@Query("SELECT s FROM Student s WHERE s.firstName=?1 AND s.age=?2")
	List<Student> findByFirstNameEqualsAndAgeEquals(String firstName, int age);

	@Query(value="SELECT * FROM student WHERE first_name=:firstName AND age=:age",nativeQuery=true)
	List<Student> findByFirstNameAndAge(@Param("firstName")String firstName, @Param("age")int age);
	@Modifying
	@Query("DELETE FROM Student s WHERE s.id=?1")
	void deleteSTudentById(Long id);
}
