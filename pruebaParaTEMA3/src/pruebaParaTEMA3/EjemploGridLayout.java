package pruebaParaTEMA3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EjemploGridLayout extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public static void main(String[]args) {
		
		new EjemploGridLayout();
	}
	
	
	
	public EjemploGridLayout() {
		
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(620, 480);
		setTitle("Ejemplo GridLayout");
		setLayout(new GridLayout(3,3));
		
									/////////////////////////////7 lo de dejar un hueco donde yo quiera como es????
		
//		for(int i =0;i<4;i++) {
//			
//			JButton boton=new JButton("Boton "+ (i+1));
//			add(boton);
//		
//		}
//		//add(new JPanel());
//		
//		
//		for(int i =0;i<4;i++) {
//			
//			JButton boton=new JButton("Boton "+ (i+1));
//			add(boton);
//			
//		}
		
		
//		for(int i=0;i<9;i++) {
//			
//			JButton boton=new JButton("Boton "+ (i+1));
//			add(boton);
//			
//		}
		
		// voy a meter un boton arriba otro abajo, en la izq un panel y en la derecha otro
		
		JButton boton1=new JButton("norte");
		JButton boton2=new JButton("sur");
		JButton boton3=new JButton("B3");
		JButton boton4=new JButton("B4");
		
		//panel central
		JPanel centro=new JPanel(new BorderLayout());
		
		//parte izq
		JPanel izq=new JPanel(new BorderLayout());
		izq.setBackground(Color.pink);
		
		centro.add(izq, BorderLayout.CENTER);
		
		//parte derecha
		JPanel derecha = new JPanel(new GridLayout(3,3));
		for(int i=0; i<9;i++) {
			derecha.add(new JButton("Boton "+ (i+1)));
		}
		
		centro.add(derecha, BorderLayout.EAST);
		
		//botones de arriba y abajo
		add(boton1, BorderLayout.NORTH);
		add(boton2, BorderLayout.SOUTH);
		
		//setLayout(new BorderLayout());
				
//		JPanel panel=new JPanel();
//		panel.setLayout(new GridLayout(3,3));
//		add(panel, BorderLayout.EAST);
		
		
		
		
		
		
		
		
		
		
		setVisible(true);
		
	}
	
	
	
	
	

}
