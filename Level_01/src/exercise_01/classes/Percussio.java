package exercise_01.classes;

public class Percussio extends Instrument {

    static{
        System.out.println("Percussió instrument has been loaded");
    }

    public Percussio(String name, float price)
    {
        super(name, price);
    }

    @Override
	public void tocar()
    {
        System.out.println("Està sonant un instrument de percussió");
    }

    public static void static_member()
    {
        System.out.println("Access to a static member of instrument de percussió");
    }
}

