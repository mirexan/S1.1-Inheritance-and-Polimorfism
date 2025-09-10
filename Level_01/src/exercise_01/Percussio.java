package exercise_01;

public class Percussio extends Instrument{

    //STATIC BLOCK

    static{
        System.out.println("S'ha carregat l'instrument de percussió");
    }

    //CONSTRUCTOR

    public Percussio(String name, float price)
    {
        super(name, price);
    }
    // OWN METHODS

    public void tocar()
    {
        System.out.println("Està sonant un instrument de percussió");
    }
    // GENERAL METHOD
    public static void static_member()
    {
        System.out.println("Accès a membre estatic de instrument de vent");
    }
}

