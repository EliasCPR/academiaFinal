package br.com.empresa;


import java.time.LocalDate;

import br.com.empresa.gui.FrameEntradaGrafica;
import br.com.empresa.gui.model.Aluno;

public class App {
	
	
	public static void main(String[] args) {
		
		FrameEntradaGrafica tela = new FrameEntradaGrafica();
		tela.criarTela();
		
		Aluno pessoa = new Aluno();
		pessoa.setNome("Elias");
		pessoa.setDataDeNascimento(LocalDate.of(2003, 2, 6));
		pessoa.setGenero('m');
		pessoa.setAltura(1.87);
		pessoa.setPeso(112.0);
		pessoa.setNivelDeAtividade(1);
		System.out.println("Seu IMC é de:" + pessoa.getIMC());
		System.out.println("Seu NCD é de :" + pessoa.getNCD());
	}
}
