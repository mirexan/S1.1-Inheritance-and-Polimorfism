package exercise_01;

import exercise_01.classes.Corda;
import exercise_01.classes.Percussio;
import exercise_01.classes.Vent;

public class Exercise_01_Main {
    public static void main(String[] args) {
    System.out.println("Instance vent object: ");
    Vent flauta = new Vent("Flauta travessera", 550f);
    System.out.println("Instance to corda object : ");
    Corda guitarra = new Corda("Ephiphone", 950f);
    System.out.println("Calling to a static member (in this case a method) of percussion class, loading message expected");
    Percussio.static_member();
    System.out.println("Instance to percussion object : ");
    Percussio bateria = new Percussio("Pearl", 1200f);
    System.out.println("using a method tocar in all objects:");
    flauta.tocar();
    guitarra.tocar();
    bateria.tocar();
    System.out.println("Calling to a static member (in this case a method) of corda class, no loading message expected");
    Corda.static_member();
    }
}
