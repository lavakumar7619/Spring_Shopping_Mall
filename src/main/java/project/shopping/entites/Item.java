package project.shopping.entites;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity(name ="Item")

public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Item_id")
	private long id;
	private String itemName;
	private double price;
	private LocalDate manufacturingDate;
	private LocalDate expiry;
	@ManyToOne
	private Shop shop;
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	private enum category{ CLOTHING, MOBILES, ACCESSIORIES }
	@Enumerated(EnumType.STRING)
	private category item_category;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public LocalDate getExpiry() {
		return expiry;
	}
	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}
	public category getItem_category() {
		return item_category;
	}
	public void setItem_category(category item_category) {
		this.item_category = item_category;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", price=" + price + ", manufacturingDate="
				+ manufacturingDate + ", expiry=" + expiry + ", shop=" + shop + ", item_category=" + item_category
				+ "]";
	}
	
}
