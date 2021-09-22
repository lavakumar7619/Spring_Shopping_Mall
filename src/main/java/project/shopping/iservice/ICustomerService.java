package project.shopping.iservice;

import java.util.List;

import org.springframework.stereotype.Component;

import project.shopping.entites.Item;
import project.shopping.entites.Mall;
import project.shopping.entites.OrderDetails;
import project.shopping.entites.User;

public interface ICustomerService {
	public OrderDetails addOrder(OrderDetails order);
	public List<User> allUsers();
	public List<Item> searchItem(String itemName);
	public List<Item> shopitems(long shopid);
	public Mall searchMall(long id);
	public boolean cancelOrder(long orderId);
	public User login(long id);
	public boolean logout();
}
