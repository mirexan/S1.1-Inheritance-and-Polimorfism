package exercice_01;

public class Corda extends Instrument{

    //STATIC BLOCK

    static{
        System.out.println("S'ha carregat l'instrument de corda");
    }

    //CONSTRUCTOR

    public Corda(String name, float price)
    {
        super(name, price);
    }
    // OWN METHODS

    public void tocar()
    {
        System.out.println("Està sonant un instrument de corda");
    }
    // GENERAL METHOD
    public static void static_member()
    {
        System.out.println("Accès a membre estatic de instrument de vent");
    }
}
