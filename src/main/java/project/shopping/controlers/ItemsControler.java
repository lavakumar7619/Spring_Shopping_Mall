package project.shopping.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.shopping.entites.Item;
import project.shopping.irepository.IItemRepository;

@RestController
public class ItemsControler {
	@Autowired
	IItemRepository iir;
	
	@PostMapping("/addItems")
	public Item addItem(@RequestBody Item item) {
		return iir.addItem(item);
	}
	@PutMapping("/editItems")
	public Item updateItem(@RequestBody Item item) {
		return iir.updateItem(item);
	}
	
	@RequestMapping(value = "/getItem/{id}" ,method = RequestMethod.GET)
	public Item searchItem(@PathVariable long id) {
		Item i=iir.searchItem(id);
		System.out.println(i);
		return i;
	}
	@RequestMapping(value = "/deleteItem" ,method = RequestMethod.DELETE)
	public int deleteItem(@RequestParam(name="id") long id) {
		return iir.deleteItem(id);
	}
}
