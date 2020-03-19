package service;

import dao.DaoUser;
import domain.User;

public class ServiceUser implements DaoUser{

	public void save(User user) {
		System.out.println(user);
	}
}
