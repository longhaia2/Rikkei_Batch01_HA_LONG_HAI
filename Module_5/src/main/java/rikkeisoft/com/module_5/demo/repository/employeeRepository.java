package rikkeisoft.com.module_5.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rikkeisoft.com.module_5.demo.Entity.Employee;


public interface employeeRepository extends JpaRepository<Employee, Integer> {
}
