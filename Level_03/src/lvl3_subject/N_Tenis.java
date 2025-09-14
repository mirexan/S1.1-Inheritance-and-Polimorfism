package lvl3_subject;

public class N_Tenis extends Noticia implements Valor_Noticia{
	//ATTRIBUTES

	private String competicio;
	private String tenistas;

	//CONSTRUCTOR

	public N_Tenis(String titular, String competicio, String tenistas)
	{
		super(titular);
		this.competicio = competicio;
		this.tenistas = tenistas;
		super.setPreu(150);
		super.setPuntuacio(4);
	}
	//GETTER

	public String getCompeticio() {

		return this.competicio;
	}
	public String getTenistas() {

		return this.tenistas;
	}
	//SETTER

	public void setCompeticio(String competicio) {

		this.competicio = competicio;
	}
	public void setTenistas(String tenistas) {

		this.tenistas = tenistas;
	}
	//GENERAL METHODS
	public int calcularPreuNoticia(){
		int preu = super.getPreu();
		if (this.tenistas.equalsIgnoreCase("Federer") || this.tenistas.equalsIgnoreCase("Nadal")
				|| this.tenistas.equalsIgnoreCase("Djokovic")){
			preu += 100;
		}
		super.setPreu(preu);
		return preu;
	}

	public int calcularPuntsNoticia(){
		int punts = getPuntuacio();
		if (this.tenistas.equalsIgnoreCase("Federer") || this.tenistas.equalsIgnoreCase("Nadal")
				|| this.tenistas.equalsIgnoreCase("Djokovic")){
			punts += 1;
		}
		super.setPuntuacio(punts);
		return punts;
	}
}

