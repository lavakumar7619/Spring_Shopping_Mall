package project.shopping.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import project.shopping.entites.Mall;
import project.shopping.irepository.IMallRepository;

@RestController
public class MallControler {
	@Autowired
	IMallRepository imr;
	@PostMapping("/addMall")
	public Mall addMall(@RequestBody Mall mall) {
		return imr.addMall(mall);
	}
	@PutMapping("/editMall")
	public Mall updateMall(@RequestBody Mall mall) {
		return imr.updateMall(mall);
	}
	@GetMapping("/getMall/{id}")
	public Mall searchMall(@PathVariable long id) {
		return imr.searchMall(id);
	}
}
