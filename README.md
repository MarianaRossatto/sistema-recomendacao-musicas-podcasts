## 🎵 Sistema de recomendação de músicas e podcasts

### ▸ Sobre

Desafio final proposto no curso "Java: aplicando a Orientação a Objetos" da Alura. O projeto consiste em um sistema simples de recomendação de músicas e podcasts, utilizando conceitos de orientação a objetos em Java.

### ▸ Funcionalidades

- Cadastro de músicas e podcasts
- Registro de reproduções e curtidas
- Classificação dos áudios
- Recomendação de conteúdos conforme a classificação

### ▸ Conceitos de orientação a objetos aplicados

- Classes e objetos
- Abstração
- Herança
- Encapsulamento
- Polimorfismo
- Sobrescrita de métodos

### ▸ Estrutura do projeto

- `src/modelos/`
  - `Audio.java` - Superclasse base que representa um conteúdo de áudio com título, autor, reprodução, curtidas e classificação
  - `Musica.java` - Subclasse que estende `Audio` e adiciona informações de álbum e gênero
  - `Podcast.java` - Subclasse que estende `Audio` e adiciona descrição do episódio
- `src/servicos/`
  - `Recomendador.java` - Classe responsável por gerar recomendações com base na classificação dos áudios
- `src/principal/`
  - `Principal.java` - Classe principal com exemplos de criação de músicas e podcasts, reprodução, curtidas e exibição de recomendações
