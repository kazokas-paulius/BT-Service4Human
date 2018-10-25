package bt_user.repository;
//KAZOKAS
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bt_user.entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer>{
	String getUser_DataByUsername(User u);
}