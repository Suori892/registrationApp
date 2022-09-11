package dao;
import java.sql.*;

import model.User;
public class UserDao {
    static final String DB_URL = "####"; //write your database url 
    static final String USER = "####"; //write your username 
    static final String PASS = "####"; //write your password 
	public static int registerUser(User user) throws ClassNotFoundException {	
		String INSERT_USER_SQL = "INSERT INTO authentication"
				+ "(first_name, second_name, email, username, passwd) VALUES"
				+ "(?, ?, ?, ?, ?)";
		
		int result = 0;
		
		Class.forName("org.postgresql.Driver");
		try(Connection connection = DriverManager.getConnection(DB_URL,
	            USER, PASS); 
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_SQL)){
		    System.out.println(user.getFirstName() + " " + user.getSecondName() + " " + user.getEmail());
			preparedStatement.setString(1, user.getFirstName());
			preparedStatement.setString(2, user.getSecondName());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, user.getUserName());
			preparedStatement.setString(5, user.getPasswd());
			
			System.out.println(preparedStatement);
			
			result = preparedStatement.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
