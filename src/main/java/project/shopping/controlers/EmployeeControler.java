package project.shopping.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import project.shopping.entites.Employee;
import project.shopping.irepository.IEmployeeRepository;

@RestController
public class EmployeeControler {
	@Autowired
	IEmployeeRepository iemp;
	@PostMapping("/addEmpl")
	public Employee addEmployee(@RequestBody Employee employee) {
		return iemp.addEmployee(employee);
	}
	@PutMapping("/editEmpl")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return iemp.updateEmployee(employee);
	}
	@GetMapping("/getEmpl/{id}")
	public Employee searchEmployee(@PathVariable long id) {
		System.out.println(id);
		return iemp.searchEmployee(id);
	}
	@DeleteMapping("/deleteEmpl/{id}")
	public boolean  deleteEmployee(@PathVariable long id) {
		return iemp.deleteEmployee(id);
	}
	
}
