// File: Errors.java 
// Purpose: A program with lots of syntax errors 
// Correct all of the errors (study the program carefully!!) 
package lab2;
import java.util.Scanner;
/**
 *
 * @author Stephen McGuire and Zachary Mitchell
 */
public class Errors {
    public static void main(String[] args) {
String Name; // Name of the user 
int number; 
int numSq; 
Scanner scan = new Scanner(System.in); 

System.out.print("Enter your first/last name, please: "); 
Name = scan.nextLine(); 

System.out.print("What is your favorite number?"); 
number = scan.nextInt(); 

numSq = number * number; 

System.out.println (Name +", the square of your number is " + 
numSq); 
    }
} 

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    

