package Prova1.Questao2;

public class Main {
    public static void main(String[] args) {
        Mensagem mensagem = MensagemFactory.getPlataform("SMS");
        mensagem.enviarMensagem();
    }
}
