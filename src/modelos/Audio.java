package modelos;

public class Audio {
    private String titulo;
    private String autor;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;
    
    public Audio(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao(){
        return classificacao;
    }

    public void curtir(){
        this.totalCurtidas ++;
    }
    
    public void reproduzir(){
        this.totalReproducoes ++;
    }
}