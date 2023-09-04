package edu.davi.syntax;

public class Condition {
    public static void main(String[] args) {
        boolean conditionUm = true;
        boolean conditionDois = false;
        if(conditionUm && conditionDois){
            System.out.println("As duas são Verdadeiras");
        }
        if(conditionUm || conditionDois){
            System.out.println("Uma das duas são verdadeira");
        }
    }
}
