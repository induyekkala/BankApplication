package testExam1;

public class Account {
    
    private String accountNumber;
    private double accountBalance;
    private Customer customer;
    
    public Account(String accountNumber,double accountBalance,Customer customer)
    {
	this.accountNumber=accountNumber;
	this.accountBalance=accountBalance;
	this.customer=customer;
    }
    
    
    public void setAccountNumber(String accountNumber) {
	
	this.accountNumber=accountNumber;
    }
    
    public String getAccountNumber() {
	
	return accountNumber;
    }
    
    public void setAccountName(double accountBalance) {
	
	
	this.accountBalance=accountBalance;
    }
    
    public void setBalance(double balance)
    {
	this.accountBalance=balance;
    }
    
    public double getAccountBalance() {
	
	return accountBalance;
	
    }
    
    
    
    public void setCustomer(Customer customer)
    {
	this.customer=customer;
    }
    
    public Customer getCustomer() {
	
	return customer;
	
	
    }
    
    public void withdraw(double amount)
    {
	accountBalance=accountBalance-amount;
	
	
    }
    
    public void deposit(double amount)
    {
	accountBalance=accountBalance+amount;
    }
    
    

}
