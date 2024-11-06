package bankonline.service;

import bankonline.exception.UserException;
import bankonline.dao.UserDao;
import bankonline.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
	UserDao dao = new UserDaoImpl();

	@Override
	public void register() throws UserException {
		// TODO Auto-generated method stub
		
		dao.register();
	}

	@Override
	public String login() throws UserException {
		// TODO Auto-generated method stub
		return dao.login();
	}

	@Override
	public boolean user_exist(String email) throws UserException {
		// TODO Auto-generated method stub
		return dao.user_exist(email);
	}

}
