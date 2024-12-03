package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Studant;

public class ProgramStudant {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
        Studant student1,student2;
		
		student1 = new Studant();
		student2 = new Studant();
		
		student1.name = sc.nextLine();
		student1.nota1 = sc.nextDouble();
		student1.nota2 = sc.nextDouble();
		student1.nota3 = sc.nextDouble();
		
		student2.name = sc.nextLine();
		student2.nota1 = sc.nextDouble();
		student2.nota2 = sc.nextDouble();
		student2.nota3 = sc.nextDouble();
		
		
		System.out.println(student1);
		
		
		sc.close();

	}

}
