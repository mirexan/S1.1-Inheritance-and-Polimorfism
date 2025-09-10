package exercise_01;

public abstract class Instrument {

    //ATRIBUTES
    private String name;
    private float price;


    //CONSTRUCTOR
    public Instrument(String name, float price)
    {
        this.name = name;
        this.price = price;
    }

    //GETTER
    public String getName()
    {
        return this.name;
    }

    public float getPrice()
    {
        return this.price;
    }
    //SETTER

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }
    //OWN METHOD
    public abstract void tocar();


}
