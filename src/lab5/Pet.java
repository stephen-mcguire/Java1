/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author sbmcguire
 */
public class Pet {
    
    //Fields
    private String animals; //animal type
    private double maturity; //age representation
    private String pName; // animal name
    
    //Constructors  
    
    public Pet() {
        
    }
    
    
    //this is the class where the main class gets its information from. 
    
    public Pet(String ani, double  age, String name) {
        animals = ani;
        maturity = age;
        pName = name;
    }
    
    

    Pet(String testAnimals, String testName, double testMaturity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setpName(String name) {
        this.pName = name;
    }
    
    public String getpName() {
        return pName;
    }
    
    public void setAnimals(String ani) {
        this.animals = ani;
    }
    
    public void setMaturity(double age) {
        this.maturity = age;
    }
    
    public String getAnimals() {
        return animals;
    }
    
    public double getMaturity() {
        return maturity;
    }
    
    public String toString() {
        String animalDetails;
        
        animalDetails = animals +"\t"+ pName +"\t";
        animalDetails += "Age: " + maturity;
        
        return animalDetails;
    }
}
