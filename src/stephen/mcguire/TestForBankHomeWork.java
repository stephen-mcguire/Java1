/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stephen.mcguire;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.lang.*;
import static java.lang.Character.isLetter;




/**
 *
 * 
 * 
 * File: lab3.Java
 * author@ Stephen McGuire
 * 10/31/2016
 * This program displays and calculates the account number
 * account type, and account overview
 */
public class TestForBankHomeWork {
    

    public static void main(String[] args) {
        
        
        
        
        
        
       
        
        
        boolean Wloop = false;
        
        
        //double SbalanceTotal = 
        
        final double INTEREST = 1.0;
       
        
        //Scanner scan = new Scanner (System.in);
        //Object[] options = new Object[] {"s", "c"};
        
           
        
        //Declaring Input
       //int accountNumber = Integer.parseInt ((JOptionPane.showInputDialog(null, "Enter Account Number in the blank")));
       
       //Looping for error correction
       while (!Wloop) {
            int accountNumber = Integer.parseInt ((JOptionPane.showInputDialog(null, "Enter Account Number in the blank")));   
            //int InputaccountNumber = accountNumber;
           if (accountNumber > 10000 && accountNumber < 99999) {
               
               Wloop = true;
               JOptionPane.showMessageDialog(null, "Thank you, now choose" +
                       "if your accunt is 'C' checking or 'S' for savings" + 
                       "in the next menu.");
               
               String input = JOptionPane.showInputDialog(null, "Is this checking 'C' or Savings 'S'");
        
               char accountType = input.charAt(0);
               
               while (accountType == 's' || accountType == 'c' || accountType == 'S' || accountType == 'C') {
                   
                   if (accountType == 's' || accountType == 'S'){
                       
                       double Sbalance = Double.parseDouble(JOptionPane.showInputDialog(null, "You must maintain a minimum of $25.00 or you will be charged $10.00. How much is in this savings account?"));
                               
                       //Sbalance = scan.nextDouble();     Savings = accountNumber + "\t" + "s\t" + Sbalance +"\t" + (Sbalance * (interest * 0.04) + (Sbalance);
                           //double Sbalance;
                           double newStotal = (Sbalance * (INTEREST * 0.04) + Sbalance);
                           double newStotal1 = newStotal + (-1) * 10;
                           //char s = 's';
                           
                           final int SFEE = (-1) * 10;
                           
                           //Sbalance = Double.parseDouble(JOptionPane.showInputDialog(null, "You must maintain a minimum of $25.00 or you will be charged $10.00. How much is in this savings account?"));
                           
                       if (Sbalance <= 24.99) {                           
                           JOptionPane.showMessageDialog(null, "We will have to charge you $10 for going below $25"
                           + "your savings account overview is: \n" +"Account Number: "+ accountNumber +"\n"+"Account Type: "+ accountType +"\n "+ "The minimum balance: "+ Sbalance +"\n"+"Currnet Balance: "+ Sbalance +"\n"+"New Balance: "+ (newStotal1 + SFEE));
                           break;
                           
                       }else if (Sbalance > 25) {
                           
                           JOptionPane.showMessageDialog(null, "Here is your account overview:\n " + "Account Number: " + accountNumber +" \n"+"Account Type: "+ accountType +" \n"+"Current Balance: "+ Sbalance +"\n"+"New Total: "+ newStotal);
                           break;
                           
                       }
                           
                       }else if (accountType == 'c' || accountType == 'C')  {
                           double Cbalance = Double.parseDouble (JOptionPane.showInputDialog(null, "How much is in this checking account?"));
                           //double Cbalance = 0;
                           //double CbalanceMinInt = Integer.MIN_VALUE;
                           //CbalanceMinInt = 50;
                           //double CbalanceMaxInt = Integer.MAX_VALUE;
                           //CbalanceMaxInt = 5000;
                           double newCtotal = (Cbalance + (Cbalance * (INTEREST * 1.05)));
                           double newCtotaL = Cbalance + Cbalance * (INTEREST * 1.03);
                           int Cfee = (-1) * 25;
                           
                           //double CbalanceFinalToal;
                           
                           
                           //Cbalance = Double.parseDouble (JOptionPane.showInputDialog(null, "How much is in this account?"));
                           
                           if (Cbalance < 50) {
                               
                               JOptionPane.showMessageDialog(null, "You fall below our account minimum balance  of $50 and you will be charged $25: \n" 
                               +"\n"+"Account Number: "+ accountNumber +"\n"+"Account Type: "+ accountType +"\n"+"Current Balance: "+ Cbalance +"\n"+"Account Total: "+ (newCtotal + Cfee));
                               
                           }else if (Cbalance > 50){
                               JOptionPane.showMessageDialog(null, "Your checking account overview is: \n" 
                               +"Account Number: "+ accountNumber +"\n"+"Account Type: "+ accountType +"\n"+"Current Balance: "+ Cbalance +"\n"+"Account Total: "+ newCtotal);
                               break;
                           }else if(Cbalance >= 5000) {
                               
                               JOptionPane.showMessageDialog(null, "Your checking account overview is: \n" 
                               +"Account Number: "+accountNumber+"\n"+"Account Type: "+accountType+"\n"+"Current Balance: "+Cbalance+"\n"+"Checking Total: "+ newCtotaL);
                               
                               // FIX INTEREST 
                               
                                 
                           }
                           
                       }    
                       
                   }
               
                       
                       
                       
               }else{
                            
                   JOptionPane.showMessageDialog(null, "You did not enter a VALID "+
                           "account number, please enter FIVE digits.");
                 
            }
       
        }
    }  
}       
            
      
        
        
        
        
    
    
