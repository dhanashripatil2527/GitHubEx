package cc4;

public class Account
{
	private int accountId ;
	private String accountType ;
	private int balance ;
	
	boolean withdraw(int a)
	{
	    if(balance<a)
	    {
	    	System.out.println("Sorry!!! No enough balance");
	    	return false;
	    }
	    else
	    {
	    	balance = balance-a;
	    	System.out.println("Balance amount after withdraw: " + balance);
	    	return true;
	    }
	}

	public int getAccountId() {
		return accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public int getbalance() {
		return balance;
	}


	public void setAccountId(int id) {
		this.accountId = id;
	}

	public void  setAccountType(String type) {
		this.accountType= type;
	}

	public void setBalance(int b) {
		this.balance = b;
	}



}