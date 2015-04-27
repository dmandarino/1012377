package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MicrowavePanel extends JPanel implements ActionListener {
//public class MicrowavePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
//	private static final MicrowavePanel INSTANCE = new MicrowavePanel(new I);
	
	private JLabel timeLabel = new JLabel();
	private Image img;
	private List<JButton> numbers = new ArrayList<JButton>();
	JButton start = new JButton(new ImageIcon("src/resources/play.png"));
	JButton pause = new JButton(new ImageIcon("src/resources/pause.png"));
	JButton open = new JButton("Open");
	JButton close = new JButton("Close");

	  public MicrowavePanel(String img, String title) {
	    this(new ImageIcon(img).getImage());	    
	  }

	  public MicrowavePanel(Image img) {
	    this.img = img;
	    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
	    setPreferredSize(size);
	    setMinimumSize(size);
	    setMaximumSize(size);
	    setSize(size);
	    setLayout(null);
	    
	  }

	  public void paintComponent(Graphics g) {
		  timeLabel.setText("00 : 00");
		  timeLabel.setBounds(560, 250, 250, 50);
		  timeLabel.setForeground(Color.YELLOW);
		  this.add(timeLabel);
	  
		  setFocusable(true);
		  requestFocusInWindow();
		  
		  createButtons();
		  showButtons();
		  
		  g.drawImage(img, 0, 0, null);
		  
//		    JFrame frame = new JFrame("Microwave INF1013");
//		    frame.getContentPane().add(this);
//		    frame.pack();
//		    frame.setVisible(true);		
//		    frame.addWindowListener(new WindowAdapter() {
//		         public void windowClosing(WindowEvent windowEvent){
//		            System.exit(0);
//		         }        
//		      }); 
	  }

	private void createButtons() {
		for (int i = 0 ; i <= 9 ; i++){
			numbers.add(new JButton(String.valueOf(i)));
		}
	}
	
	private void showButtons() {
		int x0 = 575;
		int y0 = 490;
		int x1 = 549;
		int y1 = 411;
		
		for (int i = 0 ; i <= 9 ; i++) {
			if (i == 0) {
				numbers.get(i).setBounds(x0, y0, 20, 20);
			} else {
				if ( i == 4 || i == 7 ) {
					y1 += 25;
					x1 = 549;
				} 
				numbers.get(i).setBounds(x1, y1, 20, 20);
				x1 += 25;
			}
			
			this.add(numbers.get(i));
		}
		start.setBounds(565, 523, 20, 20);
		pause.setBounds(585, 523, 20, 20);
		open.setBounds(543, 387, 40, 20);
		close.setBounds(587, 387, 40, 20);
	
		this.add(open);
		this.add(close);
		this.add(start);
		this.add(pause);
	}

	public JLabel getTimeLabel() {
		return timeLabel;
	}

	public void setTimeLabel(JLabel timeLabel) {
		this.timeLabel = timeLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
//	public static synchronized MicrowavePanel getInstance() {
//		return INSTANCE;
//	}
}
