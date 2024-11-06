package bankonline.dao.copy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import bankonline.exception.UserException;
import bankonline.utility.ConnectionFactory;

public class UserDaoImpl implements UserDao {
	Scanner scanner  = new Scanner(System.in);
	

	 public void register() throws UserException{
       System.out.print("Full Name: ");
       String full_name = scanner.nextLine();
       System.out.print("Email: ");
       String email = scanner.nextLine();
       System.out.print("Password: ");
       String password = scanner.nextLine();
       if(user_exist(email)) {
           System.out.println("User Already Exists for this Email Address!!");
           return;
       }
       String register_query = "INSERT INTO User(full_name, email, password) VALUES(?, ?, ?)";
       try (Connection connection = ConnectionFactory.getInstance().getConnection();
           PreparedStatement preparedStatement = connection.prepareStatement(register_query)){
           preparedStatement.setString(1, full_name);
           preparedStatement.setString(2, email);
           preparedStatement.setString(3, password);
           int affectedRows = preparedStatement.executeUpdate();
           if (affectedRows > 0) {
               System.out.println("Registration Successfull!");
           } else {
               System.out.println("Registration Failed!");
           }
       } catch (SQLException e) {
           e.printStackTrace();
       }
   }

   public String login() throws UserException{
 
       System.out.print("Email: ");
       String email = scanner.nextLine();
       System.out.print("Password: ");
       String password = scanner.nextLine();
       String login_query = "SELECT * FROM User WHERE email = ? AND password = ?";
       try(Connection connection = ConnectionFactory.getInstance().getConnection();
           PreparedStatement preparedStatement = connection.prepareStatement(login_query)){
           preparedStatement.setString(1, email);
           preparedStatement.setString(2, password);
           ResultSet resultSet = preparedStatement.executeQuery();
           if(resultSet.next()){
               return email;
           }else{
               return null;
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
       return null;
   }

   public boolean user_exist(String email) throws UserException{
       String query = "SELECT * FROM user WHERE email = ?";
       try(Connection connection = ConnectionFactory.getInstance().getConnection();
           PreparedStatement preparedStatement = connection.prepareStatement(query)){
           preparedStatement.setString(1, email);
           ResultSet resultSet = preparedStatement.executeQuery();
           if(resultSet.next()){
               return true;
           }
           else{
               return false;
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
       return false;
   }
}

