package bankonline.service;

import bankonline.exception.UserException;

public interface UserService {
	void register() throws UserException;
	   String login() throws UserException;
	   boolean user_exist(String email) throws UserException;
}

