package me.lapingcao.postgres_demo.repositories;

import me.lapingcao.postgres_demo.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {}