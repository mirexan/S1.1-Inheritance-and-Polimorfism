package exercise_01.classes;

public abstract class Instrument {

    private String name;
    private float price;

    public Instrument(String name, float price)
    {
        this.name = name;
        this.price = price;
    }

    public abstract void tocar();


}
