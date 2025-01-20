package me.lapingcao.postgres_demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import me.lapingcao.postgres_demo.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}