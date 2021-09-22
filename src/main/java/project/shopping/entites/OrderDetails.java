package project.shopping.entites;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "Order_details")
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private long id;
	@Column(name ="dateOfPurchase" )
	LocalDateTime dateOfPurchase=LocalDateTime.now();
	private float total;
	//private List<Customer>customers;
	private enum paymentMode{ CARD , CASH , UPI , ONLINEBANKING};
	@Enumerated(EnumType.STRING)
	private paymentMode mode;
	@ManyToOne
	private Customer customer;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	//	@Autowired
//	private Shop shop;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDateTime getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(LocalDateTime dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public paymentMode getMode() {
		return mode;
	}
	public void setMode(paymentMode mode) {
		this.mode = mode;
	}
@Override
public String toString() {
	return "OrderDetails [id=" + id + ", dateOfPurchase=" + dateOfPurchase + ", total=" + total + ", mode=" + mode
			+ ", customer=" + customer + "]";
}
	
	
}
