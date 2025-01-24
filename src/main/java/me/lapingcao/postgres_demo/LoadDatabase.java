package me.lapingcao.postgres_demo;

import me.lapingcao.postgres_demo.entities.Department;
import me.lapingcao.postgres_demo.entities.Employee;
import me.lapingcao.postgres_demo.repositories.DepartmentRepository;
import me.lapingcao.postgres_demo.repositories.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        String logText = "Preloading {}";
        return args -> {
            // Department initialization
            log.info(logText, departmentRepository.save(new Department(
                        "Software Development"
                    )
            ));
            log.info(logText, departmentRepository.save(new Department(
                        "Software Testing"
                    )
            ));
            log.info(logText, departmentRepository.save(new Department(
                        "Marketing"
                    )
            ));
            log.info(logText, departmentRepository.save(new Department(
                        "Administration"
                    )
            ));
            log.info(logText, departmentRepository.save(new Department(
                        "Sales"
                    )
            ));

            // Employee initialization
            log.info(logText, employeeRepository.save(new Employee(
                    "S000000001",
                    "Sarah",
                    (long) 1
            )));
            log.info(logText, employeeRepository.save(new Employee(
                    "J000000001",
                    "John",
                    (long) 2
            )));
            log.info(logText, employeeRepository.save(new Employee(
                    "W000000001",
                    "Winston",
                    (long) 3
            )));
        };
    }
}
