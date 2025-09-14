package lvl3_subject;

public class N_F1 extends Noticia implements Valor_Noticia{
	//ATRIBUTTES
	private String escuderia;
	//CONSTRUCTOR
	public N_F1(String titular, String escuderia)
	{
		super(titular);
		this.escuderia = escuderia;
		super.setPreu(100);
		super.setPuntuacio(4);
	}
	//GETTER
	public  String getEscuderia()
	{
		return this.escuderia;
	}
	//SETTER
	public void  setEscuderia(String escuderia)
	{
		this.escuderia = escuderia;
	}
	//GENERAL METHODS
	public int  calcularPreuNoticia()
	{
		int preu = super.getPreu();
		if (this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")){
			preu += 50;
		}
		super.setPreu(preu);
		return preu;
	}
	public int  calcularPuntsNoticia()
	{
		int punts = super.getPreu();
		if (this.escuderia.equalsIgnoreCase("Ferrari") || this.escuderia.equalsIgnoreCase("Mercedes")){
			punts += 2;
		}
		super.setPreu(punts);
		return punts;
	}
}
