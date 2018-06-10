
import java.util.concurrent.ThreadLocalRandom;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kristen Albrecht
 */
public abstract class BankAccount implements Comparable<BankAccount>{
    Customer customer;
    protected int accountNumber = ThreadLocalRandom.current().nextInt(1000000000, Integer.MAX_VALUE);
    protected float balance;
    
    BankAccount(String firstName, String lastName, String socialSecurity, float balance)
    {
        customer = new Customer(firstName, lastName, socialSecurity );
        this.accountNumber = accountNumber;
        this.balance = balance;
       
    }
    public void deposit(float amount)
    {   
        
        balance = this.balance + amount;
        System.out.println(customer.firstName + " " + customer.lastName + " Deposited: " + amount + ". Current balance " + balance);
               
    }
    
    public void withdraw(float amount)
    {
       
        if(amount <= this.balance)
        {
            balance = this.balance - amount;
            System.out.println(customer.firstName + " " + customer.lastName + " withdrew " + amount + ". Current balance " + balance);
        }        
        else
        {
            System.out.println("Unable to withdraw " + amount + " for " + customer.firstName + " " + customer.lastName + " " + " due to insufficient funds");
        }
    }
     
   
    
    public void checkBalance()
    {
        System.out.println("Check Balance: " + balance);
    }
    
    
    @Override
    public String toString()
    {
         return "Succesful account created for "  + customer.firstName + accountNumber + customer.lastName + accountNumber;
    }

    public abstract void applyInterest();
   
    @Override
    public int compareTo(BankAccount other) {
        if (this.balance < other.balance) {
            return -1;
        }
        if (this.balance == other.balance) {
            return 0;
        }
        return 1;
    }
    
   
    
}
