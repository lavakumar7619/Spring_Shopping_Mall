package project.shopping.irepository;

import java.util.List;

import project.shopping.entites.Item;

public interface IItemRepository {
	public Item addItem(Item item);
	public Item updateItem(Item item);
	public Item searchItem(long id);
	public int deleteItem(long id);
}
