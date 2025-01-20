package me.lapingcao.postgres_demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Employee {
    private @GeneratedValue(strategy = GenerationType.AUTO) @Id Long id;
    private @NonNull String employeeNum;
    private @NonNull String name;
    private String phone;
    private String homephone;
    private @NonNull Long departmentId;
}

