package dao;


import org.springframework.context.annotation.Bean;

import domain.User;
import service.ServiceUser;

public class DaoUserImpl implements DaoUser{
	
	private ServiceUser repository;
	
	public void save(User user) {
		repository.save(user);
	}
	@Bean(name = "user")
	public ServiceUser setRepository(ServiceUser repository) {
		this.repository=repository;
		return repository;
	}
	
}
