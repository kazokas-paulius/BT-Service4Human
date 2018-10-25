package bt_user.repository;
//VYGANTAS
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bt_user.entity.Provider;

@Repository
public interface AuthRepository extends JpaRepository<Provider, Integer> {

	Optional<Provider> findByUsernameAndPassword(String username, String password);
//	String findByUsernameAndPassword(String username, String password);
	Optional<Provider> findByUsername(String username);
}