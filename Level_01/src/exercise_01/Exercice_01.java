package exercise_01;

public class Exercice_01 {
    public static void main(String[] args) {
    System.out.println("Instancio objecte vent:");
    Vent flauta = new Vent("Flauta travessera", 550f);
        System.out.println("Instancio objecte vent 2:");
    Vent oboe = new Vent("Oboe", 750f);
    System.out.println("utilitzar metode:");
    flauta.tocar();
    System.out.println("accedeixo a membre estàtic");
    oboe.static_member();
    }
}
