package project.shopping.iservice;

import project.shopping.entites.User;

public interface IUserService {
	public User addUser(User user);
	public User updateUser(User user);
	public User login(long id);
	public boolean logOut();
}	
