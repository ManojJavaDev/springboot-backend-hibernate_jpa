package com.javacrud.springboot_backend.util;

import com.javacrud.springboot_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import com.javacrud.springboot_backend.repo.EmployeeRepository;

@Controller
public class DataInitializer implements CommandLineRunner {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        Employee emp1 = new Employee(123, "Manoj", "Kumar", "manoj.sde2@gmail.com", 28);
        System.out.println("emp1");
        Employee emp1saved = employeeRepository.save(emp1);
        System.out.println("Id :"+emp1saved.getId());


        Employee emp2 = new Employee(456, "papai", "paddu", "papai.paddu@gmail.com", 30);
        System.out.println("emp2");
        Employee emp2saved = employeeRepository.save(emp2);
        System.out.println("Id :"+emp2saved.getId());


        System.out.println("");

        employeeRepository.findAll().forEach(emp->{
            System.out.println("Id : "+ emp.getId());
            System.out.println("First name : "+ emp.getFirstName());

        });



    }
}
