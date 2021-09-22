package project.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.shopping.davo.ItemsDavo;
import project.shopping.entites.Item;
import project.shopping.irepository.IItemRepository;
@Service
public class ItemsService implements IItemRepository{
	@Autowired
	ItemsDavo isd;
	@Override
	public Item addItem(Item item) {

		return isd.save(item);
	}

	@Override
	public Item updateItem(Item item) {
		
		return isd.save(item);
	}

	@Override
	public Item searchItem(long id) {
//		System.out.println(id);
//		List li=(List) isd.getById(id);
		Item i=isd.findById(id).get();
		System.out.println(i);
		return i;
	}

	@Override
	public int deleteItem(long id) {
		isd.deleteById(id);
		return 0;
	}

}
