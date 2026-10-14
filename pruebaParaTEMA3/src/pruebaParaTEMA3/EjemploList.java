package pruebaParaTEMA3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;

public class EjemploList extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private List<Persona> cargarPersonas(){
		List<Persona>personas=new ArrayList<Persona>();
		personas.add(new Persona("a","b",1));
		personas.add(new Persona("c","d",2));
		personas.add(new Persona("e","f",3));
		
		personas.add(new Persona("a","b",1));
		personas.add(new Persona("c","d",2));
		personas.add(new Persona("e","f",3));
		
		personas.add(new Persona("a","b",1));
		personas.add(new Persona("c","d",2));
		personas.add(new Persona("e","f",3));
		
		personas.add(new Persona("a","b",1));
		personas.add(new Persona("c","d",2));
		personas.add(new Persona("e","f",3));
		
		personas.add(new Persona("a","b",1));
		personas.add(new Persona("c","d",2));
		personas.add(new Persona("e","f",3));
		
		return personas ;
		
		
	}
	
	public EjemploList() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,450);
		setLocationRelativeTo(null);
		
		ArrayList<Persona> personas =new ArrayList<Persona>(cargarPersonas());
		
		//ponerlas en un JList		
		DefaultListModel<Persona> modelo = new DefaultListModel<Persona>();
		modelo.addAll(personas);
			
		
		
		JList<Persona> jlist = new JList<Persona>(modelo);
		
		JScrollPane scrollPane=new JScrollPane(jlist);
		
		add(scrollPane, BorderLayout.CENTER);
		
		jlist.setCellRenderer(new ListCellRenderer<Persona>() {

			@Override
			public Component getListCellRendererComponent(JList<? extends Persona> list, Persona value, int index,
					boolean isSelected, boolean cellHasFocus) {
				// TODO Auto-generated method stub
					
					JLabel label = new JLabel(value.getNombre() + " "+ value.getApellido() + " "+ index);
//					if(index % 2 == 0) {
//						label.setHorizontalAlignment(JLabel.RIGHT);
//						label.setFont(new Font("Arial", Font.ITALIC, 30));
//					}
					
					if (value.getNombre().contains("a")) {
						label.setForeground(Color.YELLOW);
					}
					
					return label;
			}
			
			
		});
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EjemploList();

	}

}
