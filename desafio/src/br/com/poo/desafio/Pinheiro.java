package br.com.poo.desafio;

public class Pinheiro {

	public static void main(String[] args) {
		String j = "*";

		for (int i = 1; i <= 20; i++) {

			System.out.println(j);
			j += "*";
		}

		int tamanho = 6;
		double[] arrayDouble;
		arrayDouble = new double[tamanho];

		for (int i = 0; i < tamanho; i++) {
			arrayDouble[i] = i * tamanho;
		}

		for (int i = 0; i < arrayDouble.length; i++) {
			System.out.println("|");

		}

	}

}
