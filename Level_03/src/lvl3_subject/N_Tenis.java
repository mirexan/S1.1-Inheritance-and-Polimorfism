package lvl3_subject;

public class N_Tenis extends Noticia{
	//ATRIBUTTES

	private String competicio;
	private String tenistas;

	//CONSTRUCTOR

	public N_Tenis(String titular, String competicio, String tenistas)
	{
		super(titular);
		this.competicio = competicio;
		this.tenistas = tenistas;
	}
}

