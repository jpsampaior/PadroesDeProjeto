package Prova2.Questao4.Mediator;

public class Main {
    public static void main(String[] args) {
        IMediator centralControle = new CentralControle();

        PainelControle painelControle1 = new PainelControle("Painel 1", centralControle);
        PainelControle painelControle2 = new PainelControle("Painel 2", centralControle);

        painelControle1.ajustarTemperatura();

    }
}
