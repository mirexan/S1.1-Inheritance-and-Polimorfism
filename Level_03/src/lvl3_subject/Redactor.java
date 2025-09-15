package lvl3_subject;

import java.util.ArrayList;

public class Redactor {
	//ATRIBUTTES

	private String nom;
	private final String dni;
	private static final int sou = 1500;
	private ArrayList<Noticia> noticies;

	//CONSTRUCTOR
	public Redactor(String nom, String dni)
	{
		this.nom = nom;
		this.dni = dni;
		this.noticies = new ArrayList<Noticia>();
	}
	//GETTER
	public String getNom(){
		return this.nom;
	}
	public String getDni(){
		return this.dni;
	}
	public int getSou(){
		return this.sou;
	}
	public ArrayList<Noticia> getNoticies(){
		return this.noticies;
	}
	//SETTER
	public void setNom(String nom){
		this.nom = nom;
	}
	public void setNoticies(Noticia noticia){
		this.noticies.add(noticia);
	}

	//OWN METHOD

	public String toString()
	{
		return "Redactor/a " + this.nom + " amb DNI " + this.dni + " i sou " + this.getSou() + "€";
	}
}
