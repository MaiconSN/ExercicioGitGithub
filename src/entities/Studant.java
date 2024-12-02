package entities;

public class Studant {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String toString() {
		double media;
		media = notaFinal() - 60.00;
		
		if (notaFinal() >= 60.00) {
			return "NOTA FINAL = %.2f" + notaFinal() + "\nPASS";
		}
		else {
			return "NOTA FINAL = " + notaFinal() + "\nFAILED \nFALTARAM " + Math.abs(media) +  " PONTOS";
			
		}
		
		}

}
