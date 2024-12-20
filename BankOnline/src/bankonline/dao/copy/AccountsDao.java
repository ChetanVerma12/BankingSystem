package bankonline.dao.copy;

import bankonline.exception.AccountsException;

public interface AccountsDao {
	long open_account(String email) throws AccountsException;
	long getAccount_number(String email) throws AccountsException;
    long generateAccountNumber() throws AccountsException;
	boolean account_exist(String email) throws AccountsException;
}

