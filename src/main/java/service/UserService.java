package service;

import java.util.List;

import org.springframework.stereotype.Service;

import entity.User;

//surasti pagal laikus
@Service
public interface UserService {
	User getUserById (Integer id);
	void saveOrder(User user);
}