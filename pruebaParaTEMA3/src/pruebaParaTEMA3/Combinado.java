package pruebaParaTEMA3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Combinado extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Combinado();
		
		
	}
	
	public Combinado() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(400,600);
		setTitle("Página");
		
		JPanel panelPrincipal=new JPanel();
		add(panelPrincipal);
		
		
		JPanel panelMedio=new JPanel();
		
	
		JPanel panelInfoPersonal = new JPanel(new GridLayout(2, 2, 200,0));
		panelPrincipal.add(panelInfoPersonal);
		
		JLabel name = new JLabel("Nombre: ");
		panelInfoPersonal.add(name);
		
		JTextField pantallaNombre = new JTextField();
		panelInfoPersonal.add(pantallaNombre);
		
		JLabel email = new JLabel("Email: ");
		panelInfoPersonal.add(email);
		
		JTextField pantallaEmail = new JTextField();
		panelInfoPersonal.add(pantallaEmail);
		
		
		JPanel panelInfoAdicional = new JPanel(new GridLayout(4,2));
		JPanel panelGenero = new JPanel(new FlowLayout());
		
		
		setVisible(true);
	}
}
