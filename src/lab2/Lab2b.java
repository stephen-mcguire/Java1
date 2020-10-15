/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;
/**
 *
 * @author sbmcguire
 */
public class Lab2b {
    public static void main(String[] args){
        
      //Declaring varibles 
        int width;
        int length;
        //int perimeter;
        
        //Using scanner
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = console.nextInt();
        System.out.println("");
        System.out.print("Enter the width: ");
        width = console.nextInt();
        int area = (length*width);
        //System.out.println("Area= " +area);
        int perimeter = 2*(width+length);
        System.out.print("The length and the width of a rectangle is: " +perimeter+" "+  "and the Area is: " +area);
        
        
        
        
               
                
        
        
        
        
        
        
    }
    
}
