package com.vti.backend.presentation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Spliterators.AbstractDoubleSpliterator;

import com.vti.backend.bussinesslayer.IUserService;
import com.vti.backend.bussinesslayer.UserService;
import com.vti.backend.datalayer.IUserRepository;
import com.vti.entity.Manager;
import com.vti.entity.User;

public class UserController {

	private IUserService userService;

	public UserController() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userService = new UserService();
	}

	public List<User> getListUser() throws ClassNotFoundException, SQLException {
		return userService.getListUsers();

	}
	public List<Manager>getListManagers() throws ClassNotFoundException, SQLException{
		return userService.getListManagers();
	}
}
