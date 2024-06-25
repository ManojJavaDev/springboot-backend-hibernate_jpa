package com.javacrud.springboot_backend;

import com.javacrud.springboot_backend.repo.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class SpringbootBackendApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void testEmployeeRepository(){
		long count = employeeRepository.count();
		assertThat(count).isGreaterThan(0);

	}

	@Test
	void contextLoads() {
	}

}
