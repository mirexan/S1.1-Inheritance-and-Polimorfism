package lvl3_subject;

public class N_Basquet extends Noticia implements Valor_Noticia{
	//ATRIBUTTES

	private String competicio;
	private String club;

	//CONSTRUCTOR

	public N_Basquet(String titular, String competicio, String club)
	{
		super(titular);
		this.competicio = competicio;
		this.club = club;
		super.setPreu(250);
		super.setPuntuacio(4);
	}
	//GETTER
	public String getCompeticio() {
		return this.competicio;
	}
	public String getClub() {
		return this.club;
	}
	//SETTER
	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}
	public void setClub(String club) {
		this.club = club;
	}
	//GENERAL METHODS
	public int calcularPreuNoticia(){
		int preu = super.getPreu();
		preu += this.competicio.equalsIgnoreCase("Eurolliga")?75:0;
		if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")){
			preu += 75;
		}
		super.setPreu(preu);
		return preu;
	}

	public int calcularPuntsNoticia(){
		int punts = getPuntuacio();
		punts += this.competicio.equalsIgnoreCase("Eurolliga")?3:0;
		punts += this.competicio.equalsIgnoreCase("ACB")?2:0;

		if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")){
			punts += 1;
		}
		super.setPuntuacio(punts);
		return punts;
	}
}
