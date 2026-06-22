package principal;

import modelos.Musica;
import modelos.Podcast;
import servicos.Recomendador;

public class Principal {

    public static void main(String[] args) {

        // Criando música 1
        Musica musica1 = new Musica("Angeleyes", "ABBA", "Voulez-Vous", "Disco");

        for (int i = 0; i < 2899; i++) {
            musica1.reproduzir();
        }

        for (int i = 0; i < 565; i++) {
            musica1.curtir();
        }

        // Criando música 2
        Musica musica2 = new Musica("Breathe Deeper", "Tame Impala", "The Slow Rush", "Rock psicodélico");

        for (int i = 0; i < 4686; i++) {
            musica2.reproduzir();
        }

        for (int i = 0; i < 1580; i++) {
            musica2.curtir();
        }

        // Criando podcast 1
        Podcast podcast1 = new Podcast("Universo Geek", "Camila Torres", "Conversas sobre filmes, séries, jogos e cultura geek.");

        for (int i = 0; i < 145; i++) {
            podcast1.curtir();
        }

        for (int i = 0; i < 1589; i++) {
            podcast1.reproduzir();
        }

        // Criando podcast 2
        Podcast podcast2 = new Podcast("BolhaDev", "Marcus Mendes", "Podcast sobre desenvolvimento de software e tecnologia");

        for (int i = 0; i < 1196; i++) {
            podcast2.curtir();
        }

        for (int i = 0; i < 5890; i++) {
            podcast2.reproduzir();
        }

        Recomendador recomendador = new Recomendador();
        System.out.println("============= RECOMENDAÇÕES =============\n");
        recomendador.inclui(musica1);
        recomendador.inclui(musica2);
        recomendador.inclui(podcast1);
        recomendador.inclui(podcast2);
    }
}