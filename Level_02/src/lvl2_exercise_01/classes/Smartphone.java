package lvl2_exercise_01.classes;

public class Smartphone extends Telefon implements Camera, Rellotge{

	//CONSTRUCTOR

	public Smartphone(String marca, String model)
	{
		super(marca, model);
	}


	@Override
	public void alarma() {
		System.out.println("Està sonant l'alarma");
	}
	@Override
	public void fotografiar() {
		System.out.println("S'està fent una foto");
	}
}
