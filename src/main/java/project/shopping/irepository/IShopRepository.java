package project.shopping.irepository;

import project.shopping.entites.Shop;

public interface IShopRepository {
	public Shop addShop(Shop shop);
	public Shop updateShop(Shop shop);
	public Shop searchShopById(long id);
	public boolean deleteShop(long id);
}
