package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Studant;

public class ProgramStudant {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
        Studant student1;
		
		student1 = new Studant();
		
		student1.name = sc.nextLine();
		student1.nota1 = sc.nextDouble();
		student1.nota2 = sc.nextDouble();
		student1.nota3 = sc.nextDouble();
		
		System.out.println("Resultado:");
		double media = student1.notaFinal() - 60.00;
		if (student1.notaFinal() >= 60.00) {
			System.out.println("NOTA FINAL = %.2f" + student1.notaFinal() + "\nPASS"); 
		}
		else {
			System.out.println("NOTA FINAL = " + student1.notaFinal() + "\nFAILED \nFALTARAM " + Math.abs(media) +  " PONTOS");
			
		}
		
		
		
		sc.close();

	}

}
