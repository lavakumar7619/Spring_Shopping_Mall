package project.shopping.irepository;

import project.shopping.entites.Customer;

public interface ICustomerRepository {
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer searchCustomer(long id);
	public int deleteCustomer(long id);
}
