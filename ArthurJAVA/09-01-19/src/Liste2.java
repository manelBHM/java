import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Liste2 {

	
	public static void main(String[] args) {

	JMenuBar a = new JMenuBar();	
	JMenuBar a1 = new JMenuBar();
	JFrame x = new JFrame()	;
	JMenu b = new JMenu("SALUT");
	JMenu c = new JMenu("SAVA");
	b.setEnabled(true);
	c.setEnabled(true);
	
	a.add(b);
	a1.add(c);
	x.setBounds(100, 10, 600, 400);
	x.setVisible(true);
	x.setResizable(false);
    x.setJMenuBar(a);
    x.setJMenuBar(a1);
	x.setTitle("COUCOU");
		
	}

}
