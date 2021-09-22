package project.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.shopping.davo.EmployeeDavo;
import project.shopping.entites.Employee;
import project.shopping.irepository.IEmployeeRepository;
import project.shopping.iservice.IEmployeeService;
@Service
public class EmployeeService implements IEmployeeRepository,IEmployeeService{
	@Autowired
	EmployeeDavo ed;
	@Override
	public Employee addEmployee(Employee employee) {
		return ed.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return ed.save(employee);
	}

	@Override
	public Employee searchEmployee(long id) {
		return ed.findById(id).get();
	}

	@Override
	public boolean deleteEmployee(long id) {
		ed.deleteById(id);
		return false;
	}

}
