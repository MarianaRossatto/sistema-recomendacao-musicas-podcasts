package modelos;

public class Podcast extends Audio {
    private String descricao;

    public Podcast(String titulo, String autor, String descricao) {
        super(titulo, autor);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        int curtidas = getTotalCurtidas();
        if (curtidas > 1000) return 10;
        if (curtidas > 500)  return 8;
        if (curtidas > 200)  return 6;
        return 4;
    }
}

