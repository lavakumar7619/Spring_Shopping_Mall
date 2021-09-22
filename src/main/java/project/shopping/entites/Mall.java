package project.shopping.entites;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Mall")
public class Mall {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Mall_id")
	private long id;
//	@Autowired
//	private MallAdmin mallAdmin;
	private String mallName;
	private String location;
//	@Autowired
//	private List<Shop> shops;
	private enum categories{REGIONAL,SUPERREGIONAL};
	@Enumerated(EnumType.STRING)
	private categories mall_cat;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public categories getMall_cat() {
		return mall_cat;
	}
	public void setMall_cat(categories mall_cat) {
		this.mall_cat = mall_cat;
	}
	@Override
	public String toString() {
		return "Mall [id=" + id + ", mallName=" + mallName + ", location=" + location + ", mall_cat=" + mall_cat + "]";
	}
	
}
