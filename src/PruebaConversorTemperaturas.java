import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Conversor extends JFrame implements ActionListener{

	public Conversor() {
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200, 300);
		setLocationRelativeTo(null);
		setTitle("Conversor de temperaturas");
		setVisible(true);
		
		
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
	
		
	}
	
}


public class PruebaConversorTemperaturas {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {			
			@Override
			public void run() {
			
				new Conversor();
			}
		});


	}

}
