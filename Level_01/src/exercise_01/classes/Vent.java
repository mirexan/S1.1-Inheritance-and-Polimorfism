package exercise_01.classes;

public class Vent extends Instrument {

    static{
        System.out.println("Vent instrument has been loaded");
    }

    public Vent(String name, float price)
    {
        super(name, price);
    }

    @Override
	public void tocar()
    {
        System.out.println("Està sonant un instrument de vent");
    }

    public static void static_member()
    {
        System.out.println("Access to vent a static member of instrument de vent");
    }
}
