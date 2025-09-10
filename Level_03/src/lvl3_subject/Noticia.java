package lvl3_subject;

public class Noticia {
	//ATRIBUTTES

	private String titular;
	private String text;
	private int puntuacio;
	private int preu;

	//CONSTRUCTOR

	public Noticia(String titular)
	{
		this.titular = titular;
		this.text = "";
		this.puntuacio = 0;
		this.preu = 0;
	}

	//GETTER
	public String getTitular()
	{
		return this.titular;
	}
	public String getText()
	{
		return this.text;
	}
	public int getPuntuacio()
	{
		return this.puntuacio;
	}
	public int getPreu()
	{
		return this.preu;
	}
	//SETTER
	public void setTitular(String titular)
	{
		this.titular = titular;
	}
	public void setText(String text)
	{
		this.text = text;
	}
	public void setPuntuacio(int puntuacio)
	{
		this.puntuacio = puntuacio;
	}
	public void setPreu(int preu)
	{
		this.preu = preu;
	}

}
