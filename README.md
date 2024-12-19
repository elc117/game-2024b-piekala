# Clicker Game

Este é um simples jogo de *clicker* desenvolvido com o LibGDX. O objetivo do jogo é clicar em um botão, e a cada clique o contador aumenta. O jogo exibe uma imagem de fundo e um botão centralizado. Um som é reproduzido a cada clique bem-sucedido.

## Funcionalidades

- **Contagem de cliques**: O número de cliques é exibido no canto superior esquerdo da tela.
- **Som**: A cada clique no botão, um som de sucesso é reproduzido.
- **Imagem de fundo**: A tela é exibida com uma imagem de fundo ("forest.jpg").
- **Botão centralizado**: Um botão (imagem "dinosaur.png") é exibido no centro da tela e pode ser clicado.
- **Respostas rápidas**: O jogo responde instantaneamente aos cliques do usuário.

## Pré-requisitos

Antes de rodar o jogo, é necessário ter o [LibGDX](https://libgdx.badlogicgames.com/) configurado no seu projeto.

## Como Rodar

1. Clone o repositório para sua máquina local:
    ```bash
    git clone https://github.com/elc117/game-2024b-piekala.git
    ```

2. Abra o projeto em sua IDE favorita (por exemplo, IntelliJ IDEA ou Eclipse).

3. Certifique-se de ter o LibGDX configurado corretamente em seu projeto.

4. Execute o aplicativo. O jogo será iniciado com a tela inicial exibindo o botão e a contagem de cliques.

4. 1. ./gradlew html:dist

4. 2. cd .\html\build\dist

4. 3. python -m http.server

## Estrutura do Projeto

### `FirstScreen.java`
A classe que representa a tela inicial do jogo. Esta tela exibe o fundo, o botão e o contador de cliques. Também lida com o evento de clique e reproduz o som associado.

#### Funções principais:
- `show()`: Carrega os recursos do jogo (imagem de fundo, botão e som).
- `render()`: Atualiza a tela a cada quadro.
- `dispose()`: Libera os recursos carregados, como as imagens e o som.
- `ClickListener`: Detecta os cliques no botão e aumenta o contador.

### Arquivos de Recursos

- **forest.jpg**: Imagem de fundo.
- **dinosaur.png**: Imagem do botão.
- **success.mp3**: Som de sucesso para cada clique.

## Licença

Este jogo utilizou Assets de sites opensource, em caso de problemas de direitos, solicite um commit para o proprietário.