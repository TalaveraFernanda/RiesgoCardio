import javax.swing.*;

public class Objeto extends JFrame
{
	public int edad;
	public String sexo;
	public boolean diab;
	public String taba;
	public String ant;
	public int dieta;
	public int anios;
	public boolean apnea;
	public int sist;
	public int dias; 
	public int colT; 
	public int tri;
	public int hdl; 
	public int ldl;

	public Objeto(int edad, String sexo, boolean diab, String taba, String ant, int dieta, int anios, boolean apnea, int sist, int dias, int colT, int tri, int hdl, int ldl)
	{
		this.edad = edad;
		this.sexo = sexo;
		this.diab = diab;
		this.taba = taba;
		this.ant = ant;
		this.dieta = dieta;
		this.anios = anios;
		this.apnea = apnea;
		this.sist = sist;
		this.dias = dias;
		this.colT = colT;
		this.tri = tri;
		this.hdl = hdl;
		this.ldl = ldl;
	}
}