/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stephen.mcguire;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JTextField;
//import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;

/**
 *
 * @author Stephen
 */
public class test4mind extends JFrame {
   
	
	JPanel p=new JPanel();
	JButton b=new JButton("Click for Confirmation");
	JTextField t=new JTextField("",20);
	JLabel l=new JLabel("Checking or Savings?");
	String choices[]={
		"Checking",
		"Savings",
	};
	JComboBox cb=new JComboBox(choices);
	
	
	public static void main(String[] args){
		new test4mind();
	}
	
	public test4mind(){
		super("Banking Information");
		
		setSize(400,300);
		setResizable(true);
		
		p.add(b);
		p.add(t);
		p.add(l);
		p.add(cb);
		add(p);
		
		setVisible(true);
	}
}