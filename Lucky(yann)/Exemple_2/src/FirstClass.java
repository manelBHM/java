
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class FirstClass {

	public static void main(String[] args) {
		MaFenetre f = new MaFenetre();
		f.afficher();
		f.afficher("Hello World that'is my first Class in Java");
	}

}
class MaFenetre{
	JFrame mainFrame = null;
	public MaFenetre() {
		mainFrame = new JFrame();
		mainFrame.setTitle("Mon application");
		mainFrame.addWindowListener(new WindowAdapter() {
			
			class MonAutreClasse {
				public void afficher(String message) {
					System.out.println(message);
				}
			}
			public void windowClosing(WindowEvent ev) {
				System.exit(0);
			}
		});
		mainFrame.setSize(300, 200);
		mainFrame.setLocation(20, 600);
	}
	public void afficher() {
		mainFrame.setVisible(true);
		JLabel label = new JLabel("Welcome to my First Application");
		mainFrame.add(label);
	}
	public void afficher(String message) {
		System.out.println(message);
	}
}