package com.vti.fontend;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ModuleLayer.Controller;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentation.*;
import com.vti.entity.Manager;
import com.vti.entity.User;


public class Function {
	private UserController userController;
	public Function() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userController = new UserController();
	}
	public void getListUser() throws ClassNotFoundException, SQLException {
		List<User> users = userController.getListUser();
		System.out.printf("%-15s %-25s %-25s %-25s\n", "ID", "Email", "Fullname", "Password");
		for (User user : users) {
			System.out.printf("%-15s %-25s %-25s %-25s\n", user.getUserID(), user.getEmail(), user.getFullName(),
					"*********");
		}
	}
	public void getListManager() throws ClassNotFoundException, SQLException {
		List<Manager> managers = userController.getListManagers();
		System.out.printf("%-15s %-25s %-25s %-25s %-25s\n", "ID", "Email", "Fullname", "Password","ExpInYear");
		for (Manager manager : managers) {
			System.out.printf("%-15s %-25s %-25s %-25s %-25s\n", manager.getUserID(), manager.getEmail(), manager.getFullName(),
					"*********",manager.getExpInYear());
		}
	}
}
