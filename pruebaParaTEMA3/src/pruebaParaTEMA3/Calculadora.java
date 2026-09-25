package pruebaParaTEMA3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[]args) {
		new Calculadora();
	}
	
	public Calculadora() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,400);
		setLocationRelativeTo(null);
		setTitle("Calculadora mi");
		
		//JButton zona1= new JButton("Zona 1");
		JTextField pantalla= new JTextField();  //para ver texto que se escribe en pantalla
		pantalla.setHorizontalAlignment(JTextField.RIGHT);	//para que el texto aparezca desde la derecha
		pantalla.setEditable(false);	//para que yo no pueda tocar/editar la pantalla
		pantalla.setBackground(Color.white);	//color
		pantalla.setFont(new Font("Courier", Font.BOLD, 24));	//tipo de letra de la pantalla
		
		JButton zona2= new JButton("Zona 2"); //esto no sé que hacia
		
		add(pantalla, BorderLayout.NORTH);   //pantalla añadida al norte
		
		
		JPanel panelBotones=new JPanel();		//un panel para los botones
		panelBotones.setLayout(new GridLayout(4,10, 5, 5)); //un nuevo grid layout 
		add(panelBotones, BorderLayout.CENTER);	//colocar el panel en el centro
		
		char[]simbolos= {				//esto es una frikada, para hacer una lista con los simbolos y añadirlos
				'7', '8', '9', '/',
				'6', '5', '4', '*',
				'1', '2', '3', '-',
				'0', '.', '=', '+'
				
		};
		for(char s:simbolos){
			JButton boton=new JButton("" + s);
			
			
//			boton.addActionListener(new ActionListener(){
//
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					System.out.println("Pulsado: "+ boton.getText());
//					pantalla.setText(pantalla.getText() + boton.getText());
//					
//				}
//				
//				
//			});
			
			boton.addActionListener(e -> {
				System.out.println("Has pulsado: "+ boton.getText() );
				pantalla.setText((pantalla.getText() + boton.getText() ));});
			
			
			panelBotones.add(boton);
			boton.setBackground(Color.BLUE);
		}
			
		
		
		
	//	add(zona2, BorderLayout.CENTER);
		
		setVisible(true);
	}

}
