package com.vti.backend.bussinesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Manager;
import com.vti.entity.User;

public interface IUserService {
	List<User> getListUsers() throws SQLException, ClassNotFoundException;
	List<Manager> getListManagers() throws ClassNotFoundException, SQLException;
	
}
