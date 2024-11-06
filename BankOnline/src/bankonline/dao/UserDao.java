package bankonline.dao;

import bankonline.exception.UserException;

public interface UserDao {
   void register() throws UserException;
   String login() throws UserException;
   boolean user_exist(String email) throws UserException;
}

