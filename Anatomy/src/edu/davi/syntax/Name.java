package edu.davi.syntax;
public class Name {
public static void main(String[] args){
    String nome = "Davi";
    String sobrenome = "Carvalho";
    String nameComplet = nomeCompleto(nome, sobrenome);
    System.out.println(nameComplet);
}
public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "O nome completo é: " + primeiroNome.concat(" ").concat(segundoNome);
}
}
