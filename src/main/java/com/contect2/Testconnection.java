package com.contect2;

import java.sql.Connection;



import com.contect.MyDBUtils;

public class Testconnection {
public static void main(String[] args) {
		Connection connection = MyDBUtils.getConnection();
		System.out.println(connection);
		System.out.println("³É¹¦");
	}
}
