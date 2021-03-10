package rikkeisoft.com.module_5.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rikkeisoft.com.module_5.demo.Entity.Customer;
import rikkeisoft.com.module_5.demo.Entity.Employee;
import rikkeisoft.com.module_5.demo.repository.customerRepository;
import rikkeisoft.com.module_5.demo.repository.employeeRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class employeeSevice {
    @Autowired
    private employeeRepository repo;
    public List<Employee> listAll(){
        return repo.findAll();
    }
    public void save(Employee em){
        repo.save(em);
    }
    public Employee get(int maNV){
        return repo.findById(maNV).get();
    }
    public void delete(int maNV){
        repo.deleteById(maNV);
    }
}

