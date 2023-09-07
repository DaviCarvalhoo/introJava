package edu.davi.exercise;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int conta = 0;
            String ag = "067-8";
            double saldo = 0;
            String nome = "";

            System.out.println("Por favor, digite o número da Agência !");
            conta = scan.nextInt();

            System.out.println("Por favor, digite seu nome!");
            nome = scan.next();
            nome = nome.toUpperCase();

            System.out.println("Por favor, digite o valor para o seu saldo!");
            saldo = scan.nextDouble();

            System.out.println("Olá "+ nome + " obrigado por criar uma conta em nosso banco, sua agência é " + ag + ", conta "+ conta +" e seu saldo "+ saldo +" já está disponível para saque");
        }

    }
}
