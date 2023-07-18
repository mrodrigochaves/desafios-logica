package com.mrodrigochaves.TerceiroDesafio;

import java.util.Scanner;

public class ParesArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Tamanho do array
        int k = scanner.nextInt(); // Valor alvo

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Lê os elementos do array
        }

        
        int count = 0;
        for (int i = 0; i < n; i++) { 
            for (int j = i + 1; j < n; j++) { // Percorre o array a partir do elemento seguinte ao elemento atual

                //Math.abs retorna o valor absoluto
                if (Math.abs(arr[i] - arr[j]) == k) {
                    count++;
                }
            }
        }

        System.out.println(count);

        // Fecha o objeto Scanner
        scanner.close();
    }
}
