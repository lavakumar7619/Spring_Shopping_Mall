package project.shopping.iservice;

import project.shopping.entites.Employee;

public interface IEmployeeService {
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee searchEmployee(long id);
	public boolean  deleteEmployee(long id);
}
