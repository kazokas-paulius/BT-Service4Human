package bt_user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bt_user.entity.Order;

@Repository
public interface OrderRepository  extends JpaRepository<Order, Integer>{
	
}