/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kristen Albrecht
 */
public class CheckingAccount extends BankAccount{
    
    public CheckingAccount(String firstName, String lastName, String socialSecurity, float balance) {
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
        float excess = balance - 10000;
       
        if(excess > 0)
        {
            float interest = (float) (excess * .02);
            balance = balance + interest;        
        }
        else
        {
            System.out.println("Must have greater then 10000.00f in checking account to apply interest");
        }
    }
    
}
