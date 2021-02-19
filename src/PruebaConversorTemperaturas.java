import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Conversor extends JFrame implements ActionListener{

	JTextField caja1,caja2;
	JComboBox<String> temps1,temps2;
	
	public Conversor() {
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250, 105);
		setLocationRelativeTo(null);
		setTitle("Conversor de temperaturas");
		setVisible(true);
		
		
		add(new JLabel("Convertir:"));
		
		caja1 = new JTextField(5);
		caja1.addActionListener(this);
		add(caja1);
		
		String t1 [] = {"°Centigrados", "°Fahrenheit", "°Kelvin", "°Rankine"};
		temps1 = new JComboBox<>(t1);
		temps1.addActionListener(this);
		add(temps1);
		
		add(new JLabel("A: "));
		
		temps2 = new JComboBox<>();
		temps2.addItem("Elige opcion...");
		add(temps2);
		
		add(new JLabel("="));
		
		caja2 = new JTextField(5);
		caja2.addActionListener(this);
		add(caja2);
		
		
		
		
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
