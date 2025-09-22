package exercise_01.classes;

public class Corda extends Instrument {

    static{
        System.out.println("Corda instrument has been loaded");
    }

    public Corda(String name, float price)
    {
        super(name, price);
    }

    @Override
	public void tocar()
    {
        System.out.println("Està sonant un instrument de corda");
    }

    public static void static_member()
    {
        System.out.println("Access to a static member of instrument de corda");
    }
}
