package com.mrodrigochaves.QuartoDesafio;

import java.util.Scanner;

public class DecifraString {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler os dados de entrada
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Quantidade de casos de teste
        scanner.nextLine(); // Limpar o buffer

        // Laço de repetição para percorrer os casos de teste
        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine();
            String linhaDecifrada = decifrarLinha(linha);
            System.out.println(linhaDecifrada);
        }

        // Fecha o objeto Scanner
        scanner.close();
    }

    // Método para decifrar uma linha
    private static String decifrarLinha(String linha) {
        int tamanho = linha.length();
        
        StringBuilder sb = new StringBuilder();

        // Laço de repetição para percorrer a primeira metade da linha
        for (int i = tamanho / 2 - 1; i >= 0; i--) {
            sb.append(linha.charAt(i));
        }

        // Laço de repetição para percorrer a segunda metade da linha
        for (int i = tamanho - 1; i >= tamanho / 2; i--) {
            sb.append(linha.charAt(i));
        }

        // Retorna a linha decifrada
        return sb.toString();
    }
}
