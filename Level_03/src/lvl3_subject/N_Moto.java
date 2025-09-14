package lvl3_subject;

public class N_Moto extends Noticia implements Valor_Noticia {
	//ATTRIBUTES
	private String escuderia;

	//CONSTRUCTOR
	public N_Moto(String titular, String escuderia) {
		super(titular);
		this.escuderia = escuderia;
		super.setPreu(100);
		super.setPuntuacio(3);
	}
	//GETTER
	public String getEscuderia() {
		return this.escuderia;
	}
	//SETTER
	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}
	//GENERAL METHODS
	public int  calcularPreuNoticia()
	{
		int preu = super.getPreu();
		if (this.escuderia.equalsIgnoreCase("Honda") || this.escuderia.equalsIgnoreCase("Yamaha")){
			preu += 50;
		}
		super.setPreu(preu);
		return preu;
	}
	public int  calcularPuntsNoticia()
	{
		int punts = super.getPreu();
		if (this.escuderia.equalsIgnoreCase("Honda") || this.escuderia.equalsIgnoreCase("Yamaha")){
			punts += 3;
		}
		super.setPreu(punts);
		return punts;
	}
}