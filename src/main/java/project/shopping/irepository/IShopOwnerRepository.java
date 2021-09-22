package project.shopping.irepository;

import project.shopping.entites.ShopOwner;

public interface IShopOwnerRepository {
	public ShopOwner addShopOwner(ShopOwner shopOwner);
	public ShopOwner updateShopOwner(ShopOwner shopOwner);
	public ShopOwner searchShopOwner(long id);
	public int deleteShopOwner(long id);
}
