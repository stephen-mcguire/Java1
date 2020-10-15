/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author sbmcguire
 */
public class testForRpS {
    
    public static char getCharA(char a) {
        int Rock = 1, Paper = 2, Scissors = 3;
        Random rnd = new Random();
        int RanNum = rnd.nextInt(3 - 1 + 1) + 1;
        char RPS = input.charAt(0);
        if (RanNum == Rock) {
            
            if (RPS == Rock) {
                JOptionPane.showMessageDialog(null, "Rock Vs. TIE. WIN!");
                
            }else if (RPS == Paper) {
                JOptionPane.showMessageDialog(null, "Paper Vs. Rock. WIN!");
            }else if (RPS == Scissors) {
                JOptionPane.showMessageDialog(null, "Scissors Vs. Rock. LOSE!");
                
                
            }
           
        }
        return a;
        /*else if (RanNum == Paper) {
            if (RPS == Rock) {
                JOptionPane.showMessageDialog(null, "Paper Vs. Rock. WIN!");
            }else if (RPS == Paper) {
                JOptionPane.showMessageDialog(null, "Paper Vs. Paper. TIE!");
            }else if (RPS == Scissors) {
                JOptionPane.showMessageDialog(null, "Paper Vs. Scissors. LOSE!");
            }
        }else if(RanNum == Scissors) {
            if (RPS == Rock) {
                JOptionPane.showMessageDialog(null, "Rock Vs. Scissors. WIN!");
                    }else if (RPS == Paper) {
                    JOptionPane.showMessageDialog(null, "Paper Vs. Scissors. LOSE");
                    }else if (RPS == Scissors) {
                    JOptionPane.showMessageDialog(null, "Scissors Vs. Scissors. TIE");
                            
                    }
        }
       
    
    
    if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            // yes option
                            
                        }else if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
                                JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                        // no option
                        
                       All = 1;
                        
                       }
       */     
    }

    static void getCharA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
