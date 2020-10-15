/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner;
//import java.text.DecimalFormat;
import java.text.NumberFormat;
//import javax.swing.JPanel;
/**
 ** Class: CITC1310 Programming I 
 * Instructor: G 
 * Description: The following program prompts the user for an entry of hours
 * and how much they spent and how much money they have left
* Due: 9/29/2016
 * Programmer: Stephen McGuire 
 * 
 */
public class Lab2c {
    public static void main(String[] args){
        final double TAX_RATE = 0.14; //Tax Rate
        
        final double WAGE; //How much the person makes
        final double HOURS;
        
        double before;
        double tax;
        double total;
        double totaL;
       
        
               
        
        
        //DecimalFormat df = new DecimalFormat("$0.00"); //How the Numbers will output
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance(); //Getting Dollar sign
        NumberFormat fmt2 = NumberFormat.getPercentInstance(); // Getting Percents
        
        
        //--------What the person spent-----------------\\
        final double clothesAndAccessories;
        final double schoolSupplies;
        final double savingBonds;
        final double parentSavingBonds;
        //--------------------------------------------------------------\\
        
        
        Scanner scan = new Scanner(System.in); //Scanner for accepting input
        
        System.out.println("Enter how much money do you make?: ");
        WAGE = scan.nextDouble();
        
        System.out.println("How many hours did you work?: ");
        HOURS = scan.nextDouble();
        
        before = HOURS * WAGE;
        tax = before * TAX_RATE;
        total = before - tax;
        
        System.out.println("You made "+ fmt1.format(before)  
                + " before tax and " + fmt1.format(tax) + " with " 
                + fmt2.format(TAX_RATE));
        System.out.println("Total: " + fmt1.format(total));
        
        //----------------------------Money spent on clothes-----------------\\
        
        System.out.println("");
        
        clothesAndAccessories = total * 0.10;
        schoolSupplies = clothesAndAccessories * 0.01;
        totaL = (total - clothesAndAccessories - schoolSupplies);
        
        System.out.println("You also spent: " + fmt1.format(clothesAndAccessories)
        + " on clothes and accessories and " + fmt1.format(schoolSupplies)
         + " on school supplies making you have "
         + fmt1.format(totaL) + " left to spend.");
        
        //------------------Savings bond--------------------------------------\\
        
        System.out.println("");
        
        savingBonds = ((totaL * 0.25) - totaL);
        parentSavingBonds = (savingBonds + 0.50); 
        
        
        
        System.out.println("After spending money on bonds, you have: " 
                + fmt1.format(parentSavingBonds) + " left.");
        
        
        
        
        
       
        
        
        
         
     
        
        
    
        
        
        
        
    }
    
}
