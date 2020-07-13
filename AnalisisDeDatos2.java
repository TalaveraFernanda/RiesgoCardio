import javax.swing.*;

public class AnalisisDeDatos2 extends JFrame
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
	public int riesgoI;

	public AnalisisDeDatos2(int edad, String sexo, boolean diab, String taba, String ant, int dieta, int anios, boolean apnea, int sist, int dias, int colT, int tri, int hdl, int ldl)
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

		realizarAnalisis();
	} 

	public void realizarAnalisis()
	{
   	 	//Calculo del factor edad
		//Siendo la variable edad el % de incremento de riesgo, el rango de edad admitido es de 20 a 100 años.
		double facEdad = 0;
		if(sexo.equals("Hombre"))
	   	{ 
			facEdad = -(Math.pow((0.34 * edad), 2)) + (11.2 * edad) - 9.65;
	    }

		else if(sexo.equals("Mujer"))
		{
			facEdad = Math.pow((0.07 * edad), 4) - Math.pow((1.48 * edad), 3) + Math.pow((9.94 * edad), 2) - (17 * edad) + 8.15;
		}
		//System.out.println("Factor Edad: " +facEdad);

	  	//Calculo del factor: facCOL
		//Siendo FacCOL el % de incremento de riesgo y colTot el nivel de colesterol total en sangre en mg/dl.
		double facCOLI = 0;

	    if(sexo.equals("Hombre"))
	    { 
			facCOLI = (1.3124 * 200) + 11.848;
    	}

	    else if(sexo.equals("Mujer"))
	    {
	   		facCOLI = (1.1366 * 200) + 7.6455;
	   	}

		facCOLI = 0.7181 * Math.log(200 / 46);

	  	/*Calculo del factor:factTAB  
		Valores: Se considerará fumador a aquél que consuma más de tres cigarrillos diarios o al retirado del
		tabaco hace menos de un año (tabaco=1). Si se fuma solo fuma en puro o en pipa sin tragarse el humo el
		incremento es del 70% 17(tabaco=0,7). Al fumador pasivo de más de 8 horas diarias de exposición se le 
		cargará con un incremento del riesgo de un 30 % de el del fumador activo (tabaco=0,3). 
		En el resto de los casos se tomará un valor nulo en esta variable (tabaco=0).
		Para este caso solo usamos 1 o 0, segun corresponda*/
		double factT;
		double factTAB = 0;

		if(sexo.equals("Hombre"))
	   	{ 
	    	/*if(taba.equals ("Si"))
			{
				factT = (-37.76 * Math.log(0.7) + 91.55); 
				factTAB = 0.2767 * factT;
			}*/

			if(taba.equals("No"))
			{
				factT = (-37.76 * Math.log(0) + 91.55); 
				factTAB = + 13.25;
			}
			
			/*else if(taba.equals("Fumador Pasivo"))
			{
				factT = (-37.76 * Math.log(0.3) + 91.55); 
				factTAB = + 13.25;
			}*/
	    }

		if(sexo.equals("Mujer"))
		{
		    /*if(taba.equals("Si"))
			{
				factT = (-0.6596 * (Math.pow(0.7, 3)) + (11.883 * (Math.pow(0.7, 2))) - (67.758 * (0.7)) + 156.27); 
				factTAB = 0.2767 * factT;
			}*/

			if(taba.equals("No"))
			{
				factT = (-0.6596 * (Math.pow(0, 3)) + (11.883 * (Math.pow(0, 2))) - (67.758 * (0)) + 156.27); 
				factTAB = 0.2767 * factT;
			}

			/*else if(taba.equals("Fumador Pasivo"))
			{
				factT = (-0.6596 * (Math.pow(0.3, 3)) + (11.883*(Math.pow(0.3, 2))) - (67.758 * (0.3))+ 156.27); 
				factTAB = 0.2767 * factT;
			}*/
		}

		/*Calculo del factor Presior arterial sistolica: facSBP
		En general, se consideran hipertensos aquellos individuos con presión arterial superior a 159/94 mmHg 
		y normotensos aquellos con presiones inferiores a 140/90 mmHg.
		El riesgo se puede calcular utilizando la presión arterial sistólica (SBP) o diastólica (DBP). En este método se
		utiliza la tensión arterial sistólica para calcular el valor del término dependiente de los principales factores de riesgo*/
	    double facSBPI = 120;
	     
	    if(sexo.equals("Hombre"))
	    { 
			facSBPI = (1.365 * sist) + 13.25;
    	}

	    else if(sexo.equals("Mujer"))
	    {
	   		facSBPI = (1.2 * sist) + 8.69;
	   	}

		/*Calculo del factor: ECV (Enfermedad Cardio Vascular)
		FALTA INCLUIIR ESTE DATO EN EL CODIGO
		Valores: Esta variable puede tomar tres valores: 
		- 2, Si se ha sufrido anteriormente un infarto de miocardio definitivo con evidencia electrocardiográfica; 
		- 1, evidencia de enfermedad isquémica cercana al infarto definitivo o con diagnostico de angina de pecho; 
		- 0, el resto de los casos.
		Se incrementará un 25% en el caso de angina de pecho (antecedentes = 1) 
		o un 100 % en el caso de infarto de miocardio definitivo (antecedentes = 2)*/
		double factECV = 0; 

		if(ant.equals("IM"))
		{
		   factECV = 0;
		}
		
		else if(ant.equals("AP"))
	    {
	   		factECV = 0;
	   	}
	   	
	   	else if(ant.equals("No"))
	    {
	   		factECV = 0;
	   	}

		/*Calculo factor Dieta
		Dieta es un término que varía entre 0 y 1, por el momento y para proposito de esta practica queda en 1
		En este modelo  lambda se le atribuye un carácter de variable dependiente de la dieta, con unos valores que 
		abarcan un rango entre lamda = 11.1, en el peor de los casos, hasta lambda =11.5, para el caso de 
		dieta más favorable. Se obtiene a partir de la ecuación: lambda = 11.1 + Dieta x 0.4
		El factor dieta un término que varía entre 0 y 1*/
		double lambda = 4.6;
		lambda = 11.1 + ((dieta / 10) * 0.4);

		/*Ecuacion general para obtencionde "a"
		a = lambda - 0.9119 * log(SBP) - 0.2767 * tabaco - 0.7181 * log (Col. total /Col.HDL) - 0.5865 * facECV
		FactA = lambda - facSBP	- factTAB - facCOL - facHVI*/
		double a;
		a = lambda - (0.9119 * Math.log(facSBPI)) - factTAB - facCOLI;// - (0.5865 * factECV);
		//System.out.println("a: " +a);

		/*El siguiente paso es calcular el término dependiente de la edad, el sexo y la resistencia insulínica. 
		Se aplican diferentes fórmulas para hombres y mujeres*/
		double m = 0;

		if(sexo.equals("Hombre"))
	   	{ 	
	    	/*if(diab == true)
			{
				m = a - (1.4792 * Math.log(facEdad)) - ( 0.1759 * 1);
			}*/
		
			if(diab == false)
			{
				m = a - (1.4792 * Math.log(facEdad)) - ( 0.1759 * 0);
			}
	    }

	   	if(sexo.equals("Mujer"))
	    { 	
	    	double factEdadMujer = Math.log(facEdad / 74);

	    	/*if(diab == true)
			{
				m = a - 5.8549 + (1.8515 * (Math.pow(factEdadMujer, 2))) - (0.3758 * 1);
			}*/

			if(diab == false)
			{
				m = a - 5.8549 + (1.8515 * (Math.pow(factEdadMujer, 2))) - (0.3758 * 0);
			}
	    }

	    //A partir de aqui para los dos sexos
		double mu = 0;
		double ro = 0;

		mu = 4.4181 + m;
		ro = Math.exp(-0.3255 - (0.2784 * m));

		/*Se ha utilizado un modelo de regresión paramétrica multivariable para la estimación del riesgo.
		Donde T es el tiempo hasta la aparición del accidente cardiovascular, log es la función 
		"logaritmo natural o neperiano" y mu/ro dependen de los factores de riesgo*/	
		double r = 0;

		r = (Math.log(anios) - mu) / ro;
		//System.out.println("El valor de R es: " +r);

		//Calculo de la probabilidad de sufrir un accidente cardiovascular dentro de T años es
		double euler = 0;			
		double p = 0;
		double expon = 0;
			
		euler = Math.pow(Math.E, r);
		expon = Math.exp(-1 * euler);

	 	//Presentacion de resultados en porcentaje 		
	 	p = 100 * (1 - expon);
		//System.out.println("Porcentaje: " +p);
		//JOptionPane.showMessageDialog(null,"Porcentaje de riesgo: " +p);

		/*Calculo de la probabilidad Absoluta
		A partir de aquí, se incrementa esta probabilidad en el porcentaje correspondiente a la presencia de 
		antecedentes de enfermedad cardiovascular. Se incrementará un 25% en el caso de angina de pecho (antecedentes = 1) 
		o un 100 % en el caso de infarto de miocardio definitivo (antecedentes = 2). 
		En caso de que exista apnea del sueño se incrementa la probabilidad en un 10%
		Pabs = P x (1 + 0.25 x antecedentes^2 + 0.1 x apnea)*/
		double pAbsI = 0;
		double facECV = Math.pow(factECV, 2);

		if(apnea == true)
	   	{ 	
	    	pAbsI = p * (1 + (0.25 * facECV) + (0.1 * 0));
	    }

	   	else if(apnea == false)
	    { 	
	    	pAbsI = p * (1 + (0.25 * facECV) + (0.1 * 0));
	    }
	    System.out.println("Riesgo Ideal: " +String.format("%.2f", pAbsI));
	    //JOptionPane.showMessageDialog(null,"Riesgo Ideal: " +String.format("%.2f", pAbsI));
	}
}