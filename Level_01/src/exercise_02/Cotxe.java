package exercise_02;

public class Cotxe {

    //ATTRIBUTES

    private final static String marca = "Mitsubishi";
    private static String model;
    private final int potencia;

    //CONSTRUCTOR

    public Cotxe(int potencia)
    {
        this.model = "Colt";
        this.potencia = potencia;
    }

    //METHODS

    public static void frenar()
    {
        System.out.println("El vehicle està frenant");
    }

    public void accerelar()
    {
        System.out.println("El vehicle està accelerant");
    }
}
