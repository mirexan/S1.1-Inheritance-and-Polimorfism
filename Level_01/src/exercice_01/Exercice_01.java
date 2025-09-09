package exercice_01;

public class Exercice_01 {
    public static void main(String[] args) {
    System.out.println("Instancio objecte vent:");
    Vent Flauta = new Vent("Flauta travessera", 550f);
        System.out.println("Instancio objecte vent 2:");
    Vent Oboe = new Vent("Oboe", 750f);
    System.out.println("utilitzar metode:");
    Flauta.tocar();
    System.out.println("accedeixo a membre estàtic");
    Oboe.static_member();
    }
}
