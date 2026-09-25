package pruebaParaTEMA3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow2 extends JFrame{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	public static void main(String[] args) {
		new MainWindow2();
	}
	
	
	
	
	public MainWindow2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		setTitle("Window 2");
		
		
		
		
		JButton boton1=new JButton("Boton uno");
		JButton boton2=new JButton("Boton dos");
		JButton boton3=new JButton("Boton tres!!!");
		JButton boton4=new JButton("El cuatro");
		
		add(boton1, BorderLayout.NORTH);
		add(boton2, BorderLayout.SOUTH);
	//	add(boton3, BorderLayout.NORTH);
		
		JPanel panel= new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.red);
		add(panel, BorderLayout.WEST);
		panel.add(boton3, BorderLayout.NORTH);
		panel.add(boton4, BorderLayout.SOUTH);
		
		
//		setLayout(new FlowLayout());
//		JButton boton=new JButton("Boton 1");
//		add(boton);
		
//		for(int i=0; i<5;i++) {
//			JButton button1=new JButton("Boton "+ (i +1));
//			panel.add(button1);
//			
//		}
		
		
		
		
		
		
		setVisible(true);
		
	}

}
