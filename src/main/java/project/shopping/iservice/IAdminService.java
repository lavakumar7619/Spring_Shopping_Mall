package project.shopping.iservice;

import project.shopping.entites.Shop;
import project.shopping.entites.User;

public interface IAdminService {
	public boolean approveNewShop(Shop shop);
	public User updateUser(User user);
	public User login(User user);
	public boolean logOut();
}
