package edu.davi.escola;

public class Escola {
    public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe");
		felipe.setIdade(8);

		felipe.setSexo("Masc");
		
		System.out.println("O aluno " + felipe.getNome() + felipe.getSexo()+ " tem " + felipe.getIdade() + " anos ");	
	}
}
