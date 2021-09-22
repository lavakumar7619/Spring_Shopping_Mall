package project.shopping.entites;

import java.rmi.dgc.Lease;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "Shop")
public class Shop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "shop_id")
	private long shopId;
	private enum shopCategory{ WHOLESALE , RETAIL };
	@Enumerated(EnumType.STRING)
	private shopCategory category;
	@OneToMany
//	@JoinColumn(name ="shop_fk",referencedColumnName ="shop_id" )
	private List<Employee>shopEmployees; 
	private String shopName;
	@OneToMany
//	@JoinColumn(name ="shop_fk",referencedColumnName ="shop_id" )
	private List<Item> items;
	private enum shopStatus{ OPEN , CLOSED};
	@Enumerated(EnumType.STRING)
	private shopStatus status;
//	@Autowired
//	private ShopOwner shopOwner;
	private Lease leaseStatus;
	public long getShopId() {
		return shopId;
	}
	public void setShopId(long shopId) {
		this.shopId = shopId;
	}
	public shopCategory getCategory() {
		return category;
	}
	public void setCategory(shopCategory category) {
		this.category = category;
	}
	public List<Employee> getShopEmployees() {
		return shopEmployees;
	}
	public void setShopEmployees(List<Employee> shopEmployees) {
		this.shopEmployees = shopEmployees;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public shopStatus getStatus() {
		return status;
	}
	public void setStatus(shopStatus status) {
		this.status = status;
	}
	public Lease getLeaseStatus() {
		return leaseStatus;
	}
	public void setLeaseStatus(Lease leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", category=" + category + ", shopEmployees=" + shopEmployees + ", shopName="
				+ shopName + ", items=" + items + ", status=" + status + ", leaseStatus=" + leaseStatus + "]";
	}
	
}
