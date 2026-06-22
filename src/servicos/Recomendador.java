package servicos;

import modelos.Audio;

public class Recomendador {

    public void inclui(Audio audio) {
        System.out.println(audio.getTitulo() + " (" + audio.getAutor() + ")");
        System.out.println(audio.getTotalReproducoes() + " reproduções | " + audio.getTotalCurtidas() + " curtidas");
        System.out.println(">> " + gerarMensagem(audio));
        System.out.println();
    }

    public String gerarMensagem(Audio audio){
        int classificacao = audio.getClassificacao();

        if (classificacao >= 10) {
            return "É sucesso absoluto e preferido da galera!";
        } else if (classificacao >= 8) {
            return "Está em alta, todo mundo está curtindo!";
        } else if (classificacao >= 6) {
            return "Está popular, vale a pena ouvir!";
        } else {
            return "Novidade interessante, confira!";
        }
    }
}