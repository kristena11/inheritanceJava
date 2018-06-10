/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kristen Albrecht
 */
public class Customer {
    protected String firstName;
    protected String lastName;
    protected String socialSecurity;
    
    
    Customer(String firstName, String lastName, String socialSecurity)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurity = socialSecurity;
        
        if(socialSecurity.matches("\\d{3}-\\d{2}-\\d{4}"))
        {
             this.socialSecurity = socialSecurity;
        }
        else
        {
             System.out.println("The Social Security number for " + firstName + " " + lastName + " is invalid SSN!");
        }
                   
    }

    @Override
    public String toString()
    {
        return "customer is " + firstName + lastName + socialSecurity ;
    }
}
