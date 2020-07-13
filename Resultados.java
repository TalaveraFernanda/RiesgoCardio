import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;

class Resultados extends JFrame implements ActionListener
{
	JPanel panel1;
	JPanel panel2;
	JLabel lblTitulo;
	JLabel txtInsertar;
	ImageIcon imagen;
	Objeto o;

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
	JLabel lblTxt13;
	JLabel lblTxt14;
	JLabel lblTxt15;
	JLabel lblTxt16;

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
	public static JTextField txtRecibir12;
	public static JTextField txtRecibir13;
	public static JTextField txtRecibir14;
	public static JTextField txtRecibir15;

	JLabel lblTxt17;
	JLabel lblTxt18;
	JLabel lblTxt19;
	JTextField txtRecibir17;
	JTextField txtRecibir18;
	JTextField txtRecibir19;
	JButton btnBoton1;
	JButton btnBoton2;
	int r1;
	int r2;

	Font fuente = new Font("gadugi", 0, 16);
	Font fuente1 = new Font("sagona book", 0, 12);

	public Resultados(Objeto o, int r1, int r2)
	{
		setSize(520, 770);
		setTitle("RIESGO CARDDIOVASCULAR RESULTADOS");
		setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.GRAY);
		iniciarComponentes();
		this.o = o;
		this.r1 = r1;
		this.r2 = r2;
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
		panel1.setBounds(30, 70, 440, 305);
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
		lblTitulo.setText("RIESGO CARDIOVASCULAR: RESULTADOS");
		lblTitulo.setBounds(30, 10, 440, 50);
		lblTitulo.setFont(new Font("century gothic", 1, 18));
		lblTitulo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		lblTitulo.setOpaque(true);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(Color.BLACK);
		panel2.add(lblTitulo);

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

		lblTxt6 = new JLabel("Antecedentes: ");
		lblTxt6.setBounds(20, 85, 300, 100);
		lblTxt6.setForeground(Color.BLACK);
		lblTxt6.setFont(fuente1);
		txtRecibir6 = new JTextField();
		txtRecibir6.setBounds(120, 125, 75, 22);

		lblTxt7 = new JLabel("Dieta: ");
		lblTxt7.setBounds(220, 85, 300, 100);
		lblTxt7.setForeground(Color.BLACK);
		lblTxt7.setFont(fuente1);
		txtRecibir7 = new JTextField();
		txtRecibir7.setBounds(305, 125, 75, 22);

		lblTxt8 = new JLabel("Años: ");
		lblTxt8.setBounds(20, 120, 300, 100);
		lblTxt8.setForeground(Color.BLACK);
		lblTxt8.setFont(fuente1);
		txtRecibir8 = new JTextField();
		txtRecibir8.setBounds(120, 160, 75, 22);

		lblTxt9 = new JLabel("Apnea: ");
		lblTxt9.setBounds(220, 120, 300, 100);
		lblTxt9.setForeground(Color.BLACK);
		lblTxt9.setFont(fuente1);
		txtRecibir9 = new JTextField();
		txtRecibir9.setBounds(305, 160, 75, 22);

		lblTxt10 = new JLabel("Sistole: ");
		lblTxt10.setBounds(20, 155, 300, 100);
		lblTxt10.setForeground(Color.BLACK);
		lblTxt10.setFont(fuente1);
		txtRecibir10 = new JTextField();
		txtRecibir10.setBounds(120, 195, 75, 22);

		lblTxt11 = new JLabel("Diastole: ");
		lblTxt11.setBounds(220, 155, 300, 100);
		lblTxt11.setForeground(Color.BLACK);
		lblTxt11.setFont(fuente1);
		txtRecibir11 = new JTextField();
		txtRecibir11.setBounds(305, 195, 75, 22);

		lblTxt12 = new JLabel("Colesterol total: ");
		lblTxt12.setBounds(20, 190, 300, 100);
		lblTxt12.setForeground(Color.BLACK);
		lblTxt12.setFont(fuente1);
		txtRecibir12 = new JTextField();
		txtRecibir12.setBounds(120, 230, 75, 22);

		lblTxt13 = new JLabel("Trigliceridos: ");
		lblTxt13.setBounds(220, 190, 300, 100);
		lblTxt13.setForeground(Color.BLACK);
		lblTxt13.setFont(fuente1);
		txtRecibir13 = new JTextField();
		txtRecibir13.setBounds(305, 230, 75, 22);

		lblTxt14 = new JLabel("HDL: ");
		lblTxt14.setBounds(20, 225, 300, 100);
		lblTxt14.setForeground(Color.BLACK);
		lblTxt14.setFont(fuente1);
		txtRecibir14 = new JTextField();
		txtRecibir14.setBounds(120, 265, 75, 22);

		lblTxt15 = new JLabel("LDL: ");
		lblTxt15.setBounds(220, 225, 300, 100);
		lblTxt15.setForeground(Color.BLACK);
		lblTxt15.setFont(fuente1);
		txtRecibir15 = new JTextField();
		txtRecibir15.setBounds(305, 265, 75, 22);

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
		panel1.add(lblTxt12);
		panel1.add(lblTxt13);
		panel1.add(lblTxt14);
		panel1.add(lblTxt15);
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
		panel1.add(txtRecibir12);
		panel1.add(txtRecibir13);
		panel1.add(txtRecibir14);
		panel1.add(txtRecibir15);

		lblTxt16 = new JLabel("El riesgo calculado es el siguiente: ");
		lblTxt16.setBounds(125, 340, 300, 100);
		lblTxt16.setForeground(Color.BLACK);
		lblTxt16.setFont(fuente);

		lblTxt17 = new JLabel("Riesgo Absoluto ");
		lblTxt17.setBounds(15, 372, 300, 100);
		lblTxt17.setForeground(Color.BLACK);
		lblTxt17.setFont(fuente1);
		txtRecibir17 = new JTextField(r1);
		txtRecibir17.setBounds(115, 410, 75, 25);
		txtRecibir17.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		txtRecibir17.setEditable(false);

		lblTxt18 = new JLabel("Riesgo Ideal ");
		lblTxt18.setBounds(20, 407, 300, 100);
		lblTxt18.setForeground(Color.BLACK);
		lblTxt18.setFont(fuente1);
		txtRecibir18 = new JTextField(r2);
		txtRecibir18.setBounds(115, 445, 75, 25);
		txtRecibir18.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		txtRecibir18.setEditable(false);

		lblTxt19 = new JLabel("Riesgo en Exceso ");
		lblTxt19.setBounds(10, 442, 300, 100);
		lblTxt19.setForeground(Color.BLACK);
		lblTxt19.setFont(fuente1);
		txtRecibir19 = new JTextField();
		txtRecibir19.setBounds(115, 480, 75, 25);
		txtRecibir19.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		txtRecibir19.setEditable(false);

		imagen = new ImageIcon("riesgocardiovascular.jpg");
		txtInsertar = new JLabel();
		txtInsertar.setBounds(200, 410, 280, 180);
		txtInsertar.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(280, 180, Image.SCALE_SMOOTH)));

		panel2.add(lblTxt16);
		panel2.add(lblTxt17);
		panel2.add(lblTxt18);
		panel2.add(lblTxt19);
		panel2.add(txtRecibir17);
		panel2.add(txtRecibir18);
		panel2.add(txtRecibir19);
		panel2.add(txtInsertar);
	}

	public void colocarBotones()
	{
		btnBoton1 = new JButton("Guardar datos");
		btnBoton1.setBounds(125, 680, 120, 25);
		btnBoton1.setFont(new Font("sagona book", 3, 12));
		btnBoton1.setForeground(Color.BLACK);
		btnBoton1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

		btnBoton2 = new JButton("Regresar");
		btnBoton2.setBounds(265, 680, 120, 25);
		btnBoton2.setFont(new Font("sagona book", 3, 12));
		btnBoton2.setForeground(Color.BLACK);
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
			int edad = this.o.edad;
			String sexo = this.o.sexo;
			boolean diab = this.o.diab;
			String taba = this.o.taba;
			String ant = this.o.ant;
			int dieta = this.o.dieta;
			int anios = this.o.anios;
			boolean apnea = this.o.apnea;
			int sist = this.o.sist;
			int dias = this.o.dias;
			int colT = this.o.colT;
			int tri = this.o.tri;
			int hdl = this.o.hdl;
			int ldl = this.o.ldl;

			String ed = Integer.toString(edad);
			String d = String.valueOf(diab);
			String dt = Integer.toString(dieta);
			String an =  Integer.toString(anios);
			String ap = String.valueOf(apnea);
			String si = Integer.toString(sist);
			String di = Integer.toString(dias);
			String ct = Integer.toString(colT);
			String tr = Integer.toString(tri);
			String h = Integer.toString(hdl);
			String l = Integer.toString(ldl);

			if(d.equals("Si"))
				diab = true;
			else
				diab = false;

			if(ap.equals("Si"))
				apnea = true;
			else
				apnea = false;

			ArrayList<String> contenido = new ArrayList<>();
			contenido.add("Edad: " +ed);
			contenido.add("Sexo: " +sexo);
			contenido.add("Diabetes: " +d);
			contenido.add("Fuma: " +taba);
			contenido.add("Antecedentes: " +ant);
			contenido.add("Dieta: " +dt);
			contenido.add("Años: " +an);
			contenido.add("Apnea: " +ap);
			contenido.add("Sistole: " +si);
			contenido.add("Diastole: " +di);
			contenido.add("Colesterol total: " +ct);
			contenido.add("Trigliceridos: " +tr);
			contenido.add("HDL: " +h);
			contenido.add("LDL: " +l);

			System.out.println(contenido);
			String nombre_ag = "";

			JFileChooser fc = new JFileChooser();
			fc.setDialogTitle("Guardando archivo");

			int userSelection = fc.showSaveDialog(this);

			if (userSelection == JFileChooser.APPROVE_OPTION)
			{
				File fs = fc.getSelectedFile();
				nombre_ag = fs.getAbsolutePath();
			}
			Archivo.crearArchivo(contenido, nombre_ag);
		}

		else if (event.getSource() == this.btnBoton2)
		{
			RiesgoCardiovascular rc = new RiesgoCardiovascular();
			rc.setVisible(true);
			this.setVisible(false);
		}
	}
}
