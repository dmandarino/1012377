package view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MicrowaveFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MicrowaveFrame() {
		setTitle("Microwave INF1013");

	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		MicrowavePanel mw = new MicrowavePanel(new ImageIcon("src/resources/ParadoComPortaFechada.jpg").getImage());	
		this.add(mw);
		getContentPane().add(mw);
		pack();
		setVisible(true);
		
		
//		 JFrame frame = new JFrame("Microwave INF1013");
//		    frame.getContentPane().add(this);
//		    frame.pack();
//		    frame.setVisible(true);		
//		    frame.addWindowListener(new WindowAdapter() {
//		         public void windowClosing(WindowEvent windowEvent){
//		            System.exit(0);
//		         }        
//		      }); 
	}
		    
}
