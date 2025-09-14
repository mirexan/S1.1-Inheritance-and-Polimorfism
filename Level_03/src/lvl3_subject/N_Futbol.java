package lvl3_subject;

public class N_Futbol extends Noticia implements Valor_Noticia{
	//ATRIBUTTES

	private String competicio;
	private String club;
	private String jugador;

	//CONSTRUCTOR

	public N_Futbol(String titular, String competicio, String club, String jugador)
	{
		super(titular);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
        super.setPreu(300);
        super.setPuntuacio(5);
	}
    //GETTER
    public String getCompeticio() {
        return this.competicio;
    }
    public String getClub() {
        return this.club;
    }
    public String getJugador() {
        return this.jugador;
    }
    //SETTER
    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }
    public void setClub(String club) {
        this.club = club;
    }
    public void setJugador(String jugador) {
        this.jugador = jugador;
    }
    //METHODS
    public int calcularPreuNoticia(){
        int preu = super.getPreu();
        preu += this.competicio.equalsIgnoreCase("Lliga de Campions")?100:0;
        if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")){
            preu += 100;
        }
        if (this.club.equalsIgnoreCase("Ferran Torres") || this.club.equalsIgnoreCase("Benzema")){
            preu += 50;
        }
        super.setPreu(preu);
        return preu;
    }

    public int calcularPuntsNoticia(){
        int punts = getPuntuacio();
        punts += this.competicio.equalsIgnoreCase("Lliga de Campions")?3:0;
        punts += this.competicio.equalsIgnoreCase("Lliga")?2:0;

        if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")){
            punts += 1;
        }
        if (this.club.equalsIgnoreCase("Ferran Torres") || this.club.equalsIgnoreCase("Benzema")){
            punts += 1;
        }
        super.setPuntuacio(punts);
        return punts;
    }
}
