package pruebaParaTEMA3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EjemploListener extends JFrame{


	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EjemploListener();

	}
	
//	class ClickListener implements ActionListener{
//																	esto es lo mismo que lo de abajo pero de otra manera
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("afgagee");
//			
//			
//		}
//	}
	public EjemploListener(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hola");
		setSize(300,400);
		setLocationRelativeTo(null);
		
		
		
		JButton boton=new JButton("Click");
	//	boton.addActionListener(new  ClickListener());
//		boton.addActionListener(new ActionListener(){				// !!!!!!!!!!!!-->a esto me refiero<--!!!!!!!!!!!!!
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("aqui usamos una clase anónima");
//				
//			}
//			
//		});
		
		boton.addActionListener(e ->System.out.println("Listener como una expresion lambda"));	//expresion lambda
		
		
		JPanel panel=new JPanel();
		panel.add(boton);
		
		add(panel, BorderLayout.NORTH);
		
		setVisible(true);
		
		
		
	}

}
