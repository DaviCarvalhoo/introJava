package edu.davi.syntax;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void mudarCanal(int novoCanal){
        if(ligada == true){
            canal = novoCanal;
        }
    }
    public void aumentaVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void canais(){
        if(ligada == true){
            System.out.println("Canais disponiveis: 1, 2, 10, 12");
        }
    }
    
}
