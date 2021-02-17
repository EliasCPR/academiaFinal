package br.com.empresa.gui;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.time.Period;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.AncestorListener;

import br.com.empresa.gui.model.Aluno;


public class FrameEntradaGrafica {
	
//	caracteristica da JFrame
	
	Font titulo = new Font("Impact", Font.BOLD,30);
	Font subtitulo = new Font("Calibri Light", Font.BOLD,20);
	Color vermelho = new Color(252,19,3);
	
	public void criarTela() {
		
		Font titulo = new Font("Arial", Font.BOLD, 22);
		Color vermelho = new Color(255, 0, 0);

		// Janela do programa
		JFrame Jjanela = new JFrame();
		Jjanela.setTitle("Academia Fire in Fat");
		Jjanela.setSize(380, 600);
		Jjanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Jjanela.setLayout(null);
		
		Jjanela.setBackground(Color.BLACK);
		Jjanela.setBounds(0, 0, 380, 600);

		// Titulo do Programa
		JLabel Jtitulo = new JLabel();
		Jtitulo.setText("Academia Perfomance");
		Jtitulo.setFont(titulo);
		Jtitulo.setForeground(Color.BLACK);
		Jtitulo.setOpaque(true);
		Jtitulo.setBackground(vermelho);
		Jtitulo.setBounds(0, 0, 360, 50);
		Jtitulo.setHorizontalAlignment(SwingConstants.CENTER);

		// Informações do Cliente:
		// ********************Nome*****************************//
		JLabel Jnome = new JLabel();
		Jnome.setText("Nome: ");
		Jnome.setBounds(15, 80, 100, 20);

		JTextField textoNome = new JTextField();
		textoNome.setBounds(65, 80, 200, 20);

		// ***************Data de Nascimento************************//
		JLabel Jdata = new JLabel();
		Jdata.setText("Data de Nascimento: ");
		Jdata.setBounds(15, 120, 200, 20);

		JTextField textoData = new JTextField();
		textoData.setBounds(150, 120, 100, 20);

		// ***************Peso**************************************//
		JLabel Jpeso = new JLabel();
		Jpeso.setText("Peso: ");
		Jpeso.setBounds(15, 160, 200, 20);

		JTextField textoPeso = new JTextField();
		textoPeso.setBounds(65, 160, 50, 20);

		// ***************Altura************************************//
		JLabel Jaltura = new JLabel();
		Jaltura.setText("Altura: ");
		Jaltura.setBounds(15, 200, 200, 20);

		JTextField textoAltura = new JTextField();
		textoAltura.setBounds(65, 200, 50, 20);

		// ***************Sexo**************************************//
		JLabel Jsexo = new JLabel();
		Jsexo.setText("Sexo: ");
		Jsexo.setBounds(15, 240, 200, 20);
		ButtonGroup groupSexo = new ButtonGroup();
		JRadioButton radioFeminino = new JRadioButton();
		groupSexo.add(radioFeminino);
		JRadioButton radioMasculino = new JRadioButton();
		groupSexo.add(radioMasculino);
		radioFeminino.setBounds(65, 240, 80, 20);
		radioFeminino.setText("Feminino");
		radioMasculino.setBounds(150, 240, 90, 20);
		radioMasculino.setText("Masculino");

		// ***************Nivel de Atividade**************************************//
		JLabel Jatividade = new JLabel();
		Jatividade.setText("Nivel De Atividade ");
		Jatividade.setBounds(15, 280, 200, 20);

		String nivelDeAtividade[] = { "Nenhum", "Leve", "Moderado", "Intenso" };
		JComboBox<String> lista = new JComboBox<String>(nivelDeAtividade);
		lista.setBounds(130, 280, 130, 20);

		
		// Calcula os Dados
		JButton Jcalcular = new JButton();
		Jcalcular.setText("CALCULAR");
		Jcalcular.setBounds(50, 320, 100, 35);

		// Limpa os Dados
		JButton jlimpa = new JButton();
		jlimpa.setText("LIMPAR");
		jlimpa.setBounds(155, 320, 100, 35);
		
		
		//IMC
		JLabel jimc = new JLabel();
		jimc.setText("IMC: ");
		jimc.setBounds(15, 380, 530, 20);
		
		//NCD
		JLabel Jncd = new JLabel();
		Jncd.setText("NCD: ");
		Jncd.setBounds(15, 420, 130, 20);

		Jjanela.getContentPane().add(Jtitulo);
		Jjanela.getContentPane().add(Jnome);
		Jjanela.getContentPane().add(textoNome);
		Jjanela.getContentPane().add(Jdata);
		Jjanela.getContentPane().add(textoData);
		Jjanela.getContentPane().add(Jpeso);
		Jjanela.getContentPane().add(textoPeso);
		Jjanela.getContentPane().add(Jaltura);
		Jjanela.getContentPane().add(textoAltura);
		Jjanela.getContentPane().add(Jsexo);
		Jjanela.getContentPane().add(radioFeminino);
		Jjanela.getContentPane().add(radioMasculino);
		Jjanela.getContentPane().add(lista);
		Jjanela.getContentPane().add(Jatividade);
		Jjanela.getContentPane().add(Jcalcular);
		Jjanela.getContentPane().add(jlimpa);
		Jjanela.getContentPane().add(jimc);
		Jjanela.getContentPane().add(Jncd);
		
		Jjanela.setVisible(true);
		
//		botao calcular
		Jcalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Aluno a1 = new Aluno();
				a1.setDataDeNascimento(LocalDate.of(2003, 02, 6));
//				DecimalFormat formato = new DecimalFormat("00.0");
				
				a1.setNome(textoNome.getText());
				a1.setDataDeNascimento(LocalDate.of(2000, 07, 03));
				a1.setNivelDeAtividade(lista.getSelectedIndex());
				a1.setGenero(radioFeminino.isSelected()?'m':'f');
				a1.setAltura(Double.parseDouble(textoAltura.getText()));
				a1.setPeso(Double.parseDouble(textoPeso.getText()));
				
				
				jimc.setText("IMC:  " + String.valueOf(a1.getStatusIMC()));
				Jncd.setText("NCD:  " + a1.getIdade() + String.valueOf(a1.getNCD()));
			}
		});
		
		// Limpa
				jlimpa.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						jimc.setText("IMC:  ");
						Jncd.setText("NCD:  ");
						textoAltura.setText("");
						textoData.setText("");
						textoNome.setText("");
						textoPeso.setText("");
					}
				});
		
	}

}

