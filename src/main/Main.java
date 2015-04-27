package main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import view.MicrowaveFrame;
import view.MicrowavePanel;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
//		MicrowaveFrame frame = new MicrowaveFrame();
//		frame.repaint();
		
		MicrowavePanel panel = new MicrowavePanel(new ImageIcon("src/resources/ParadoComPortaFechada.jpg").getImage());
		
		 JFrame frame = new JFrame("Microwave INF1013");
		    frame.getContentPane().add(panel);
		    frame.pack();
		    frame.setVisible(true);		
		    frame.addWindowListener(new WindowAdapter() {
		         public void windowClosing(WindowEvent windowEvent){
		            System.exit(0);
		         }        
		      }); 
//		 JButton button = new JButton(" >> JavaProgrammingForums.com <<");
//	        //Add action listener to button
//	        button.addActionListener(new ActionListener() {
//	 
//	            public void actionPerformed(ActionEvent e)
//	            {
//	                //Execute when button is pressed
//	                System.out.println("You clicked the button");
//	            }
//	        });      
//		
//	        button.setBounds(500, 123, 50, 50);
	        
//		MicrowavePanel panel = new MicrowavePanel(new ImageIcon("src/resources/ParadoComPortaFechada.jpg").getImage());
//	    JFrame frame = new JFrame("Microwave INF1013");
//	    frame.getContentPane().add(panel);
//	    frame.pack();
//	    frame.setVisible(true);		
//	    frame.addWindowListener(new WindowAdapter() {
//	         public void windowClosing(WindowEvent windowEvent){
//	            System.exit(0);
//	         }        
//	      });    
	}

}
