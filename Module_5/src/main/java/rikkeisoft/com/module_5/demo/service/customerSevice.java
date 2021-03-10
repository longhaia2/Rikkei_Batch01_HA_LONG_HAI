package rikkeisoft.com.module_5.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rikkeisoft.com.module_5.demo.Entity.Customer;
import rikkeisoft.com.module_5.demo.repository.customerRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class customerSevice {

    @Autowired
    private customerRepository repo;
    public List<Customer> listAll(){
        return repo.findAll();
    }
    public void save(Customer customer){
        repo.save(customer);
    }
    public Customer get(int maKH){
        return repo.findById(maKH).get();
    }
    public void delete(int maKh){
        repo.deleteById(maKh);
    }
}
