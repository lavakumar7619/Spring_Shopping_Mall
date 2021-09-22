package project.shopping.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import project.shopping.entites.ShopOwner;
import project.shopping.service.ShopOwnerService;

@RestController
public class ShopOwnerControlers {
	@Autowired
	ShopOwnerService sos;
	@GetMapping("/owner/{id}")
	public ShopOwner searchShopOwner(@PathVariable long id) {
		return sos.searchShopOwner(id);
	}
	@PostMapping("/addOwner")
	public ShopOwner addShopOwner(@RequestBody ShopOwner shopOwner) {
		return sos.addShopOwner(shopOwner);
	}
	@PutMapping("/editOwner")
	public ShopOwner updateShopOwner(@RequestBody ShopOwner shopOwner) {
		return sos.updateShopOwner(shopOwner);
	}
	@DeleteMapping("/deleteOwner/{id}")
	public int deleteShopOwner(@PathVariable long id) {
		return sos.deleteShopOwner(id);
	}
	
}
