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
		
		
		System.out.println(student1);
		
		
		sc.close();

	}

}
