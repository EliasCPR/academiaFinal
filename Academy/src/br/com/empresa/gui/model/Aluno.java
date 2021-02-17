package br.com.empresa.gui.model;

import java.time.LocalDate;
import java.time.Period;

public class Aluno {
	private String nome;
	private char genero;
	private double peso;
	private double altura;
	private int idade;
	private LocalDate dataDeNascimento;
	private int nivelDeAtividade;
	
	
	public int getIdade(){
		LocalDate hoje = LocalDate.now();
		Period idadeAluno = Period.between(this.dataDeNascimento, hoje);
		return idadeAluno.getYears();
	}
	
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public void setNome (String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setGenero(char genero) {
		if (genero == 'm') {
			this.genero = 'm';
		}
		else {
			if (genero == 'f') {
				this.genero = 'f';
			}
		}
		
		this.genero = genero;
	}
	
	public char getGenero() {
		return this.genero;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura () {
		return this.altura;
	}
	
	public double getIMC() {
			return this.peso / Math.pow(this.altura, 2);
	}
	
	public String getStatusIMC() {
		if(getIMC() < 18.5) {
			return "Você esta muito abaixo do peso";
		}
		
		else if(getIMC() >= 18.6 && getIMC() <= 24.9){
			return "Você no peso ideal";
		}
		
		else if(getIMC() >= 25.0 && getIMC() <= 29.9) {
			return "Você está levemente acima do peso";
		}
		
		else if (getIMC() >= 30.0 && getIMC() <= 34.9) {
			return "Obesidade grau I";
		}
		
		else if (getIMC() >= 35.0 && getIMC() <= 39.9) {
			return "Obesidade grau II (severa)";
		}
		
		else if (getIMC() >= 40.0){
			return "Obesidade grau III(morbida)";
		}
		
		else {
			return "";
		}
	}
	
	public void setNivelDeAtividade(int NivelDeAtividade) {
//		para pessoas com nenhum nivel de atividade fisica
		if(NivelDeAtividade == 0) {
			this.nivelDeAtividade = NivelDeAtividade;
		}
//		para pessoas com nivel 1 de atividade
		else if(NivelDeAtividade == 1) {
			this.nivelDeAtividade = NivelDeAtividade;
		}
//		para pessoas com nivel 2 de atividade 
		else if(NivelDeAtividade == 2) {
			this.nivelDeAtividade = NivelDeAtividade;
		}
//		para pessoas com nivel 3 de atividade
		else if(NivelDeAtividade == 3) {
			this.nivelDeAtividade = NivelDeAtividade;
		}
		
	}
	
	public int getNivelAtividade() {
		return this.nivelDeAtividade;
	}
	
	public double getNCD() {
//		NCD para masculino
		
		if (this.genero == 'm') {
//  	atividade nenhuma
			if (this.nivelDeAtividade == 0) {
				if (getIdade() >= 18 && getIdade() <= 30) {
					return 15.3 *this.peso + 679;
				}
				else if (getIdade() >= 31 && getIdade() <= 60) {
					return 11.6 *this.peso + 879;
					
				}
				else if (getIdade() >= 60) {
					return 13.5 *this.peso + 487;
					
				}
				else {
					return 0;
				}
			}
//			nivel de atividade leve
			else if (this.nivelDeAtividade == 1) {
				if (getIdade() >= 18 && getIdade() <= 30) {
					return (15.3*this.peso + 679)*1.5;
					
				}
				else if (getIdade() >= 31 && getIdade() <= 60) {
					return (11.6*this.peso + 879)*1.5;
					
				}
				else if (getIdade() >= 60) {
					return (13.5*this.peso + 487)*1.5;
				}
				
				else {
					return  0;
				}
			}
//			nivel de atividade media
			else if (this.nivelDeAtividade == 2) {
				if (getIdade() >= 18 && getIdade() <= 30) {
					return (15.3*this.peso + 679)*1.8;
				}
				
				else if (getIdade() >= 31 && getIdade() <= 60) {
					return (11.6*this.peso + 879)*1.8;
				}
				
				else if (getIdade() >= 60) {
					return (13.5*this.peso + 487)*1.8;
				}
				
				else {
					return 0;
					}
				}
				
//				nivel de atividade intensa
				else if (this.nivelDeAtividade == 3) {
					if (getIdade() >= 18 && getIdade() <= 30) {
						return (15.3*this.peso + 679)*2.1;
					}
					else if (getIdade() >= 31 && getIdade() <= 60) {
						return (11.6*this.peso + 879)*2.1;
					}
					else if (getIdade() >= 60) {
						return (13.5*this.peso + 487)*2.1;
					}
					else {
						return 0;
					}
				}
				else {
					return 0;
				}
				
		}
//		NCD para feminino
		else if(this.genero == 'f'){
			
			if (this.nivelDeAtividade == 0) {
				
				if (getIdade() >= 18 && getIdade() <= 30) {
					return 14.7*this.peso + 496;
				}
				else if (getIdade() >= 31 && getIdade() <= 60) {
					return 8.7*this.peso + 829;
				}
				else if (getIdade() >= 60) {
					return 10.5*this.peso + 596;
// 					NIVEL DE ATIVIDADE LEVE    
				}
				else if (this.nivelDeAtividade == 1) {
					if (getIdade() >= 18 && getIdade() <= 30) {
						return (14.7*this.peso + 496)*1.6;
					}else if (getIdade() >= 31 && getIdade() <= 60) {
						return (8.7*this.peso + 829)*1.6;
					}else if (getIdade() >= 60) {
						return (10.5*this.peso + 596)*1.6;
						
//					 NIVEL DE ATIVIDADE MEDIA
					
					}else if (this.nivelDeAtividade == 2) {
						if (getIdade() >= 18 && getIdade() <= 30) {
							return (14.7*this.peso + 496)*1.6;
						}
						else if (getIdade() >= 31 && getIdade() <= 60) {
							return (8.7*this.peso + 829)*1.6;
						}
						else if (getIdade() >= 60) {
							return (10.5*this.peso + 596)*1.6;
// 						NIVEL DE ATIVIDADE INTENSA 
						}
						else if (this.nivelDeAtividade == 3) {
							if (getIdade() >= 18 && getIdade() <= 30) {
								return (14.7*this.peso + 496)*1.8;
							}
							else if (getIdade() >= 31 && getIdade() <= 60) {
								return (8.7*this.peso + 829)*1.8;
							}
							else if (getIdade() >= 60) {
								return (10.5*this.peso + 596)*1.8;
							}
							else {
								return 0;
							}
						}
						else {
							return 0;
						}
					}
					else {
						return 0;
					}
				}else {
					return 0;
				}
			}
			else {
				return 0;
			}
		}
		else {
			return 0;
		}
	}
	
}
		
		
	


