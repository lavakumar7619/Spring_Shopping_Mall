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
import project.shopping.entites.Item;
import project.shopping.entites.Shop;
import project.shopping.irepository.IShopRepository;
import project.shopping.iservice.IShopService;

@RestController
public class ShopControler {
	@Autowired
	IShopService shopSer;
	
	//CURD operation for ishoprepo present in shopservice so not writting 4 similar mamping again
	@Autowired
	IShopRepository shopRepo;
	@PostMapping("/addShop")
	public Shop addShop(@RequestBody Shop shop) {
		return shopSer.addShop(shop);
	}
	@PutMapping("/editShop")
	public Shop updateShop(@RequestBody Shop shop) {
		return shopSer.updateShop(shop);
	}
	@GetMapping("getShop/{id}")
	public Shop searchShopById(@PathVariable long id) {
		return shopSer.searchShopById(id);
	}
	@DeleteMapping("/deleteShop/{id}")
	public boolean deleteShop(@PathVariable long id) {
		return shopSer.deleteShop(id);
	}
	@PostMapping("/addEmploye")
	public boolean addEmployee(@RequestBody Employee employee) {
		return shopSer.addEmployee(employee);
	}
	@PutMapping("/editEmployee")
	public boolean updateEmployee(@RequestBody Employee employee) {
		return shopSer.updateEmployee(employee);
	}
	@PostMapping("/addItemss")
	public Item addItem(@RequestBody Item item) {
		return shopSer.addItem(item);
	}
}
