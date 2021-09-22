package project.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.shopping.davo.UserDavo;
import project.shopping.entites.User;
import project.shopping.irepository.IUserRepository;
import project.shopping.iservice.IUserService;
@Service
public class UserService implements IUserRepository,IUserService{
	@Autowired
	UserDavo ud;
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return ud.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return ud.save(user);
	}

	@Override
	public int deleteUser(long id) {
		ud.deleteById(id);
		return 0;
	}

	@Override
	public User login(long id) {
		// TODO Auto-generated method stub
		return ud.findById(id).get();
	}

	@Override
	public boolean logOut() {
		// TODO Auto-generated method stub
		return false;
	}

}
