/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import javax.swing.*;
/**
 *
 * @author sbmcguire
 */
public class Lab5 {
    public static void main(String[] args) {
        //Declaring Vars
        String testAnimals;
        String testName;
        double testMaturity;
        int redo = 1;
        
        //making a loop so it will end
        while (redo != 0) {
        //asking user for input for the animal
        testAnimals = JOptionPane.showInputDialog(null, "What kind of animal do you have? ");
        testName = JOptionPane.showInputDialog(null, "What is the name of it? ");
        testMaturity = Double.parseDouble(JOptionPane.showInputDialog(null, "How old is this animal? "));
        
        Pet myPet = new Pet();
        myPet.setAnimals(testAnimals);
        myPet.setMaturity(testMaturity);
        myPet.setpName(testName);
            
        JOptionPane.showMessageDialog(null, "Animal Type: " + myPet.getAnimals()
        +"\n"+"Animal Age: "+myPet.getpName() +"\n"+"Animal Age: "+ myPet.getMaturity());
        
        if (JOptionPane.showConfirmDialog(null, "Do you want to exit?", "WARNING",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                System.exit(0);
                
            }else if (JOptionPane.showConfirmDialog(null, "Do you want to exit?", "WARNING",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                
                redo = 1;
            }
        }
       /* 
        testAnimals = JOptionPane.showInputDialog(null, "What kind of animal do you have? ");
        testName = JOptionPane.showInputDialog(null, "What is the name of it? ");
        testMaturity = Double.parseDouble(JOptionPane.showInputDialog(null, "How old is this animal? "));
        
        Pet information = new Pet(testAnimals, testName, testMaturity);
        
        
      JOptionPane.showMessageDialog(null, "Animal Type: " + information.getAnimals() 
      + "\n" + information.getpName() + "\n" + information.getMaturity() 
      + "\n");
      */  
        
        
    }
    
}
