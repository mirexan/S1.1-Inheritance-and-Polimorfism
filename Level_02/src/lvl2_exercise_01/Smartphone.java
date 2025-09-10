package lvl2_exercise_01;

public class Smartphone extends Telèfon implements Camera, Rellotge{

	//CONSTRUCTOR

	public Smartphone(String marca, String model)
	{
		super(marca, model);
	}
	//OWN METHOD

	public String toString()
	{
		return "Esto es un smartphone " + super.getMarca() + " model " + super.getModel();
	}
	// GENERAL METHODS

	public void alarma() {
		System.out.println("Està sonant l'alarma");
	}
	public void fotografiar() {
		System.out.println("S'està fent una foto");
	}
}
