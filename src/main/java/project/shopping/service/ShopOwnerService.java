package project.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.shopping.davo.ShopOwnerDavo;
import project.shopping.entites.ShopOwner;
import project.shopping.irepository.IShopOwnerRepository;
@Service
public class ShopOwnerService implements IShopOwnerRepository{
	@Autowired
	ShopOwnerDavo sod;
	@Override
	public ShopOwner addShopOwner(ShopOwner shopOwner) {
		// TODO Auto-generated method stub
		return sod.save(shopOwner);
	}

	@Override
	public ShopOwner updateShopOwner(ShopOwner shopOwner) {
		// TODO Auto-generated method stub
		return sod.save(shopOwner);
	}

	@Override
	public ShopOwner searchShopOwner(long id) {
		// TODO Auto-generated method stub
		return sod.findById(id).get();
	}

	@Override
	public int deleteShopOwner(long id) {
		sod.deleteById(id);
		return 0;
	}

}
