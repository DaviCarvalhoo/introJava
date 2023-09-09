package edu.davi.exceptions;

public class ExampleCep {
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("7250907");
            System.out.println(cepFormatado);
        }
        catch(CepException e){
            System.out.println("O cep não corresponde com formato");
        }
    }
    static String formatarCep(String cep) throws CepException{
        if(cep.length() != 8)
          throw new CepException();       
          //simulando um cep formatado
          return "23.765-064";
    }
}
