package com.aws.alerting.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.aws.alerting.database.DataBaseConnectionPool;

public class LoginService {
	
	
	public boolean checkLoginCredentials(String emailId,String password) throws SQLException
	{
		Connection conn = DataBaseConnectionPool.getConnection();
		String checkLoginCredentials = "select * from login where email = ? and userpassword = ?";
		PreparedStatement pstmt = conn.prepareStatement(checkLoginCredentials);
		pstmt.setString(1, emailId);
		pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery();
		return rs.next();
	}

}
