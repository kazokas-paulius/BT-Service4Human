package bt_user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import bt_user.entity.User;

//surasti pagal laikus
@Service
public interface UserService {
	List<User> getUsers();
	String getUserByUsername(User u);
}