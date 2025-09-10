package lvl2_exercise_01;

public class Telèfon {

	//ATRIBUTTES

	private String marca;
	private String model;

	//CONSTRUCTOR

	public	Telèfon(String marca, String model)
	{
		this.marca = marca;
		this.model = model;
	}

	//GETTER

	public String	getMarca()
	{
		return this.marca;
	}

	public String	getModel()
	{
		return this.model;
	}
	//SETTER

	public void setMarca(String marca)
	{
		this.marca = marca;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	// OWN METHOD
	public String toString()
	{
		return "El telèfon és de la marca " + this.marca + " i model "
				+ this.model;
	}

	//GENERAL METHODS

	public void	trucar(String numero)
	{
		System.out.println("S'està trucant al número: " + numero);
	}
}
