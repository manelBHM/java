import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;



public class Morp extends JPanel {
	
	private final JFrame frame;
	int width, height;
	
	
	

	public Morp(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		
		frame = new JFrame("Morpion");
        frame.setSize(720, 480);
        frame.setUndecorated(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(this);
        frame.setBackground(Color.WHITE);
        frame.setVisible(true);

	}




	public static void main(String[] args) {

	   //  new Morp(0, 0);
		
		JFrame t = new JFrame();
		JPanel pan = new JPanel (new GridLayout (3,3));
		Border blackline = BorderFactory.createLineBorder(Color.black,1); 
		for(int i = 0; i<9;i++){
		   JPanel ptest = new JPanel();
		   ptest.setBorder(blackline);
		   pan.add(ptest);
		}
		pan.setBorder(blackline);
		t.add(pan);
		t.setVisible(true);
		
		
		
		
	}

}
