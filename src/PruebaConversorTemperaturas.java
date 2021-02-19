import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Conversor extends JFrame implements ActionListener{

	JTextField caja1,cajaRes;
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
		
		String t1 [] = {"�Centigrados", "�Fahrenheit", "�Kelvin", "�Rankine"};
		temps1 = new JComboBox<>(t1);
		temps1.addActionListener(this);
		add(temps1);
		
		add(new JLabel("A: "));
		
		temps2 = new JComboBox<>();
		temps2.addItem("Elige opcion...");
		add(temps2);
		
		add(new JLabel("="));
		
		cajaRes = new JTextField(5);
		cajaRes.addActionListener(this);
		add(cajaRes);
		
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		String tC [] = {"�Fahrenheit", "�Kelvin", "�Rankine"};
		if(e.getSource() == temps1) {
			temps2.removeAllItems();
			if(temps1.getSelectedItem().equals("�Centigrados")) {
				for( String x : tC)
					temps2.addItem(x);
			}
		}
		
		
		String tF [] = {"�Centigrados", "�Kelvin", "�Rankine"};
		if(e.getSource() == temps1) {
			temps2.removeAllItems();
			if(temps1.getSelectedItem().equals("�Fahrenheit")) {
				for( String x : tF)
					temps2.addItem(x);
			}
		}
		
		
		String tK [] = {"�Centigrados", "�Fahrenheit", "�Rankine"};
		if(e.getSource() == temps1) {
			temps2.removeAllItems();
			if(temps1.getSelectedItem().equals("�Kelvin")) {
				for( String x : tK)
					temps2.addItem(x);
			}
		}
		
		
		String tR [] = {"�Centigrados", "�Fahrenheit", "�Kelvin"};
		if(e.getSource() == temps1) {
			temps2.removeAllItems();
			if(temps1.getSelectedItem().equals("�Rankine")) {
				for( String x : tR)
					temps2.addItem(x);
			}
		}
		
	
	
	
	}//actionP
	
	
}//class


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
