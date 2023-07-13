package com.mrodrigochaves.SegundoDesafio;

import java.util.Locale;
import java.util.Scanner;

public class ValorDescomposto {
    
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        double valor = scan.nextDouble();

        double[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1, 0.5, 0.25, 0.1, 0.05, 0.01};

        System.out.println("NOTAS:");
        for (double nota : notas) {
            int quantidade = (int) (valor / nota);
            valor %= nota;
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidade, nota);
        }

        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            int quantidade = (int) (valor / moeda);
            valor %= moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, moeda);
        }

        scan.close();
    }
}