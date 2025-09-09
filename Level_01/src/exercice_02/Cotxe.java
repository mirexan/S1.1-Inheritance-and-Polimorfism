package exercice_02;

public class Cotxe {

    //ATRIBUTES

    private final static String marca = "Mitsubishi";
    private static String model;
    private final int potencia;

    /* ·static: label means that this variable belongs to Cotxe class, not just
    *   the object to instance. There's only one space in the memory who is gone to be
    *   shared with all Cotxes instances.
    * ·final: means the variable it's a constant, once assigned it can't be modified.
    * So, marca it´s gonna be initialized in atributes directly because its static and final, so it
    * cannot be modified in every instance.
    * model can be assigned in constructor.*/
    //CONSTRUCTOR

    public Cotxe(int potencia)
    {
        this.model = "Colt";
        this.potencia = potencia;
    }
}
