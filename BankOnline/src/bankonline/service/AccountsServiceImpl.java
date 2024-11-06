package bankonline.service;

import bankonline.exception.AccountsException;
import bankonline.dao.AccountsDao;
import bankonline.dao.AccountsDaoImpl;

public class AccountsServiceImpl implements AccountsService{
	AccountsDao dao = new AccountsDaoImpl();

	@Override
	public long open_account(String email) throws AccountsException {
		return dao.open_account(email);
	}

	@Override
	public long getAccount_number(String email) throws AccountsException {
		
		return dao.getAccount_number(email);
	}

	@Override
	public long generateAccountNumber() throws AccountsException {
		// TODO Auto-generated method stub
		return dao.generateAccountNumber();
	}

	@Override
	public boolean account_exist(String email) throws AccountsException {
		// TODO Auto-generated method stub
		return dao.account_exist(email);
	}

}
