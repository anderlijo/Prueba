package pruebaParaTEMA3;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	public static void main(String[] args) {
		new MainWindow();
	}
	
	
	
	
	public MainWindow() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		setTitle("Anigato!");
		
		JButton miBoton= new JButton("Pegame!");
		JButton miBoton1= new JButton("1");
		JButton miBoton2= new JButton("2");
		JButton miBoton3= new JButton("3");
		JButton miBoton4= new JButton("4");
		
//		add(miBoton);
		this.add(miBoton, BorderLayout.CENTER);
		this.add(miBoton1, BorderLayout.NORTH);
		this.add(miBoton2, BorderLayout.WEST);
		this.add(miBoton3, BorderLayout.SOUTH);
		this.add(miBoton4, BorderLayout.EAST);
		
		miBoton.setBackground(Color.lightGray);
		miBoton1.setBackground(Color.CYAN);
		miBoton2.setBackground(Color.GREEN);
		miBoton3.setBackground(Color.RED);
		miBoton4.setBackground(Color.BLUE);
		setVisible(true);
		
	}

}
