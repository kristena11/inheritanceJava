/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kristen Albrecht
 */
public class SavingsAccount extends BankAccount{
    
    public SavingsAccount(String firstName, String lastName, String socialSecurity, float balance) {
        super(firstName, lastName, socialSecurity, balance);
        System.out.println("Succesful account created for "  + firstName + " " + lastName+ " Account Number: " + accountNumber);
        System.out.println(firstName + " " + lastName+ " Balance " + balance);
    }
    /**
     *
     */
    @Override
     public void applyInterest()
    {
        float interest = (float) (balance * .05);
        balance = balance + interest; 
    }
    
}
