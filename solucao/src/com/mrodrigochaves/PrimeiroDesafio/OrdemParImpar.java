package com.mrodrigochaves.PrimeiroDesafio;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdemParImpar {
    
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler os dados de entrada
        Scanner scan = new Scanner(System.in);

        // Lê a quantidade de números que serão lidos
        int numeros = scan.nextInt();

        // Cria uma lista para armazenar os números pares e outra para os ímpares
        List<Integer> pares = new ArrayList<Integer>();
        List<Integer> impares = new ArrayList<Integer>();

        // Lê os números e os adiciona na lista correta
        for (int i = 0; i < numeros; i++) {
            int n = scan.nextInt();
            if (n % 2 == 0) {
                pares.add(n);
            } else {
                impares.add(n);
            }
        }

        // Ordena as listas
        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());
        
        // Imprime os números pares e ímpares
        for (int par : pares) {
            System.out.println(par + " este é par");
        }
        for (int impar : impares) {
            System.out.println(impar +" este é impar");
        }

        // Fecha o objeto Scanner
        scan.close();
    }

}
