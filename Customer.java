package testExam1;

import java.util.*;
public class Customer {
    
    private String customerNumber;
    private String customerName;
    
    ArrayList<Account> accountList=new ArrayList<Account>();
    
    public Customer(String customerName,String customerNumber)
    {
	this.customerName=customerName;
	this.customerNumber=customerNumber;
    }
    
    
    public void setCustomerNumber(String customerNumber)
    {
	this.customerNumber=customerNumber;
	
    }
    
    public String getCustomerNumber() {
	
	return customerNumber;
	
	
    }
    
    public void setCustomerName(String customerName) {
	
	this.customerName=customerName;
	
	
    }
    
    public String getCustomerName() {
	
	return customerName;
    }
    
    
    
    public void setAccountList(ArrayList<Account> accountList) {
	
	
	this.accountList=accountList;
    }
    
    public ArrayList<Account> getAccountList()
    {
	return accountList;
    }
    
    
    
    public Account addAccount(Account account)
    {
	return account;
    }
    
    

}
