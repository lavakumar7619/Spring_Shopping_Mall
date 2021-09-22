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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import project.shopping.entites.Customer;
import project.shopping.entites.Item;
import project.shopping.entites.Mall;
import project.shopping.entites.OrderDetails;
import project.shopping.entites.User;
import project.shopping.irepository.ICustomerRepository;
import project.shopping.iservice.ICustomerService;

@RestController
public class CustomerControler {
	// depedency
	@Autowired
	ICustomerRepository cr;
	@Autowired
	ICustomerService cs;

	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Login.jsp");
		return mv;
	}		 
	@RequestMapping("/shops")
	public ModelAndView shop() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Shop.jsp");
		return mv;
	}

	@RequestMapping("/items")
	public ModelAndView items() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("items.jsp");
		return mv;
	}

	// customer table curd
	@PostMapping("/addCus")
	public Customer addCustomer(@RequestBody Customer customer) {
		return cr.addCustomer(customer);
	}

	@PutMapping("/editCus")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return cr.updateCustomer(customer);
	}

	@GetMapping("/getCus/{id}")
	public Customer searchCustomer(@PathVariable long id) {
		return cr.searchCustomer(id);
	}

	@DeleteMapping("/deleteCus/{id}")
	public int deleteCustomer(@PathVariable long id) {
		return cr.deleteCustomer(id);
	}

	// customer service
	@GetMapping("/")
	public ModelAndView allUsers() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("users", cs.allUsers());
		mv.setViewName("index.jsp");
		return mv;
	}
	
//	@RequestMapping("/")
//	public ModelAndView allUsers() {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("users", cs.allUsers());
//		mv.setViewName("NewFile.jsp");
//		return mv;
//	}
	@GetMapping("/getItem")
	public List<Item> searchItem(@RequestParam(name = "itemName") String itemName) {
		return cs.searchItem(itemName);
	}

	@GetMapping("/shopItems/{shopid}")
	public List<Item> shopitems(@PathVariable long shopid) {
		return cs.shopitems(shopid);
	}

	@GetMapping("/mall/{id}")
	public Mall searchMall(@PathVariable long id) {
		return cs.searchMall(id);
	}

	@DeleteMapping("/deleteOrder/{orderId}")
	public boolean cancelOrder(@PathVariable long orderId) {
		return cs.cancelOrder(orderId);
	}

	@GetMapping("/user/{id}")
	public User login(@PathVariable long id) {
		return cs.login(id);
	}

	@RequestMapping("/logout")
	public boolean logout() {
		return cs.logout();
	}

	@PostMapping("/addOrderDetails")
	public OrderDetails addOrder(@RequestBody OrderDetails order) {
		return cs.addOrder(order);
	}

	@RequestMapping("/payment")
	public ModelAndView payment(@RequestParam(name = "total") float total) {
		ModelAndView mv = new ModelAndView();
		System.out.println(total);
		mv.addObject("price", total);
		mv.setViewName("buy.jsp");
		return mv;
	}

	@RequestMapping("/ordersData")
	public ModelAndView orderData() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("orders.jsp");
		return mv;
	}

	@RequestMapping("/register")
	public ModelAndView Register() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("register.jsp");
		return mv;
	}

	@RequestMapping("/editUser")
	public ModelAndView editUser() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("editUser.jsp");
		return mv;
	}
}
