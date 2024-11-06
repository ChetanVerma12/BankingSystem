package bankonline.service;

import bankonline.exception.AccountManagerException;

public interface AccountManagerService {
	void credit_money(long account_number) throws AccountManagerException;
	void debit_money(long account_number) throws AccountManagerException;
	void transfer_money(long account_number) throws AccountManagerException;
	void getBalance(long account_number) throws AccountManagerException;
}
