package lvl3_subject;

public class N_Futbol extends Noticia{
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
	}
}
