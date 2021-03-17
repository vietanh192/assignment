package com.vti.backend.datalayer;

import java.beans.Statement;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.sql.*;

import java.util.*;


import com.vti.Utils.ScannerUtils;
import com.vti.Utils.JdbcUltils;
import com.vti.entity.Manager;
import com.vti.entity.User;

public class UserRepository implements IUserRepository {
	private JdbcUltils jdbcUltils;
	private Connection connection;

	public UserRepository() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		jdbcUltils = new JdbcUltils();
	}

	public List<User> getListUsers() throws SQLException, ClassNotFoundException {
		List<User> users = new ArrayList<User>();
		try {
			connection = jdbcUltils.connect();
			System.out.print("Nhap ID project : ");
			int idProject = ScannerUtils.inputInt("Nhap lai");
			
			
			String sql = "SELECT * \r\n"
					+ "FROM  `User` u\r\n"
					+ "\r\n"
					+ "WHERE u.ID = (SELECT e.ID FROM employee e JOIN project p ON p.projectID = e.projectID WHERE p.projectID = ? )\r\n"
					+ "OR u.ID = (SELECT m.ID FROM manager m JOIN project p ON m.ID = p.idManager WHERE p.projectID = ? )";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, idProject);
			preparedStatement.setInt(2, idProject);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while ( resultSet.next()) {
				int IdUser = resultSet.getInt("ID");
				String fullName = resultSet.getString("fullName");
				String email = resultSet.getString("email");
				String password = resultSet.getString("password");
			User user = new User(IdUser, fullName, email, password);
			users.add(user);
			}
			
			return users;
			
		} finally {
			// TODO: handle finally clause
			connection.close();
		}
	}

	public List<Manager> getListManagers() throws SQLException, ClassNotFoundException {
		List<Manager> managers = new ArrayList<Manager>();
		try {
			connection = jdbcUltils.connect();
			
			String sql = "SELECT u.*, m.ExpInYear\r\n"
					+ "FROM `User` u \r\n"
					+ "WHERE u.ID = (SELECT m.ID FROM manager m JOIN project p ON p.idManager = m.ID)";
			java.sql.Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				int IdUser = resultSet.getInt("ID");
				String fullName = resultSet.getString("fullName");
				String email = resultSet.getString("email");
				String password = resultSet.getString("password");
				int ExpInYear = resultSet.getInt("ExpInYear");
				Manager manager = new Manager(IdUser, fullName, email, password, ExpInYear);
				managers.add(manager);
			}
			return managers;
		} finally {
			connection.close();
		}
		
	}
	

}
