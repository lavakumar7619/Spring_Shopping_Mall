package project.shopping.davo;

import org.springframework.data.jpa.repository.JpaRepository;

import project.shopping.entites.Employee;

public interface EmployeeDavo  extends JpaRepository<Employee, Long>{

}
