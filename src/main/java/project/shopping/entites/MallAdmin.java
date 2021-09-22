package project.shopping.entites;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Mall_Admin")
public class MallAdmin {
	@Id
	@Column(name = "mallAdmin_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String password;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="Mall_id",referencedColumnName ="Mall_id" )
	private Mall m;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="user_id",referencedColumnName ="user_id" )
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	private long phone;
	
	public Mall getM() {
		return m;
	}
	public void setM(Mall m) {
		this.m = m;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "MallAdmin [id=" + id + ", name=" + name + ", password=" + password + ", m=" + m + ", user=" + user
				+ ", phone=" + phone + "]";
	}
	
}
