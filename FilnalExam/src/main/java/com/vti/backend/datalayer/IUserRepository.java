package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Manager;
import com.vti.entity.User;

public interface IUserRepository {
	List<User> getListUsers() throws SQLException, ClassNotFoundException;
	List<Manager> getListManagers() throws SQLException, ClassNotFoundException;
}
