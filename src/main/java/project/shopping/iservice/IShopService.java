package project.shopping.iservice;

import project.shopping.entites.Employee;
import project.shopping.entites.Item;
import project.shopping.entites.Shop;

public interface IShopService {
	public Shop addShop(Shop shop);
	public Shop updateShop(Shop shop);
	public Shop searchShopById(long id);
	public boolean deleteShop(long id);
	public boolean addEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public Item addItem(Item item);
}
