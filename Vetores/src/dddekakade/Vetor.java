package dddekakade;

import javax.print.attribute.standard.Media;

public class Vetor {

	public static void main(String[] args) {
		
		double notas[] = {8.5,9.3,7.2,10.0};
		
		double media = (notas[0] + notas[1] + notas[2] + notas[3])/4;
		
		System.out.println("Média = " + media(notas));
		
		media = (notas[0] + notas[1] + notas[2] + notas[3])/4;
		
		
		double idades[] = {
				46,17,17,16,
				17,17,17,16,
				17,22,17,19,
				16,16,17,16,
				16};
		
		int totalIdades = 0;
		
		media(idades);
		
		System.out.println("Média das idades = " + media(idades));
		
		
		
	}
	
	private static double media(double vetor []) {
		double soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		return soma/vetor.length;
	}

}
