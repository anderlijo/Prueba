package pruebaParaTEMA3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;

public class EjemploTable extends JFrame{
	private List<Persona> cargarPersonas(){
		List<Persona>personas=new ArrayList<Persona>();
		personas.add(new Persona("a","b",1));
		personas.add(new Persona("c","d",2));
		personas.add(new Persona("e","f",3));
		
		return personas ;
		
		
	}
	class ModeloEjemplo extends AbstractTableModel{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private List<Persona>personas;
		
		public ModeloEjemplo(List<Persona>personas) {
			this.personas=personas;
		}

		@Override
		public int getRowCount() {
		
			return personas.size();
		}

		@Override
		public int getColumnCount() {
			
			return 3;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
//			System.out.println("fila: "+rowIndex + ", Columna: "+columnIndex);
			
			Persona p = personas.get(rowIndex);
			if(columnIndex==0) {
				return  p.getNombre();
			}
			if(columnIndex==1) {
				return p.getApellido();
			}
			
			if(columnIndex==2) {
				return p.getEdad();
			}
		
			else {
				return "Hola";
			}
			
			
			
		}
		@Override
		public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
			Persona p = personas.get(rowIndex);
			if(columnIndex==0) {
				p.setNombre((String) aValue);
			}
			if(columnIndex==1) {
				p.setApellido((String)aValue);
			}
			
			else {
				p.setEdad(Integer.valueOf((String)aValue));
			}
		
			
		}
		

		@Override
		public String getColumnName(int column) {
			
			//return super.getColumnName(column);
			
			if(column==0) {
				return "Nombre: ";
				
			}
			if(column==1) {
				return "Apellido: ";
				
			}
			if(column==2) {
				return "Edad: ";
				
			}
			return null;
		}

		@Override
		public boolean isCellEditable(int rowIndex, int columnIndex) {
			
			if(columnIndex==2) {
				return true;
			}
			else {
				return false;
			}
			
		}

		
	
		
	}
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public EjemploTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Ejemplo JTable");
		setSize(500,800);		
		
		
		List<Persona>personas=cargarPersonas();
		JTable jtable= new JTable();
		
		jtable.setModel(new ModeloEjemplo(personas));
		
		add(jtable, BorderLayout.CENTER);
		JScrollPane scrollPane = new JScrollPane(jtable);
		add(scrollPane, BorderLayout.CENTER);
		
		jtable.setDefaultRenderer(Object.class , new TableCellRenderer() {
			
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
					int row, int column) {
				// TODO Auto-generated method stub
				JLabel label=new JLabel();
				if(column==0 || column==1) {
					label.setText((String)value);
					
				}else {
					int edad=(int)value;
					label.setText(String.valueOf(edad));
					if(edad<18) {
						label.setForeground(Color.RED);
					}
				}
				return label;
			}
		});
		
		
		
		pack();
		setVisible(true);
	}
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EjemploTable();

	}

	
	
	
	
}
