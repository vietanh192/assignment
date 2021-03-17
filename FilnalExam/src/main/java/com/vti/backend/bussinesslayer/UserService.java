package com.vti.backend.bussinesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.Manager;
import com.vti.entity.User;

public class UserService implements IUserService {

	private IUserRepository userRepository;
	

	public UserService() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userRepository = new UserRepository();
	}

	public List<User> getListUsers() throws SQLException, ClassNotFoundException {
		return userRepository.getListUsers();
	}
	public List<Manager> getListManagers() throws ClassNotFoundException, SQLException{
		return userRepository.getListManagers();
		
	}

	
	
	

}
