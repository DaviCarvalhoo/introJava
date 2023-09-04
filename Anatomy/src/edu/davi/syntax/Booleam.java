package edu.davi.syntax;

public class Booleam {
    public static void main(String[] args) {
        String nomeUm = "Davi";
        String nomeDois = new String("Davi");
        System.out.println("Os dois nome são iguais? "+ nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numero1 é igual a numero2? "+ simNao);

        simNao = numero1 != numero2;
        System.out.println("numero1 e difiernte de numero2? "+ simNao);

        simNao = numero1 > numero2;
        System.out.println("O numero1 e maior que o numero2? "+simNao);

        if(numero1 < numero2){System.out.println("O numero1 e menor que "+numero2);}
    }
}
