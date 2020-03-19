package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import domain.User;
import service.ServiceUser;

public class Main {
	private void saveUser(User user) {
		@SuppressWarnings("resource")
		BeanFactory container=new AnnotationConfigApplicationContext(ServiceUser.class);
		ServiceUser userService=container.getBean(ServiceUser.class);
		userService.save(user);
	}
	public static void main(String[] args) {
		Main main=new Main();
		main.saveUser(new User("ime1","prezime1"));
	}
}
