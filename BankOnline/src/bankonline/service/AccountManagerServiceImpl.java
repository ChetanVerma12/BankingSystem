package bankonline.service;

import bankonline.exception.AccountManagerException;
import bankonline.dao.AccountManagerDao;
import bankonline.dao.AccountManagerDaoImpl;

public class AccountManagerServiceImpl implements AccountManagerService{
	AccountManagerDao dao = new AccountManagerDaoImpl();

	@Override
	public void credit_money(long account_number) throws AccountManagerException {
		
		dao.credit_money(account_number);
	}

	@Override
	public void debit_money(long account_number) throws AccountManagerException {
	dao.debit_money(account_number);
	}

	@Override
	public void transfer_money(long account_number) throws AccountManagerException {
		// TODO Auto-generated method stub
		dao.transfer_money(account_number);
		
	}

	@Override
	public void getBalance(long account_number) throws AccountManagerException {
		// TODO Auto-generated method stub
		dao.getBalance(account_number);
	}

}

