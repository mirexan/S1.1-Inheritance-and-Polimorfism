package lvl2_exercise_01;

import lvl2_exercise_01.classes.Smartphone;

public class Lvl2_Exercise_01_Main {
	public static void main(String[] args) {
		Smartphone movil = new Smartphone("Xiaomi", "Redmi 14");
		movil.trucar("689345789");
		movil.alarma();
		movil.fotografiar();
	}
}
