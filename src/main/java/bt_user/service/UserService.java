package bt_user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import bt_user.entity.User;

//surasti pagal laikus
@Service
public interface UserService {
	User getUserById (Integer id);
	List<User> getUsers();
}