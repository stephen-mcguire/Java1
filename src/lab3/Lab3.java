/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.util.Scanner;

/**
 *
 * @author Stephen
 */
public class Lab3 {
    JPanel p=new JPanel();
    JButton b=new JButton("Click for Confirmation");
    JTextField field = new JTextField(10);
    
    //Object[] savingsOrChecking = JOptionPane.showMessageInputDialog(null, "Is this checking 'c' or Savings 's' account?", "Input", JOptionPane.INFORMATION_MESSAGE, null, savingsOrChecking, savingsOrChecking[1]);
    public class test {
   //Object[] savingsOrChecking = (Object[] {"s", "c"};) JOptionPane.showInputDialog(null, "Is this checking 'c' or Savings 's' account?", "Input", JOptionPane.INFORMATION_MESSAGE, null, savingsOrChecking, savingsOrChecking[0]);
       //Object savingsOrChecking = pane.getObject();
                              
    
    
    }

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

        
                    //JOptionPane.showInputDialog(null, "Please enter your five digit Valid account number.");
                    
                    //else (JOptionPane.showInputDialog(null, "test")) 
                    
                
                        
                    
                        
                //JOptionPane.showMessageDialog(null, "Please enter your five digit VALID account number");
            
                
        //accountNumber = Integer.parseInt(JOptionPane.showInputDialog(null));
        //JOptionPane.showInputDialog(null, "Enter Account In the Blank");
        
        
        //Object[] savingsOrChecking = new Object[] {"a", "b"};
        
        
        //String savingsOrChecking = (String) JOptionPane.showInputDialog(null, "Is this checking 'c' or Savings 's' account?", "Input", JOptionPane.INFORMATION_MESSAGE, null, savingsOrCheckingStrings1, savingsOrCheckingStrings1[0]);
        
        //double Cbalance = c;
       //char c = "Input".charAt(0);
       //char s = "Input".charAt(0);
       
       //double SBalance = Double.parseDouble((JOptionPane.showInputDialog(null, "What is your current balance?")));
       //double CBalance = Double.parseDouble(JOptionPane.showInputDialog(null, "What is your current balance?"));
       
       //if (savingsOrCheckingStrings[0].equals("c") || savingsOrCheckingStrings[0].equals("s")) {
           
           //JOptionPane.showInputDialog(null, "What is your current balance?" + CBalance);
            
            
              
       
           
          

        
        //String getChar = JOptionPane.showInputDialog(null, "Is this checking 'c' or Savings 's' account?", "");
                        
                        
        
                   //if (getChar == null){
                       // JOptionPane.showMessageDialog(null,"You did not Enter a Letter");                                            
                            
                    //} //else if (getChar.length() == 0) {
                        //JOptionPane.showMessageDialog(null,"No input detected");
                        
                    
                        
                    
                    //Find out what to use either while, for, switch, if / else...etc
                       
                    
                    //double Cbalance = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the current balance of your account?"));
                    
                        //if (Cbalance <= 50 || Sbalance <= 50){
                            //JOptionPane.showMessageDialog(null, "I'm sorry, we have to charge you $25 for going below the minimum amount required ");
                            
                            
                        
                            
                            
                        
                        
                    
                    
                    
                    
                      
                           
                          
                           
                       
                    
    
                 
                    
                    
        
        
        





        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
        
        
        
           
    
    
    

