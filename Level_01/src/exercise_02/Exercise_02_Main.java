package exercise_02;

import exercise_02.classes.Cotxe;

public class Exercise_02_Main {
    public static void main(String[] args) {

        Cotxe monovolumen = new Cotxe(135);
        System.out.println("Calling for all the attributes\n" +
               "marca as a final static : " + Cotxe.getMarca() + "\n" +
                "model, as a static : " + Cotxe.getModel() + "\n" +
                "potencia as a final : " + monovolumen.getPotencia() + ".\n\n" +
                "As model is a non final attribute, it can be changed");
        Cotxe.setModel("cult");
        System.out.println("Now model is : " + Cotxe.getModel());
        System.out.println("Call to frenar() as a static method: ");
        Cotxe.frenar();
        System.out.println("Call to accelerar as a non static method: ");
        monovolumen.accerelar();
    }
}
