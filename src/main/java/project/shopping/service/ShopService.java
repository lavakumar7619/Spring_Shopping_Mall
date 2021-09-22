package project.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.shopping.davo.EmployeeDavo;
import project.shopping.davo.ItemsDavo;
import project.shopping.davo.ShopDavo;
import project.shopping.entites.Employee;
import project.shopping.entites.Item;
import project.shopping.entites.Shop;
import project.shopping.irepository.IShopRepository;
import project.shopping.iservice.IShopService;
@Service
public class ShopService  implements IShopRepository,IShopService{
	@Autowired
	ShopDavo sdd;
	@Autowired
	ItemsDavo itd;
	@Autowired
	EmployeeDavo empd;
	@Override
	public boolean addEmployee(Employee employee) {
		empd.save(employee);
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		empd.save(employee);
		return true;
	}

	@Override
	public Item addItem(Item item) {
		return itd.save(item);
	}

	//curd operation for shop
	@Override
	public Shop addShop(Shop shop) {
		return sdd.save(shop);
	}

	@Override
	public Shop updateShop(Shop shop) {
		return sdd.save(shop);
	}

	@Override
	public Shop searchShopById(long id) {
		return sdd.findById(id).get();
	}

	@Override
	public boolean deleteShop(long id) {
		sdd.deleteById(id);
		return false;
	}

}
