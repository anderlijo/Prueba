package pruebaParaTEMA3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DosBotonesHilos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DosBotonesHilos() {
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		
		JPanel panel = new JPanel(new BorderLayout());
		
		JButton boton1 = new JButton("Iniciar");
		
		JButton boton2 = new JButton("Parar");
		add(panel);
		panel.add(boton1, BorderLayout.WEST);
		panel.add(boton2,BorderLayout.EAST);
		
		boton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				boton1.setEnabled(false);
				Thread t = new Thread(new Runnable() {
				
					@Override
					public void run() {
						// TODO Auto-generated method stub
						for(int i=0;i<1000000;i++) {
							System.out.println("n: "+i);
						}try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						boton1.setEnabled(true);
					}
				});t.start();
				
				
			}
		});
		
		
		
		pack();
		setVisible(true);
		
	}
	
	
	

	public static void main(String[] args) {
		new DosBotonesHilos();

	}

}
