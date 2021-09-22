package project.shopping.davo;

import org.springframework.data.jpa.repository.JpaRepository;

import project.shopping.entites.User;

public interface UserDavo extends JpaRepository<User, Long>{

}
