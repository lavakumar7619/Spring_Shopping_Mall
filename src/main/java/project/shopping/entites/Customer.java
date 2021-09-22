package project.shopping.entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@Column(name = "customer_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
//	@OneToMany(targetEntity =OrderDetails.class,cascade = CascadeType.ALL)
//	@JoinColumn(name ="cu_fk",referencedColumnName ="customer_id" )
	@OneToMany
	private List<OrderDetails> orders;
	private long phone;
	private String email;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="user_id",referencedColumnName ="user_id" )
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<OrderDetails> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderDetails> orders) {
		this.orders = orders;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", orders=" + orders + ", phone=" + phone + ", email=" + email
				+ ", user=" + user + "]";
	}
	
}
