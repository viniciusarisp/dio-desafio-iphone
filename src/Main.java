public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();

        smartphone.selecionarMusica("505 - Arctic Monkeys");
        smartphone.tocar();
        smartphone.pausar();

        smartphone.ligar("(84) 98888-8888");
        smartphone.atender();
        smartphone.iniciarCorreioVoz();

        smartphone.exibirPagina("https://www.google.com/");
        smartphone.adicionarNovaAba();
        smartphone.atualizarPagina();
    }
}
