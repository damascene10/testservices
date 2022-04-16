package com.ac.testservices;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;


import com.ac.testservices.model.Student;
import com.ac.testservices.model.StudentLaptop;
import com.ac.testservices.repository.StudentLaptopRepository;
import com.ac.testservices.repository.StudentRepository;
import com.github.javafaker.Faker;

@SpringBootApplication
public class TestservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestservicesApplication.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner(StudentLaptopRepository studentLaptopRepository, StudentRepository studentRepository ) {
		
		return args->{
			Student student=new Student("Mugabo", "Javis","mugabo.javis@gmail.com",16);
			studentRepository.save(student);
			Student student2=studentRepository.getById(1L);
			
	StudentLaptop studentLaptop=new StudentLaptop("123AAAG345", "DELL", "DELL VOSTRO", student2);
	//studentLaptopRepository.save(studentLaptop);
	
					
		};
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Bean
//	CommandLineRunner commandLineRunner(StudentRepository studentRepository ) {
//		
//		return args->{
//			
//			generateRandomStudents(studentRepository);
//			Sort sort=Sort.by(Sort.Direction.ASC, "firstName").and(Sort.by(Sort.Direction.DESC,"lastName")).and(Sort.by(Sort.Direction.ASC,"age"));
//
//			PageRequest pageRequest=PageRequest.of(0, 10,sort);
//			Page<Student> page=studentRepository.findAll(pageRequest);
//			System.out.println(page);
//					
//		};
//	}
//	private void sorting(StudentRepository studentRepository) {
//		Sort sort=Sort.by(Sort.Direction.ASC, "firstName").and(Sort.by(Sort.Direction.DESC,"lastName")).and(Sort.by(Sort.Direction.ASC,"age"));
//		studentRepository.findAll(sort).forEach(student->System.out.println(student.getFirstName()+" "+student.getLastName()+" "+ student.getAge()));
//
//	}
//		
//		private void  generateRandomStudents( StudentRepository studentRepository) {
//			Faker faker=new Faker();
//			for(int i=0; i<50;i++) {
//				String firstName=faker.name().firstName();
//				String lastName=faker.name().lastName();
//				String email=firstName+"."+lastName+"@gmail.com";
//				int age=faker.number().numberBetween(15, 30);
//				
//				Student student=new Student(firstName, lastName, email,age);
//				studentRepository.save(student);
//		
//	}
//
//}
}
