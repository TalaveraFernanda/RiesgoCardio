import javax.swing.*;

public class Objeto extends JFrame
{
	public int edad;
	public String sexo;
	public boolean diab;
	public String taba;
	public int sist;
	public int dias; 
	public int colT; 
	public int tri;
	public int hdl; 
	public int ldl;

	public Objeto(int edad, String sexo, boolean diab, String taba, int sist, int dias, int colT, int tri, int hdl, int ldl)
	{
		this.edad = edad;
		this.sexo = sexo;
		this.diab = diab;
		this.taba = taba;
		this.sist = sist;
		this.dias = dias;
		this.colT = colT;
		this.tri = tri;
		this.hdl = hdl;
		this.ldl = ldl;
	}
}