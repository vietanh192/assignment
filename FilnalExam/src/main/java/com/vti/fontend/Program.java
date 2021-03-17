package com.vti.fontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.Utils.JdbcUltils;
import com.vti.Utils.ScannerUtils;

public class Program {

	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Function function = new Function();
		do {
			System.out.println("---Menu---");
			System.out.println("1. Nhap id project va hien thi tt user");
			System.out.println("2.Lay ra tt cua manager cua cac project");
			System.out.println("Nhap Lua chon: ");
			int choice = ScannerUtils.inputInt("Nhap lai");
			switch (choice) {
			case 1:
				function.getListUser();
				break;
			case 2:
				function.getListManager();
				break;
			default:
				System.out.println("Moi Nhap Lai");
				break;
			}
		} while (true);
	}

}
