package testExam1;

import java.util.*;

public class TestClass {
    
     
    
    public static void main(String args[]) {
	
	AccountRegister accountReg=new AccountRegister();
	     
	
	
	Customer cust1=new Customer("Indu","123");
	Customer cust2=new Customer("veena","345");
	Account account1=new Account("101",1200.0,cust1);
	Account account2=new Account("102",1500.0,cust2);
	
//	cust1.addAccount(account1);
//	cust1.addAccount(account2);
	
	 Scanner input=new Scanner(System.in);
	 
	
	 accountReg.addCustomer(account1);
	 accountReg.addCustomer(account2);
	 
	 
	 System.out.println("Enter the account number to be find");
	 String accountNumber=input.next();
	 
	 Account account=accountReg.findAccount(accountNumber);
	 
	 if(account!=null)
	 {
	     
	     System.out.println("Customer Details"+account.getCustomer().getCustomerName());
	 }
	 else
	 {
	     System.out.println("Customer not found in records");
	 }
	 
	 
	 System.out.println("Enter the account Number 1 from which account to be transfered");
	 
	 String accountNumber1=input.next();
	 
	 System.out.println("Enter the account Number 2 from which account to be credited");
	 
	 String accountNumber2=input.next();
	 
	 
	 accountReg.transfer(accountNumber1, accountNumber2);
	 
	 System.out.println("Current Balance after withdraw= "+account1.getCustomer().getCustomerName()+"Balance"+account1.getAccountBalance());
	 
	 System.out.println("Current Balance after depostied ="+account2.getCustomer().getCustomerName()+"Balance"+account2.getAccountBalance());
	 
	 
	 
	 
	 
	
	
	
	
    }

}
