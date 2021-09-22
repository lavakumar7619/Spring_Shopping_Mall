package project.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.shopping.davo.CustomerDavo;
import project.shopping.davo.ItemsDavo;
import project.shopping.davo.MallDavo;
import project.shopping.davo.OrderDetailsDavo;
import project.shopping.davo.UserDavo;
import project.shopping.entites.Customer;
import project.shopping.entites.Item;
import project.shopping.entites.Mall;
import project.shopping.entites.OrderDetails;
import project.shopping.entites.User;
import project.shopping.irepository.ICustomerRepository;
import project.shopping.iservice.ICustomerService;
@Service
public class CustomerService implements ICustomerRepository,ICustomerService{
	@Autowired
	CustomerDavo cd;
	@Autowired
	ItemsDavo id;
	@Autowired
	UserDavo ud;
	@Autowired
	MallDavo md;
	@Autowired
	OrderDetailsDavo od;
	

	@Override
	public List<User> allUsers() {
		return ud.findAll();
	}

	@Override
	public List<Item> searchItem(String itemName) {
		System.out.println(itemName);
		return id.searchItem(itemName);
	}

	@Override
	public List<Item> shopitems(long shopid) {
		return id.findshopBy(shopid);
	}

	@Override
	public Mall searchMall(long id) {
		// TODO Auto-generated method stub
		return md.findById(id).get();
	}

	@Override
	public boolean cancelOrder(long orderId) {
		od.deleteById(orderId);
		return false;
	}

	@Override
	public User login(long id) {
		return ud.findById(id).get();
	}

	
	//customer repo
	@Override
	public boolean logout() {
		return false;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return cd.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return cd.save(customer);
	}

	@Override
	public Customer searchCustomer(long id) {
		return cd.findById(id).get();
	}

	@Override
	public int deleteCustomer(long id) {
		cd.deleteById(id);
		return 0;
	}

	@Override
	public OrderDetails addOrder(OrderDetails order) {
		// TODO Auto-generated method stub
		return od.save(order);
	}

}
