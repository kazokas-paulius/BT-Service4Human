package service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.User;
import repository.UserRepository;

@Service
@Transactional
public class UserServiceImplementation implements UserService{

	private UserRepository repository;
	
	@Override
	public User getUserById(Integer userId) {
		return repository.getOne(userId);
	}

	@Override
	public void saveOrder(User user) {
		// TODO Auto-generated method stub
		
	}
}