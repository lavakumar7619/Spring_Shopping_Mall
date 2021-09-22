package project.shopping.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.shopping.entites.User;
import project.shopping.irepository.IUserRepository;
import project.shopping.iservice.IUserService;

@RestController
public class UserControler {
	@Autowired
	IUserRepository irp;
	@Autowired
	IUserService ius;
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return irp.addUser(user);
	}
	@PutMapping("/editUser")
	public User updateUser(@RequestBody User user) {
		return irp.updateUser(user);
	}
	@DeleteMapping("/deleteUser/{id}")
	public int deleteUser(@PathVariable long id) {
		return irp.deleteUser(id);
	}
	@GetMapping("/getUser/{id}")
	public User login(@PathVariable long id) {
		return ius.login(id);
	}
//	@RequestMapping("/logout")
//	public boolean logout() {
//		return ius.logOut();
//	}
}
