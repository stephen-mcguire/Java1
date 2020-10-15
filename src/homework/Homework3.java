/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;
import java.util.Scanner;
/**
 *
 * @author sbmcguire
 */
public class Homework3 {
    public static void main(String[] args){
        
        System.out.println("Number 1. " +""+ "A variable is a letter than can have any value assigned." +"\n"+ "A constant is a number that is assigned to a variable that can never change." +"\n");
        //Declaring "x" as an integer without an assigned value
        int x;
        
        
        //Adding values 
        //Number 2a
        //Declaring "x" as an integer with the assigned value of 3.
        
        //2b
        //There will be an error since we have already declared "x" 
        //In the above statment
        //int x = 3;
        
        //2c
        //Says that x is equal to three, but is not being declared.
        x = 3;
        
                
        //Declaring int val1, val2, val3
         //int ten = 10, five = 5, eight = 8;
         //int val1, val2, val3;
         //double average;
        
        
        
        
        System.out.println("/*******************************************************************/\n" +
"// Average.java \n" +
"// \n" +
"// Read three integers from the user and print their average \n" +
"// /******************************************************************/ ");
       
Scanner scan = new Scanner(System.in);
            System.out.print("Please enter three integers and \" + \n" + "\"I will compute their average: ");
            int val1 = scan.nextInt();
            int val2 = scan.nextInt();
            int val3 = scan.nextInt();
            double average = (val1+val2+val3) / 3.0;
            
            System.out.println("" +average);
            
            
            
    
            
        
    }
    
}
