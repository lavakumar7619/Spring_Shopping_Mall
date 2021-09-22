package project.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.shopping.davo.MallDavo;
import project.shopping.entites.Mall;
import project.shopping.entites.MallAdmin;
import project.shopping.irepository.IMallAdminRepository;
import project.shopping.irepository.IMallRepository;
@Service
public class MallService implements IMallRepository {
	@Autowired
	MallDavo md;

	@Override
	public Mall addMall(Mall mall) {
		// TODO Auto-generated method stub
		return md.save(mall);
	}

	@Override
	public Mall updateMall(Mall mall) {
		// TODO Auto-generated method stub
		return md.save(mall);
	}

	@Override
	public Mall searchMall(long id) {
		// TODO Auto-generated method stub
		return md.findById(id).get();
	}
	

}
