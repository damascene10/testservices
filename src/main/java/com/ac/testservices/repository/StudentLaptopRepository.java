package com.ac.testservices.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ac.testservices.model.StudentLaptop;
@Repository
public interface StudentLaptopRepository  extends CrudRepository<StudentLaptop, Long>{

}
