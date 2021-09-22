package project.shopping.davo;

import org.springframework.data.jpa.repository.JpaRepository;

import project.shopping.entites.Item;
import project.shopping.entites.OrderDetails;

public interface OrderDetailsDavo extends JpaRepository<OrderDetails, Long> {
		

}
