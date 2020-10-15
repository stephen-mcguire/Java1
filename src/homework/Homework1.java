/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author Stephen
 */
public class Homework1 {
    public static void main(String[] args){
        int i = (10/2) + (-3);
        int r = 8 + 12 * 2 - 4;
        int e = 4 + 17 % 2-1;
        int m = 6 - 3 * 2 + 7 - 1;
        int g = (5+2) * 4;
        int d = 10/ (5-3);
        int u = 8 + 12 * (6-2);
        int z = (4+17) % 2-1;
        int k = (6-3)*(2+7)/3;
        
        //Declaring 2a and 2b
        long  x= (long) 3.7;
        int number= (int) 72.567;
        
        //Declaring Books, Months and bookspermonth
        int books = 15;
        int months = 6;
        double bookspermonth;
        //double bookspermonth = (double) (books/months);
        

        
        
        
        
        System.out.print("1.a\t" +(5+2*4) +"\n");
        System.out.print("1.b\t" +(i - 3) +"\n");
        System.out.print("1.c\t" +(r) +"\n");
        System.out.print("1.d\t" +(e) +"\n");
        System.out.print("1.e\t" + (m) +"\n");
        System.out.print("1.f\t" +(g) +"\n");
        System.out.print("1.g\t" +(d) +"\n");
        System.out.print("1.h\t" +(u) +"\n");
        System.out.print("1.i\t" +(z) +"\n");
        System.out.print("1.j\t" +(k) +"\n");
        System.out.println("");
        
        //Starting 2a and 2b
        System.out.print("2.a\t" +(x) +"\n");
        System.out.print("2.b\t" +(number) +"\n");
        System.out.println("");
        
        //Given the following declaration and assignments, evaluate c and d:
        System.out.print("2.c\t" +(bookspermonth = (double) books/months) +"\n");
        System.out.println("2.d\t" +(bookspermonth = (double) (books/months)) +"\n");
        
        
        
        
        
        
        
        
    }
    
}