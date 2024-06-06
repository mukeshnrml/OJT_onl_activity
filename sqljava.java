package javaMySQL;

import java.sql.*;

public class sqljava {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		String url ="jdbc:mysql://localhost:3306/ddn";
		String user = "root";
		String pass = "";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,user,pass);
//		System.out.println("Success");
//		
//		
		
		// TODO Auto-generated method stub
	
//		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
//		System.out.println("Successfully - " + conn );
		
		// Show Database
		
//		Statement st = conn.createStatement();
//		ResultSet rs = st.executeQuery("show databases");
//		System.out.println("Databases Are : - " + rs );
//		while(rs.next()) {
//			System.out.println(rs.getString(1) );
//		}

		// Create database
		
		
//		Statement st = conn.createStatement();
//		st.executeUpdate("create database ddnnm");
//		System.out.println("Database cretaed");
		
		
//		Create table 
		
		
//		String query = "create table nirmal(name varchar(30), address varchar(100), age int, mail varchar(100) primary key)";
//		Statement st = conn.createStatement();
//		st.executeUpdate(query);
//		System.out.println("Table cretaed");
		
		
//		Insert data 
		
//		String query = "insert into nirmal values ('aman', 'DDN', 24, 'aman@mail.com')";
//		Statement st = conn.createStatement();
//		st.executeUpdate(query);
//		System.out.println("Data added ");
		
		
//		Data insert 
		
		String showTableDataSQL = "select * from nirmal";
		Statement st= conn.createStatement();
		ResultSet resultSet  = st.executeQuery(showTableDataSQL);
		System.out.println("Data in 'nirmal' table");
		
		while (resultSet.next()) {
			String name = resultSet.getString("name");
			String add = resultSet.getString("address");
			String age = resultSet.getString("age");
			String mail = resultSet.getString("mail");
			
			System.out.println("Name : " + name);
			System.out.println("Address : "+ add);
			System.out.println("Age : " + age);
			System.out.println("mail : " + mail);
			System.out.println("===========================================");
		}
		
		
//		Data deleted
		
//		String deleteQuery = "DELETE FROM nirmal WHERE mail = 'sanju@mail.com'";
//		Statement st= conn.createStatement();
//		st.executeUpdate(deleteQuery);
//        System.out.println("Data deleted");
		
		
//		Update data 
		
//		String updateQuery = "UPDATE nirmal SET email = 'mm@mail.com' WHERE email = 'mukeshh@mail.com'";
//		Statement st = conn.createStatement();
//		st.executeUpdate(updateQuery);
//		System.out.println("Data updated");

//		
		
	}

}
