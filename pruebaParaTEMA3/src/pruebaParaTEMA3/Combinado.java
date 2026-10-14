package pruebaParaTEMA3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicRadioButtonUI;

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
		setResizable(true); //esto hace que el usuario no puede agrandar la pestaña
		setTitle("Página");
		
		
		//menu principal y opciones del menu
		JMenuBar menuBar= new JMenuBar();
		JMenu menuFichero = new JMenu("Fichero");
		
		JMenuItem menuItemMostrar = new JMenuItem("Mostrar");
		JMenuItem menuItemLimpiar = new JMenuItem("Limpiar");
		JMenuItem menuItemSalir= new JMenuItem("Salir");
		
		menuFichero.add(menuItemMostrar);
		menuFichero.add(menuItemLimpiar);
		menuFichero.add(menuItemSalir);
		
		menuItemSalir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//System.exit(0);				esto lo cierra directamente
				int opcion = JOptionPane.showConfirmDialog(Combinado.this, "¿Seguro que quieres salir?", "SALIR", JOptionPane.YES_NO_OPTION);
				if(opcion == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
			
			
		});
		
		
		JMenu menuAyuda = new JMenu("Ayuda");
		
		menuBar.add(menuFichero);
		menuBar.add(menuAyuda);
		
		this.setJMenuBar(menuBar);
		
		
		
		//añadir tabs y panel de botones a la ventana
		JTabbedPane panelTabs = new JTabbedPane();
		add(panelTabs, BorderLayout.CENTER);
		
		JPanel panelBotones = new JPanel();
		
		JButton mostrarDatos = new JButton("Mostrar datos");
		JButton limpiar = new JButton("Limpiar");
		JButton salir = new JButton("Salir");
		
		panelBotones.add(mostrarDatos);
		panelBotones.add(limpiar);
		panelBotones.add(salir);
		add(panelBotones, BorderLayout.SOUTH);
		
		
		JPanel tab1= crearPanelDatosPersonales();		
		panelTabs.addTab("Datos Personales", tab1);
		
		JPanel tab2= new JPanel();
		tab2.setBackground(Color.yellow);
		panelTabs.addTab("Datos Personales", tab2);
		
		
		
		setVisible(true);
		pack();
		
	}
		private JPanel crearPanelDatosPersonales() {
			JPanel panelDatosPersonales= new JPanel(new BorderLayout());
			
					
			
		
			JPanel panelInfoPersonal = new JPanel(new GridLayout(2, 2, 10,10)); /////panel infoPersonal
			panelDatosPersonales.add(panelInfoPersonal, BorderLayout.NORTH);
		//	panelInfoPersonal.setBackground(Color.CYAN);
			Border bordeInfoPersonal = BorderFactory.createTitledBorder("Info Personal");
			panelInfoPersonal.setBorder(bordeInfoPersonal);
			
			
			
			JLabel name = new JLabel("Nombre: "); ////////nombre
			panelInfoPersonal.add(name);
			
			JTextField pantallaNombre = new JTextField(); //////////pantalla nombre
			panelInfoPersonal.add(pantallaNombre);
			
			JLabel email = new JLabel("Email: ");///////////////// email
			panelInfoPersonal.add(email);
			
			JTextField pantallaEmail = new JTextField();//////////////pantalla email
			panelInfoPersonal.add(pantallaEmail);
			
			
			
			
			JPanel panelInfoAdicional = new JPanel(new GridLayout(4,2));//////panel Info Adicional
			panelDatosPersonales.add(panelInfoAdicional, BorderLayout.CENTER);
			//panelInfoAdicional.setBackground(Color.GREEN);
			Border bordeInfoAdicional =BorderFactory.createTitledBorder("Info Adicional");
			panelInfoAdicional.setBorder(bordeInfoAdicional);
			
			
			
			JLabel telefono = new JLabel("Teléfono: "); ////telef
			panelInfoAdicional.add(telefono);
			
			JTextField pantallaTelefono = new JTextField();///pantalla telef
			panelInfoAdicional.add(pantallaTelefono);
			
			JLabel direccion = new JLabel("Dirección: ");///// direccion
			panelInfoAdicional.add(direccion);
			
			JTextField pantallaDireccion = new JTextField();/////pantalla direccion
			panelInfoAdicional.add(pantallaDireccion);
			
			JLabel ciudad = new JLabel("Ciudad: "); ////// ciudad
			panelInfoAdicional.add(ciudad);
			
			JTextField pantallaCiudad = new JTextField(); //////// pantalla ciudad
			panelInfoAdicional.add(pantallaCiudad);
			
			JLabel pais = new JLabel("País: "); ////// pais
			panelInfoAdicional.add(pais);
			
			
			String[] opciones= {"Perú","España", "Estados Unidos", "Francia", "Portugal"}; ////comboBox pais
			JComboBox<String> selectorPais= new JComboBox<String>(opciones);
			panelInfoAdicional.add(selectorPais);

			
			
			
			
															/// asi aparece pegado a la izquierda
			JPanel panelGenero = new JPanel(new FlowLayout(FlowLayout.LEFT));///////////////////////////////panel GENERO
			panelDatosPersonales.add(panelGenero, BorderLayout.SOUTH);
			//panelGenero.setBackground(Color.ORANGE);
			Border bordeGenero = BorderFactory.createTitledBorder("Genero");
			panelGenero.setBorder(bordeGenero);
			
			
			JRadioButton radioMasculino = new JRadioButton("Masculino");
			JRadioButton radioFemenino = new JRadioButton("Femenino");
			JRadioButton radioOtro = new JRadioButton("Otro");
			
			panelGenero.add(radioMasculino);
			panelGenero.add(radioFemenino);
			panelGenero.add(radioOtro);
			
		
		
		
		
		
		return panelDatosPersonales;
	}
		
}
