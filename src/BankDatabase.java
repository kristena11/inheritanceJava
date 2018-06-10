/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kristen Albrecht
 */

import java.util.Arrays;

public class BankDatabase {

    private Customer customer;
    BankAccount[] accounts;
    int numAccounts;

    BankDatabase()
    {
        accounts = new BankAccount[100];
        numAccounts = 0;
        
    }
  
    void createCheckingAccount(String customerName, String socialSecurity, float deposit)
    {
                
        String[] splitStr = customerName.split("\\s+");
        String firstName = splitStr[0];
        String lastName =  splitStr[1];
        
        
        accounts[numAccounts] = new CheckingAccount(firstName, lastName, socialSecurity, deposit);
        
        numAccounts++;
    }  
    void createSavingAccount(String customerName, String socialSecurity, float deposit)
    {
        String[] splitStr = customerName.split("\\s+");
        String firstName = splitStr[0];
        String lastName =  splitStr[1];
        accounts[numAccounts] = new CheckingAccount(firstName, lastName, socialSecurity, deposit);
        numAccounts++;
    }
    
    void print()
    {
        
        for(int i = 0; i < numAccounts; i++)
        {
            System.out.println(accounts[i].customer.firstName + " " + accounts[i].customer.lastName + " " + accounts[i].accountNumber + " " + accounts[i].balance);
        }
    }
    
     public void applyInterest()
    {
        for(int i = 0; i < numAccounts; i++)
        {
            accounts[i].applyInterest();
        }
        
    }         
}
