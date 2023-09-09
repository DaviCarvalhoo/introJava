package edu.davi.repetition;

public class BreakContinue {
    public static void main(String[] args) {
	
        for(int numero = 1; ; numero ++){
            if(numero==3){
                System.out.println("Chegou no 3");
                continue;
            }
            if(numero > 10)
                break;
            System.out.println(numero);
            
        }
    }
}
