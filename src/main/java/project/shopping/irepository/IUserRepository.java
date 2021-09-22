package project.shopping.irepository;

import project.shopping.entites.User;

public interface IUserRepository {
	public User addUser(User user);
	public User updateUser(User user);
	public int deleteUser(long id);
}
