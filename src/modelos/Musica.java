package modelos;

public class Musica extends Audio {
    private String album;
    private String genero;

    public Musica(String titulo, String autor, String album, String genero) {
        super(titulo, autor);
        this.album = album;
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        int reproducoes = getTotalReproducoes();
        if (reproducoes >= 5000) return 10;
        if (reproducoes >= 3000) return 8;
        if (reproducoes >= 1000) return 6;
        return 4;
    }
}