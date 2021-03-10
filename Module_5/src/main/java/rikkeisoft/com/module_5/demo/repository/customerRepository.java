package rikkeisoft.com.module_5.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rikkeisoft.com.module_5.demo.Entity.Customer;

public interface customerRepository extends JpaRepository<Customer, Integer> {
}
