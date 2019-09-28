package testExam1;

import java.util.*;
public class AccountRegister {
    
   private Account account; 
   private Customer customer;
 private ArrayList<Account> accountList=new ArrayList<Account>();  
 
 public void setAccountList(ArrayList<Account> accountList)
 {
     
     this.accountList=accountList;
     
 }
 
 public ArrayList<Account> getAccountList(){
     
     return accountList;
     
     
 }
 
 public void addCustomer(Account customer) {
     
     accountList.add(customer);
     
 }
 
 public Account findAccount(String accountNumber)
 {
     
     for(Account account:accountList)
     {
	
	 if(account.getAccountNumber().equals(accountNumber))
	 {
	     return account;
	     
	 }
	 
	 
     }
     return null;
     
     
     
 }
 
 public Customer whoOwnsThisAccount(String accountNumber)
 {
     
     
     
    account=findAccount(accountNumber);
     
    if(account.getAccountNumber().equals(accountNumber))
    {
	
	return customer;
    }
    else
	 return null;
     
  
 }
 
   public void transfer(String accountNumber1,String accountNumber2) {
       
      Account account1,account2;
      Scanner input=new Scanner(System.in);
      
      account1=findAccount(accountNumber1);
      account2=findAccount(accountNumber2);
      
      System.out.println("Enter the amount to be transferred from"+account1.getCustomer().getCustomerName());
      
      double amount=input.nextDouble();
      
      double balance1=account1.getAccountBalance();
      double balance2=account2.getAccountBalance();
      
      if(balance1!=0)
      {
	  account1.withdraw(amount);
	  account1.setBalance(balance1-amount);
	  account1.getAccountBalance();
	  account2.deposit(amount);
	  account2.setBalance(balance2+amount);
	  account2.getAccountBalance();
	  
	  
	  
      }
      else
      {
	  System.out.println("No Enough funds to transfer");
      }
	 
	 
	 
	 
	 
       
       
   }
    

}
