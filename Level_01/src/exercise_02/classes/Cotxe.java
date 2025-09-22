package exercise_02.classes;

public class Cotxe {


    private final static String marca = "Mitsubishi";
    private static String model;
    private final int potencia;


    public Cotxe(int potencia)
    {
        Cotxe.model = "Colt";
        this.potencia = potencia;
    }

    public static String getMarca(){
        return Cotxe.marca;
    }
    public static String getModel(){
        return Cotxe.model;
    }
    public int  getPotencia(){
        return this.potencia;
    }
    public static void setModel(String model){
        Cotxe.model = model;
    }
    public static void frenar()
    {
        System.out.println("El vehicle està frenant");
    }

    public void accerelar()
    {
        System.out.println("El vehicle està accelerant");
    }
}
