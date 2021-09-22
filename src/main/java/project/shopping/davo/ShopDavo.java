package project.shopping.davo;

import org.springframework.data.jpa.repository.JpaRepository;

import project.shopping.entites.Shop;

public interface ShopDavo extends JpaRepository<Shop, Long> {

}
