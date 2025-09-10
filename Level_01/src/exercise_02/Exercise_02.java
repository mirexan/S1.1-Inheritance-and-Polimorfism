package exercise_02;

public class Exercise_02 {
    public static void main(String[] args) {

        Cotxe monovolumen = new Cotxe(135);
        System.out.println("Invoco static method: ");
        monovolumen.frenar();
        System.out.println("Invoco non static method: ");
        monovolumen.accerelar();
    }
}
