import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class RiesgoCardiovascular extends JFrame implements ActionListener
{
	public JPanel panel1;
	public JPanel panel2;
	public JPanel panel3;
	public JPanel panel4;

	JLabel lblTitulo;
	JLabel lblTit1;
	JLabel lblTit2;
	JLabel lblTit3;

	JButton btnBoton1;
	JButton btnBoton2;

	JLabel lblTexto1;
	JLabel lblTexto2;
	JLabel lblTexto3;
	JLabel lblTexto4;
	JLabel lblTexto5;
	JLabel lblTexto6;
	JLabel lblTexto7;
	JLabel lblTexto8;
	JLabel lblTexto9;
	JLabel lblTexto10;
	JLabel lblTexto11;
	JLabel lblTexto12;
	JLabel lblTexto13;
	JLabel lblTexto14;
	JLabel lblTexto15;
	JLabel lblTexto16;
	JLabel lblTexto17;

	JComboBox lista2;
	JComboBox lista3;
	JComboBox lista4;
	JComboBox lista6;
	JComboBox lista7;
	JComboBox lista8;
	JComboBox lista9;
		
	public static JTextField txtEnviar1;
	public static JTextField txtEnviar5;
	public static JTextField txtEnviar10;
	public static JTextField txtEnviar11;
	public static JTextField txtEnviar14;
	public static JTextField txtEnviar15;
	public static JTextField txtEnviar16;
	public static JTextField txtEnviar17;

	Font fuente = new Font("gadugi", 1, 14);
	Font fuente1 = new Font("sagona book", 0, 12);

	public RiesgoCardiovascular()
	{
		setSize(520, 840);
		setTitle("RIESGO CARDDIOVASCULAR");
		setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.gray);	
		iniciarComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void iniciarComponentes()
	{
		colocarPaneles();
		colocarEtiquetas();
		colocarBotones();
	}

	public void colocarPaneles()
	{
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();

		panel1.setLayout(null);
		panel1.setBounds(10, 75, 480, 300);
		panel1.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		this.getContentPane().add(panel1);

		panel2.setLayout(null);
		panel2.setBounds(10, 372, 480, 160);
		panel2.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		this.getContentPane().add(panel2);

		panel3.setLayout(null);
		panel3.setBounds(10, 530, 480, 200);
		panel3.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		this.getContentPane().add(panel3);

		panel4.setLayout(null);
		panel4.setBounds(10, 640, 480, 100);
		panel4.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		this.getContentPane().add(panel4);
	}

	public void colocarEtiquetas()
	{
		lblTitulo = new JLabel();
		lblTitulo.setLayout(null);
		lblTitulo.setText("RIESGO CARDIOVASCULAR");
		lblTitulo.setBounds(120, 10, 250, 50);
		lblTitulo.setFont(new Font("century gothic", 1, 18));
		lblTitulo.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
		lblTitulo.setOpaque(true);
		lblTitulo.setBackground(Color.WHITE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(Color.BLACK);

		panel4.add(lblTitulo);

		lblTit1 = new JLabel();
		lblTit1.setLayout(null);
		lblTit1.setText("FACTORES DE RIESGO");
		lblTit1.setBounds(160, 10, 150, 30);
		lblTit1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		lblTit1.setOpaque(true);
		lblTit1.setBackground(Color.BLUE);
		lblTit1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTit1.setForeground(Color.WHITE);
		lblTit1.setFont(fuente);

		lblTexto1 = new JLabel("Edad");
		lblTexto1.setBounds(50, 10, 50, 100);
		lblTexto1.setFont(fuente1);
		txtEnviar1 = new JTextField();
		txtEnviar1.setBounds(110, 50, 75, 25);

		lblTexto2 = new JLabel("Sexo");
		lblTexto2.setBounds(260, 10, 50, 100);
		lblTexto2.setFont(fuente1);
		String [] s = {"Elija","Hombre","Mujer"};
		lista2 = new JComboBox(s);
		lista2.setBounds(320, 50, 75, 25);
		lista2.setFont(fuente1);
		
		lblTexto3 = new JLabel("Diabetes");
		lblTexto3.setBounds(50, 60, 100, 100);
		lblTexto3.setFont(fuente1);
		String [] d = {"Elija","Si","No"};
		lista3 = new JComboBox(d);
		lista3.setBounds(110, 100, 75, 25);
		lista3.setFont(fuente1);

		lblTexto4 = new JLabel("Fuma");
		lblTexto4.setBounds(260, 60, 50, 100);
		lblTexto4.setFont(fuente1);
		String [] f = {"Elija","Si","No","F. Pasivo"};
		lista4 = new JComboBox(f);
		lista4.setBounds(320, 100, 75, 25);
		lista4.setFont(fuente1);

		lblTexto5 = new JLabel("Diabetes");
		lblTexto5.setBounds(50, 110, 100, 100);
		lblTexto5.setFont(fuente1);
		txtEnviar5 = new JTextField();
		txtEnviar5.setBounds(110, 150, 75, 25);
		
		lblTexto6 = new JLabel("Dieta");
		lblTexto6.setBounds(260, 110, 50, 100);
		lblTexto6.setFont(fuente1);
		String [] c = {"Elija", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		lista6 = new JComboBox(c);
		lista6.setBounds(320, 150, 75, 25);
		lista6.setFont(fuente1);

		lblTexto7 = new JLabel("Antecedentes");
		lblTexto7.setBounds(50, 160, 100, 100);
		lblTexto7.setFont(fuente1);
		String [] a = {"Elija", "IM", "AP", "No"};
		lista7 = new JComboBox(a);
		lista7.setBounds(135, 200, 75, 25);
		lista7.setFont(fuente1);

		lblTexto8 = new JLabel("Apnea");
		lblTexto8.setBounds(260, 160, 50, 100);
		lblTexto8.setFont(fuente1);
		String [] a1 = {"Elija", "Si", "No"};
		lista8 = new JComboBox(a1);
		lista8.setBounds(320, 200, 75, 25);
		lista8.setFont(fuente1);

		lblTexto9 = new JLabel("Calcular el riesgo a");
		lblTexto9.setBounds(140, 210, 130, 100);
		lblTexto9.setFont(fuente1);
		String [] c1 = {"Años", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		lista9 = new JComboBox(c1);
		lista9.setBounds(260, 250, 75, 25);
		lista9.setFont(fuente1);

		panel1.add(lblTit1);
		panel1.add(lista2);
		panel1.add(lista3);
		panel1.add(lista4);
		panel1.add(lista6);
		panel1.add(lista7);
		panel1.add(lista8);
		panel1.add(lista9);
		panel1.add(lblTexto1);
		panel1.add(lblTexto2);
		panel1.add(lblTexto3);
		panel1.add(lblTexto4);
		panel1.add(lblTexto5);
		panel1.add(lblTexto6);
		panel1.add(lblTexto7);
		panel1.add(lblTexto8);
		panel1.add(lblTexto9);
		panel1.add(txtEnviar1);
		panel1.add(txtEnviar5);

		lblTit2 = new JLabel();
		lblTit2.setLayout(null);
		lblTit2.setText("PRESION / TENSION ARTERIAL (mm de Hg)");
		lblTit2.setBounds(65, 10, 350, 30);
		lblTit2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		lblTit2.setOpaque(true);
		lblTit2.setBackground(Color.BLUE);
		lblTit2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTit2.setForeground(Color.WHITE);
		lblTit2.setFont(fuente);
		
		lblTexto10 = new JLabel("Sistolica o HVI:");
		lblTexto10.setBounds(130, 20, 150, 100);
		lblTexto10.setFont(fuente1);
		txtEnviar10 = new JTextField();
		txtEnviar10.setBounds(270, 58, 75, 25);

		lblTexto11 = new JLabel("Diastolica o minima:");
		lblTexto11.setBounds(120, 70, 150, 100);
		lblTexto11.setFont(fuente1);
		txtEnviar11 = new JTextField();
		txtEnviar11.setBounds(270, 108, 75, 25);

		panel2.add(lblTit2);
		panel2.add(lblTexto10);
		panel2.add(lblTexto11);
		panel2.add(txtEnviar10);
		panel2.add(txtEnviar11);

		lblTit3 = new JLabel();
		lblTit3.setLayout(null);
		lblTit3.setText("PERFIL DE LIPIDOS (solo en mg/dl)");
		lblTit3.setBounds(115, 10, 250, 30);
		lblTit3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		lblTit3.setOpaque(true);
		lblTit3.setBackground(Color.BLUE);
		lblTit3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTit3.setForeground(Color.WHITE);
		lblTit3.setFont(fuente);
		
		lblTexto12 = new JLabel("-HDL: Lipoproteinas de alta densidad");
		lblTexto12.setBounds(130, 10, 300, 100);
		lblTexto12.setFont(fuente1);

		lblTexto13 = new JLabel("-LDL: Lipoproteinas de baja densidad");
		lblTexto13.setBounds(130, 30, 300, 100);
		lblTexto13.setFont(fuente1);

		lblTexto14 = new JLabel("Colesterol total:");
		lblTexto14.setBounds(50, 75, 150, 100);
		lblTexto14.setFont(fuente1);
		txtEnviar14 = new JTextField();
		txtEnviar14.setBounds(150, 114, 75, 25);

		lblTexto15 = new JLabel("Trigliceridos:");
		lblTexto15.setBounds(273, 75, 150, 100);
		lblTexto15.setFont(fuente1);
		txtEnviar15 = new JTextField();
		txtEnviar15.setBounds(365, 114, 75, 25);

		lblTexto16 = new JLabel("Colesterol HDL:");
		lblTexto16.setBounds(50, 120, 150, 100);
		lblTexto16.setFont(fuente1);
		txtEnviar16 = new JTextField();
		txtEnviar16.setBounds(150, 158, 75, 25);

		lblTexto17 = new JLabel("Colesterol LDL:");
		lblTexto17.setBounds(270, 120, 320, 100);
		lblTexto17.setFont(fuente1);
		txtEnviar17 = new JTextField();
		txtEnviar17.setBounds(365, 158, 75, 25);

		panel3.add(lblTit3);
		panel3.add(lblTexto12);
		panel3.add(lblTexto13);
		panel3.add(lblTexto14);
		panel3.add(lblTexto15);
		panel3.add(lblTexto16);
		panel3.add(lblTexto17);
		panel3.add(txtEnviar14);
		panel3.add(txtEnviar15);
		panel3.add(txtEnviar16);
		panel3.add(txtEnviar17);	
	}

	public void colocarBotones()
	{
		btnBoton1 = new JButton("Enviar datos");
		btnBoton1.setBounds(125, 750, 120, 25);
		btnBoton1.setFont(new Font("sagona book", 1, 12));
		btnBoton1.setBackground(Color.green);
		btnBoton1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

		btnBoton2 = new JButton("Borrar datos");
		btnBoton2.setBounds(265, 750, 120, 25);
		btnBoton2.setFont(new Font("sagona book", 1, 12));
		btnBoton2.setBackground(Color.red);
		btnBoton2.setForeground(Color.WHITE);
		btnBoton2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

		panel4.add(btnBoton1);
		panel4.add(btnBoton2);

		btnBoton1.addActionListener(this);
		btnBoton2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource() == this.btnBoton1) 
		{
			String edad_str = txtEnviar1.getText();
			String sexo = lista2.getSelectedItem().toString();
			String diab_str = lista3.getSelectedItem().toString();
			String taba = lista4.getSelectedItem().toString();
			String dieta_str = lista6.getSelectedItem().toString();
			String ant = lista7.getSelectedItem().toString();
			String apnea_str = lista8.getSelectedItem().toString();
			String anos_str = lista9.getSelectedItem().toString();
			String sis_str = txtEnviar10.getText();
			String dias_str = txtEnviar11.getText();
			String colT_str = txtEnviar14.getText();
			String tri_str = txtEnviar15.getText();
			String hdl_str = txtEnviar16.getText();
			String ldl_str = txtEnviar17.getText();

			// imprimiendo en consola 
			System.out.println("Edad: " +edad_str);
			System.out.println("Sexo: " +sexo);
			System.out.println("Diabetes: " +diab_str);
			System.out.println("Tabaco: " +taba);
			System.out.println("Dieta: " +dieta_str);
			System.out.println("Antecedentes ECV: " +ant);
			System.out.println("Apnea: " +apnea_str);
			System.out.println("Calcular a: " +anos_str+ "años");
			System.out.println("Sistole: " +sis_str);
			System.out.println("Diastole: " +dias_str);
			System.out.println("Col total: " +colT_str);
			System.out.println("Trigliceridos: " +tri_str);
			System.out.println("HDL: " +hdl_str);
			System.out.println("LDL: " +ldl_str);

			// conversión de datos 
			int edad = Integer.parseInt(edad_str);
			// sexo se mantiene igual
			boolean diab;
			if(diab_str.equals("Si"))
				diab = true;
			else
				diab = false;

			/*boolean taba;
			if(taba_str.equals("Si"))
				taba = true;
			else
				taba = false;*/

			boolean apnea;
			if(apnea_str.equals("Si"))
				apnea = true;
			else
				apnea = false;

			int dieta = Integer.parseInt(dieta_str);
			int anos = Integer.parseInt(anos_str);
			int sist = Integer.parseInt(sis_str);
			int dias = Integer.parseInt(dias_str);
			int colT = Integer.parseInt(colT_str);
			int tri = Integer.parseInt(tri_str);
			int hdl = Integer.parseInt(hdl_str);
			int ldl = Integer.parseInt(ldl_str);

			// mandar a analizar los datos:
			AnalisisDeDatos ad = new AnalisisDeDatos(edad, sexo, diab, taba, dieta, ant, apnea, anos, sist, dias, colT, tri, hdl, ldl); 
			Objeto o = new Objeto(edad, sexo, diab, taba, sist, dias, colT, tri, hdl, ldl);
			
			/*txtEnviar1.setText("");
			txtEnviar10.setText("");
			txtEnviar11.setText("");
			txtEnviar14.setText("");
			txtEnviar15.setText("");
			txtEnviar16.setText("");
			txtEnviar17.setText("");*/

			Resultados r = new Resultados(o);
			/*r.setVisible(true);
			this.setVisible(false);*/	

			r.txtRecibir2.setText(txtEnviar1.getText());
			r.txtRecibir6.setText(txtEnviar10.getText());
			r.txtRecibir7.setText(txtEnviar11.getText());
			r.txtRecibir8.setText(txtEnviar14.getText());
			r.txtRecibir9.setText(txtEnviar15.getText());
			r.txtRecibir10.setText(txtEnviar16.getText());
			r.txtRecibir11.setText(txtEnviar17.getText());
		}

		else if (event.getSource() == this.btnBoton2) 
		{
			txtEnviar1.setText(null);
			txtEnviar5.setText(null);
			txtEnviar10.setText(null);
			txtEnviar11.setText(null);
			txtEnviar14.setText(null);
			txtEnviar15.setText(null);
			txtEnviar16.setText(null);
			txtEnviar17.setText(null);
		}
	} 
}	