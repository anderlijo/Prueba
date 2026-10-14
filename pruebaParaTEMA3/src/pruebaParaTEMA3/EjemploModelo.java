package pruebaParaTEMA3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EjemploModelo extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Persona> cargarPersonas(){
		List<Persona>personas=new ArrayList<Persona>();
		personas.add(new Persona("a","b",1));
		personas.add(new Persona("c","d",2));
		personas.add(new Persona("e","f",3));
		
		return personas ;
		
		
	}
	
	

	public static void main(String[] args) {
		new EjemploModelo();
		
	}
	public EjemploModelo() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,400);
		setLocationRelativeTo(null);
		
		List<Persona>personas=cargarPersonas();
		
		JPanel panel = new JPanel();
		
		
		JLabel label = new JLabel();
		
		String[] datos=new String[personas.size()];
		for(int i = 0; i<personas.size();i++) {
			Persona p=personas.get(i);
			String s= p.getNombre() +" "+ p.getApellido();
			datos[i]=s;
		}
		
		
		
//		String[] paises= {
//				"Spain","Japan","England","U.S","France"
//		};
		
		
		
//		DefaultComboBoxModel<Persona>modelo=new DefaultComboBoxModel<Persona>();
//		modelo.addAll(personas);
		
		
		JComboBox<String> comboBox=new JComboBox<String>(datos);
		
		
		
		
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
//				String pais=(String)comboBox.getSelectedItem();
//				System.out.println("Seleccionado: "+ pais);
				
				int index = comboBox.getSelectedIndex();
				Persona p=personas.get(index);
				System.out.println("Edad selected p: "+ p.getEdad());
				
			}
		});
		//cambiar como se pinta cada celda del despegable
		//comboBox.setRenderer(new List);
		
		
		
		panel.add(label);
		panel.add(comboBox);
		add(panel, BorderLayout.NORTH);
		
		
		pack();
		setVisible(true);
	}
	
}
