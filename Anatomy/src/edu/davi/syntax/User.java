package edu.davi.syntax;

public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentaVolume();

        System.out.println("A Tv está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal: " + smartTv.canal);
        System.out.println("Qual o volume: " + smartTv.volume);
        
        smartTv.canais();
        smartTv.mudarCanal(12);
        System.out.println("Canal Atual ->: " + smartTv.canal);

    }
}
