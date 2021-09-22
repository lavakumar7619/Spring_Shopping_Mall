package project.shopping.davo;

import org.springframework.data.jpa.repository.JpaRepository;

import project.shopping.entites.Customer;

public interface CustomerDavo extends JpaRepository<Customer, Long>{

}
