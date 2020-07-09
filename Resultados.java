import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

class Resultados extends JFrame implements ActionListener
{
	JPanel panel1;
	JPanel panel2;
	JLabel lblTitulo;
	JLabel txtRecibir16;
	ImageIcon imagen;

	JLabel lblTxt1;
	JLabel lblTxt2;
	JLabel lblTxt3;
	JLabel lblTxt4;
	JLabel lblTxt5;
	JLabel lblTxt6;
	JLabel lblTxt7;
	JLabel lblTxt8;
	JLabel lblTxt9;
	JLabel lblTxt10;
	JLabel lblTxt11;
	JLabel lblTxt12;

	public static JTextField txtRecibir2;
	public static JTextField txtRecibir3;
	public static JTextField txtRecibir4;
	public static JTextField txtRecibir5;
	public static JTextField txtRecibir6;
	public static JTextField txtRecibir7;
	public static JTextField txtRecibir8;
	public static JTextField txtRecibir9;
	public static JTextField txtRecibir10;
	public static JTextField txtRecibir11;
	
	JLabel lblTxt13;
	JLabel lblTxt14;
	JLabel lblTxt15;
	JTextField txtRecibir13;
	JTextField txtRecibir14;
	JTextField txtRecibir15;
	JButton btnBoton1;
	JButton btnBoton2;

	Font fuente = new Font("gadugi", 0, 16);
	Font fuente1 = new Font("sagona book", 0, 12);

	public Resultados(Objeto o)
	{
		setSize(520, 770);
		setTitle("RIESGO CARDDIOVASCULAR RESULTADOS");
		setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.GRAY);
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

		panel1.setLayout(null);
		panel1.setBounds(30, 70, 440, 240);
		panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		this.getContentPane().add(panel1);

		panel2.setLayout(null);
		panel2.setBounds(10, 220, 480, 200);
		this.getContentPane().add(panel2);
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

		lblTxt1 = new JLabel("Los datos actuales introducidos son los siguientes: ");
		lblTxt1.setBounds(40, -25, 360, 100);
		lblTxt1.setForeground(Color.BLACK);
		lblTxt1.setFont(fuente);

		lblTxt2 = new JLabel("Edad: ");
		lblTxt2.setBounds(20, 15, 300, 100);
		lblTxt2.setForeground(Color.BLACK);
		lblTxt2.setFont(fuente1);
		txtRecibir2 = new JTextField();
		txtRecibir2.setBounds(120, 55, 75, 22);

		lblTxt3 = new JLabel("Sexo: ");
		lblTxt3.setBounds(220, 15, 300, 100);
		lblTxt3.setForeground(Color.BLACK);
		lblTxt3.setFont(fuente1);
		txtRecibir3 = new JTextField();
		txtRecibir3.setBounds(305, 55, 75, 22);

		lblTxt4 = new JLabel("Diabetes: ");
		lblTxt4.setBounds(20, 50, 300, 100);
		lblTxt4.setForeground(Color.BLACK);
		lblTxt4.setFont(fuente1);
		txtRecibir4 = new JTextField();
		txtRecibir4.setBounds(120, 90, 75, 22);

		lblTxt5 = new JLabel("Fuma: ");
		lblTxt5.setBounds(220, 50, 300, 100);
		lblTxt5.setForeground(Color.BLACK);
		lblTxt5.setFont(fuente1);
		txtRecibir5 = new JTextField();
		txtRecibir5.setBounds(305, 90, 75, 22);

		lblTxt6 = new JLabel("Sistole: ");
		lblTxt6.setBounds(20, 85, 300, 100);
		lblTxt6.setForeground(Color.BLACK);
		lblTxt6.setFont(fuente1);
		txtRecibir6 = new JTextField();
		txtRecibir6.setBounds(120, 125, 75, 22);

		lblTxt7 = new JLabel("Diastole: ");
		lblTxt7.setBounds(220, 85, 300, 100);
		lblTxt7.setForeground(Color.BLACK);
		lblTxt7.setFont(fuente1);
		txtRecibir7 = new JTextField();
		txtRecibir7.setBounds(305, 125, 75, 22);

		lblTxt8 = new JLabel("Colesterol total: ");
		lblTxt8.setBounds(20, 120, 300, 100);
		lblTxt8.setForeground(Color.BLACK);
		lblTxt8.setFont(fuente1);
		txtRecibir8 = new JTextField();
		txtRecibir8.setBounds(120, 160, 75, 22);

		lblTxt9 = new JLabel("Trigliceridos: ");
		lblTxt9.setBounds(220, 120, 300, 100);
		lblTxt9.setForeground(Color.BLACK);
		lblTxt9.setFont(fuente1);
		txtRecibir9 = new JTextField();
		txtRecibir9.setBounds(305, 160, 75, 22);

		lblTxt10 = new JLabel("HDL: ");
		lblTxt10.setBounds(20, 155, 300, 100);
		lblTxt10.setForeground(Color.BLACK);
		lblTxt10.setFont(fuente1);
		txtRecibir10 = new JTextField();
		txtRecibir10.setBounds(120, 195, 75, 22);

		lblTxt11 = new JLabel("LDL: ");
		lblTxt11.setBounds(220, 155, 300, 100);
		lblTxt11.setForeground(Color.BLACK);
		lblTxt11.setFont(fuente1);
		txtRecibir11 = new JTextField();
		txtRecibir11.setBounds(305, 195, 75, 22);

		lblTxt12 = new JLabel("El riesgo calculado es el siguiente: ");
		lblTxt12.setBounds(125, 280, 300, 100);
		lblTxt12.setForeground(Color.BLACK);
		lblTxt12.setFont(fuente);

		panel2.add(lblTitulo);
		panel2.add(lblTxt12);

		panel1.add(lblTxt1);
		panel1.add(lblTxt2);
		panel1.add(lblTxt3);
		panel1.add(lblTxt4);
		panel1.add(lblTxt5);
		panel1.add(lblTxt6);
		panel1.add(lblTxt7);
		panel1.add(lblTxt8);
		panel1.add(lblTxt9);
		panel1.add(lblTxt10);
		panel1.add(lblTxt11);
		panel1.add(txtRecibir2);
		panel1.add(txtRecibir3);
		panel1.add(txtRecibir4);
		panel1.add(txtRecibir5);
		panel1.add(txtRecibir6);
		panel1.add(txtRecibir7);
		panel1.add(txtRecibir8);
		panel1.add(txtRecibir9);
		panel1.add(txtRecibir10);
		panel1.add(txtRecibir11);

		lblTxt13 = new JLabel("Riesgo Absoluto ");
		lblTxt13.setBounds(20, 320, 300, 100);
		lblTxt13.setForeground(Color.BLACK);
		lblTxt13.setFont(fuente1);
		txtRecibir13 = new JTextField();
		txtRecibir13.setBounds(150, 357, 75, 25);
		txtRecibir13.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

		lblTxt14 = new JLabel("Riesgo Ideal ");
		lblTxt14.setBounds(30, 360, 300, 100);
		lblTxt14.setForeground(Color.BLACK);
		lblTxt14.setFont(fuente1);
		txtRecibir14 = new JTextField();
		txtRecibir14.setBounds(150, 396, 75, 25);
		txtRecibir14.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

		lblTxt15 = new JLabel("Riesgo en Exceso ");
		lblTxt15.setBounds(20, 400, 300, 100);
		lblTxt15.setForeground(Color.BLACK);
		lblTxt15.setFont(fuente1);
		txtRecibir15 = new JTextField();
		txtRecibir15.setBounds(150, 435, 75, 25);
		txtRecibir15.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

		imagen = new ImageIcon("riesgocardiovascular.jpg");
		txtRecibir16 = new JLabel();
		txtRecibir16.setBounds(200, 480, 280, 180);
		txtRecibir16.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(280, 180, Image.SCALE_SMOOTH)));

		panel2.add(lblTxt13);
		panel2.add(lblTxt14);
		panel2.add(lblTxt15);
		panel2.add(txtRecibir13);
		panel2.add(txtRecibir14);
		panel2.add(txtRecibir15);
		panel2.add(txtRecibir16);
	}

	public void colocarBotones()
	{
		btnBoton1 = new JButton("Guardar datos");
		btnBoton1.setBounds(125, 680, 120, 25);
		btnBoton1.setFont(new Font("sagona book", 1, 12));
		btnBoton1.setBackground(Color.green);
		btnBoton1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

		btnBoton2 = new JButton("Regresar");
		btnBoton2.setBounds(265, 680, 120, 25);
		btnBoton2.setFont(new Font("sagona book", 1, 12));
		btnBoton2.setBackground(Color.red);
		btnBoton2.setForeground(Color.WHITE);
		btnBoton2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

		panel2.add(btnBoton1);
		panel2.add(btnBoton2);

		btnBoton1.addActionListener(this);
		btnBoton2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource() == this.btnBoton1) 
		{
			String contenido_g;
			contenido_g = txtRecibir2.getText();
			contenido_g = txtRecibir3.getText();
			contenido_g = txtRecibir4.getText();
			contenido_g = txtRecibir5.getText();
			contenido_g = txtRecibir6.getText();
			contenido_g = txtRecibir7.getText();
			contenido_g = txtRecibir8.getText();
			contenido_g = txtRecibir9.getText();
			contenido_g = txtRecibir10.getText();
			contenido_g = txtRecibir11.getText();
			contenido_g = txtRecibir13.getText();
			contenido_g = txtRecibir14.getText();
			contenido_g = txtRecibir15.getText();

			String nombre_ag = "";

			JFileChooser fc = new JFileChooser();
			fc.setDialogTitle("Guardando archivo");

			int userSelection = fc.showSaveDialog(this);

			if (userSelection == JFileChooser.APPROVE_OPTION) 
			{
				File fs = fc.getSelectedFile();
				nombre_ag = fs.getAbsolutePath();
			}
			Archivo.guardarTodo(contenido_g, nombre_ag);			
		}

		else if (event.getSource() == this.btnBoton2) 
		{
			RiesgoCardiovascular rc = new RiesgoCardiovascular();
			rc.setVisible(true);
			this.setVisible(false);	
		}
	}
}