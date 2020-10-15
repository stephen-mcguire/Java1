/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Random;
import javax.swing.JOptionPane;
import static lab4.RockPaperScissors1.computerPlays;
import static lab4.RockPaperScissors1.playGame;

/**
 *
 * @author sbmcguire
 */
public class Lab4 {
    
    public static void main(String[] args) {
        
    
    int Rock = 1, Paper = 2, Scissors = 3, All = 1;
    
   /**This explains how to play the game**/
   
   
JOptionPane.showMessageDialog(null, "Welcome to Rock, Paper, and Scissors! "
     + "To get started, press 'OK'. Rock is 'r', Paper is 'p', " 
            + "and Scissors is 's'");


while (All != 0) {
    char computerTurn = computerPlays();
    String input = JOptionPane.showInputDialog(null, "Rock, Paper "
    +"or Scissors?").toLowerCase();
    
    char RPS = input.charAt(0);
    
    if (RPS == 'r' || RPS == 'p' || RPS == 's') {
        playGame(computerTurn, RPS);
}else{
        JOptionPane.showMessageDialog(null, "Please enter a right letter");
        //input = JOptionPane.showInputDialog(null, "Rock, Paper "
    //+"or Scissors?").toLowerCase();
        
        }
    
    if (JOptionPane.showConfirmDialog(null, "Do you want to exit?", "WARNING",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                System.exit(0);
                break;
            }else if (JOptionPane.showConfirmDialog(null, "Do you want to exit?", "WARNING",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                
                All = 1;
            }
        }
    }
    
     public static char computerPlays() {
        Random Rnd = new Random();
        int RanNum = Rnd.nextInt(3 - 1) + 1;
        
        if (RanNum == 1) {
            return 'r';
        }else if (RanNum == 2) {
            return 'p';
        }else{
            return 's';
        }
        
    }
    public static void playGame(char computer, char player) {
        
                    if (computer == 'r') {
                        if (player == 'r') {
                            JOptionPane.showMessageDialog(null, "Rock Vs. Rock. TIE");
                        }else if(player == 'p') {
                            JOptionPane.showMessageDialog(null, "Paper Vs. Rock. "
                            + "WIN");
                        }else if (player == 's') {
                            JOptionPane.showMessageDialog(null, "Scissors Vs. "
                            + "Rock. LOSE");
                                                    
                        }
                        
                    }else if(computer == 'p') {
                        if (player == 'r') {
                            JOptionPane.showMessageDialog(null, "Rock Vs. Paper. "
                            + "LOSE");
                        }else if (player == 'p') {
                            JOptionPane.showMessageDialog(null, "Paper Vs. Paper. "
                            + "TIE");
			}else if (player == 's') {
                            JOptionPane.showMessageDialog(null, "Scissors Vs. Paper. "
                            + "WIN");
			}
                    }else if (computer == 's') {
			if (player == 'r') {
                            JOptionPane.showMessageDialog(null, "Rock Vs. Scissors. "
                            + "WIN");
                    }else if (player == 'p') {
                            JOptionPane.showMessageDialog(null, "Paper Vs. Scissors. "
                            + "LOSE");
                    }else if (player == 's') {
                            JOptionPane.showMessageDialog(null, "Scissors Vs. Scissors. "
                            + "TIE");
                            
                            }       
                        }                   
                    }
                }
