```mermaid
classDiagram
    class ReprodutorMusical {
        + tocar()
        + pausar()
        + selecionarMusica(musica: String)
    }

    class AparelhoTelefonico {
        + ligar(numero: String)
        + atender()
        + iniciarCorreioVoz()
    }

    class NavegadorInternet {
        + exibirPagina(url: String)
        + adicionarNovaAba()
        + atualizarPagina()
    }

    class Smartphone {
        - ReprodutorMusical
        - AparelhoTelefonico
        - NavegadorInternet
    }

    Smartphone --> ReprodutorMusical
    Smartphone --> AparelhoTelefonico
    Smartphone --> NavegadorInternet
