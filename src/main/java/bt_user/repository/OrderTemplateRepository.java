package bt_user.repository;
//KAZOKAS
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bt_user.entity.OrderTemplate;

@Repository
public interface OrderTemplateRepository  extends JpaRepository<OrderTemplate, Integer>{
	
}