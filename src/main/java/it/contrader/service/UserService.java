package it.contrader.service;

import java.util.List;

import it.contrader.dao.UserDAO;
import it.contrader.model.User;

public class UserService {

	private UserDAO userDAO;

	public UserService() {
		this.userDAO = new UserDAO();
	}

	public List<User> getAll() {
		return this.userDAO.getAll();
	}

	public User read(int id) {
		return this.userDAO.read(id);
	}

	public boolean delete(int userId) {
		return userDAO.delete(userId);
	}

	public boolean insert(String username, String password, String usertype) {
		User newUser = new User(username, password, usertype);
		return userDAO.insert(newUser);
	}

	public boolean update(int id, String username, String password, String usertype) {
		User newUser = new User(username, password, usertype);
		newUser.setId(id);
		return userDAO.update(newUser);
	}


}
