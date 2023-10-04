package edu.davi.collections.list.Pesquisa;

public class Livro {
    private String titulo;
    public String getTitulo() {
        return titulo;
    }

    private String autor;
    public String getAutor() {
        return autor;
    }

    private int anoPublicacao;
    
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + "]";
    }

}
