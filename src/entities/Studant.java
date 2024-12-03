package entities;

public class Studant {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String aviso() {
		String aviso;
		double media;
		media = notaFinal() - 60.00;
		
		if (notaFinal() >= 60.00) {
			aviso =  "\nNOME DO ESTUDANTE: %s%n" + this.name + "NOTA FINAL = %.2f" + notaFinal() + "\nPASS";
		}
		else {
			aviso = "\nNOME DO ESTUDANTE: %s%n" + this.name + "NOTA FINAL = " + notaFinal() + "\nFAILED \nFALTARAM " + Math.abs(media) +  " PONTOS";
			
		}
		
		return aviso;
		
		}
	
	public String toString() {
		return aviso();
	}

}
