package quest;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Assignment1 ass1 = new Assignment1();
	ass1.inValue(); 
	
		// Question1
		/*if(ass1.acc1.getDepartment()==null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		}
		else {
			System.out.println("Phòng ban của nhân viên này là : "+ ass1.acc1.getDepartment());
		};*/
		
		// Question2
		/*if(ass1.acc1.getGroups() == null) {
			System.out.println("Nhân viên này chưa có group");
		}
		else if(ass1.acc1.getGroups().size() == 1 || ass1.acc1.getGroups().size() == 2) {
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		}
		else if (ass1.acc1.getGroups().size()==3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		}
		else if ( ass1.acc1.getGroups().size()>=4 ) {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}*/
		
		 // Question 3
		//System.out.println(ass1.acc1.getDepartment()==null ? "Nhân viên này chưa có phòng ban":"Phòng ban của nhân viên này là : "+ ass1.acc1.getDepartment().getDepartmentName());
	
		// question 4
	// System.out.println(ass1.acc1.getPosition().getPositionName()== "Dev"? "Đây là Developer":"Người này không phải là Developer");
	
		// question 5
		/*int x = 1 ;
			switch(x) {
			case 1 : System.out.println("Nhóm có một thành viên");
			case 2 : System.out.println("Nhóm có hai thành viên");
			case 3 : System.out.println("Nhóm có ba thành viên");
			default : System.out.println("Nhóm có nhiều thành viên");
			}*/
	
		// question 6
	/*int x = 1 ;
	switch(x) {
	case 0: System.out.println("Nhân viên này chưa có group");
	break;
	case 1 : System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
	break;
	case 2 : System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
	break;
	case 3 : System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
	break;
	default : System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
	}*/
	
		//Question8
	/*String[] ttaccs1 = {ass1.acc1.geteMail(),ass1.acc1.getFullName(),ass1.acc1.getDepartment().getDepartmentName()};
		for (String ttacc1 : ttaccs1 ) {
			System.out.println(ttacc1);
		}*/
		
		// Question10
	/*for(int i = 0; i < ass1.listAccount.size(); i++) { //4
		if(ass1.listAccount.get(i).getDepartment() != null) {
		System.out.println("Thong tin account thu " + (i + 1) + " la: ");
		System.out.println("Email: " + ass1.listAccount.get(i).geteMail());
		System.out.println("Full Name: " + ass1.listAccount.get(i).getFullName());
		System.out.println("Phong ban: " + ass1.listAccount.get(i).getDepartment().getDepartmentName());
		} else {
			System.out.println("Thong tin account thu " + (i + 1) + " la: ");
			System.out.println("Email: " + ass1.listAccount.get(i).geteMail());
			System.out.println("Full Name: " + ass1.listAccount.get(i).getFullName());
			System.out.println("Phong ban: " + "chua co");
		}*/
	// Question 11
	/*for(int i = 0; i < ass1.listDepartment.size(); i++) {
		System.out.println("Thông tin department thứ " + (i+1) + "là: ");
		System.out.println("Id:"+ ass1.listDepartment.get(i).getDepartmentID());
		System.out.println("Name"+ ass1.listDepartment.get(i).getDepartmentName());
	};*/
	
	
	/*for(int i = 0; i < 3; i++) { //4
		if(i==2) {
			break;
		}
		
		System.out.println("Thong tin account thu " + (i + 1) + " la: ");
		System.out.println("Email: " + ass1.listAccount.get(i).geteMail());
		System.out.println("Full Name: " + ass1.listAccount.get(i).getFullName());
		System.out.println("Phong ban: " + ass1.listAccount.get(i).getDepartment().getDepartmentName());*/
		
	
		/*for(int i = 0; i < ass1.listAccount.size(); i++) { //4
			if(i==1) {
				continue;
			}
			
			System.out.println("Thong tin account thu " + (i + 1) + " la: ");
			System.out.println("Email: " + ass1.listAccount.get(i).geteMail());
			System.out.println("Full Name: " + ass1.listAccount.get(i).getFullName());
			System.out.println("Phong ban: " + ass1.listAccount.get(i).getDepartment().getDepartmentName());*/
		
	/*for(int i = 0; i<=20;i++) {
		if(i%2 ==0) {
			System.out.println(i);
		}*/
	// cach 2
	/*for(int i = 0;i<=20;i++) {
		if(i%2 !=0) {
			continue;
		}
		System.out.println(i);
	}*/
	/*int i = 0;
	while( i < ass1.listAccount.size()) { //4
		System.out.println("Thong tin account thu " + (i + 1) + " la: ");
		System.out.println("Email: " + ass1.listAccount.get(i).geteMail());
		System.out.println("Full Name: " + ass1.listAccount.get(i).getFullName());
		System.out.println("Phong ban: " + ass1.listAccount.get(i).getDepartment().getDepartmentName());
		i++;
	}*/
	// exercise 2
	// question 2
	/*long i = 100000000;
	System.out.printf(Locale.US,"%,d %n", i);*/
	
	// question 3
	/*double i = 5.567098 ;
	System.out.printf("'%.4f'%n",5.567098);*/
	
	// question 4
	/*Scanner scanner = new Scanner(System.in);
	String str = scanner.nextLine();
	System.out.printf("Tên tôi là"+ str + "Và tôi đang độc thân " );*/
	
	// Question 5
	/*String pattern = "dd-MM-yyyy HH:mm:ss";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	String date = simpleDateFormat.format(new Date());
	System.out.println(date);*/
	
	// Exercise 3
	
	/*Scanner scanner = new Scanner(System.in);
	// Question 1
	String pattern = "yyyy-MM-dd HH:mm:ss";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	String date = simpleDateFormat.format(ass1.e1.getCreateDate());
	System.out.println(date);*/
	
	// Question 2
	
	
	// Bài 3
	double x = 5240.5;
	  int z = (int) x;
	System.out.println(z);
	
	double y = 10970.055;
		int o = (int) y;
		System.out.println(o);
	}
}

