package lvl3_subject;

public class N_Basquet extends Noticia{
	//ATRIBUTTES

	private String competicio;
	private String club;

	//CONSTRUCTOR

	public N_Basquet(String titular, String competicio, String club)
	{
		super(titular);
		this.competicio = competicio;
		this.club = club;
	}
}
