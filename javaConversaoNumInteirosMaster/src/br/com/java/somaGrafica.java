package br.com.java;

import javax.swing.JOptionPane;

public class somaGrafica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor, resultado;
		int num1, num2;
		
		valor = JOptionPane.showInputDialog("Digite o primeiro valor inteiro");
		//Sem o trim ter� um erro na execu��o!
		//num1 = Integer.parseInt(valor);
		num1 = Integer.parseInt(valor.trim());
		
		valor = JOptionPane.showInputDialog("Digite o segundo valor inteiro");
		//num2 = Integer.parseInt(valor);
		num2 = Integer.parseInt(valor.trim());
		
		resultado = String.format("Resultado: %d", num1 + num2);
		JOptionPane.showMessageDialog(null, resultado);

	}

}
