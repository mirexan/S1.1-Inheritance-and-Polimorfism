package lvl3_subject;

import java.util.ArrayList;
import java.util.Scanner;

public class Lvl3_Exercise_01 {
	public static void main(String[] args) {
		int	opcio = -1;
		Scanner sc = new Scanner(System.in);
		ArrayList<Redactor> redactors = new ArrayList<Redactor>();
		String resposta = "";
		String nom = "";
		String dni = "";
		int	idRedactor = -1;
		do{
			System.out.println("Sisplau indiqui el número de l'opció que dessitgi realitzar: \n\n" +
					"\t\t******Menú del aplicatiu******\n\n" +
					"1.-Introduir redactor.\n" +
					"2.-Eliminar redactor.\n" +
					"3.-Introduir notícia a un redactor.\n" +
					"4.-Eliminar notícia.\n" +
					"5.-Mostrar totes les noticies per redactor.\n" +
					"6.-Calcular puntuació de la notícia.\n" +
					"7.-Calcura preu-notícia.\n" +
					"0.-Sortir del aplicatiu.\n");
			opcio = sc.nextInt();
			switch(opcio){
				case 1:
					System.out.println("Sisplau indiqui a continuació el nom del redactor");
					nom = sc.nextLine();
					System.out.println("Sisplau indiqui a continuació el dni del redactor");
					dni = sc.next();
					Redactor redactor = new Redactor(nom,dni);
					redactors.add(redactor);
					resposta = "S'ha afegit " + redactor.toString();
					break;
				case 2:
					System.out.println("Sisplau indiqui a continuació el nom del redactor a eliminar");
					nom = sc.nextLine();
					System.out.println("Sisplau indiqui a continuació el dni del redactor");
					dni = sc.next();
					idRedactor = buscarRedactor(nom,dni,redactors);
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				default:
					resposta = "Sortint de l'aplicació.";
					break;
			}
			System.out.println(resposta);
		}while (opcio == 0);
		sc.close();
	}
	public static int buscarRedactor(String nom, String dni, ArrayList<Redactor> redactors) {
		int idRedactor = -1;
		int i = 0;
		while (i < redactors.size() && idRedactor == -1) {

		}
		return idRedactor;
	}
}
