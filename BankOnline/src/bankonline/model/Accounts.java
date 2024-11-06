package bankonline.model;

public class Accounts {
	private long accountNumber;
	private String fullName;
	private String email;
	private double balance;
	private int securityPin;
	
	
	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public int getSecurityPin() {
		return securityPin;
	}


	public void setSecurityPin(int securityPin) {
		this.securityPin = securityPin;
	}


	public Accounts(long accountNumber, String fullName, String email, double balance, int securityPin) {
		super();
		this.accountNumber = accountNumber;
		this.fullName = fullName;
		this.email = email;
		this.balance = balance;
		this.securityPin = securityPin;
	}


	public Accounts() {
		super();
	}
	
	

}

