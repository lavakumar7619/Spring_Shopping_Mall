package project.shopping.davo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import project.shopping.entites.Item;

public interface ItemsDavo extends JpaRepository<Item, Long>{
	
	@Query("SELECT itemName FROM Item WHERE itemName LIKE %?1%")
	public List<Item> searchItem(String itemName);
	@Query("SELECT itemName FROM Item WHERE shop=?1 ")
	public List<Item> findshopBy(long shopid);
}
