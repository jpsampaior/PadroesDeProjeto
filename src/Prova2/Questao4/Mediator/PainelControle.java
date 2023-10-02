package Prova2.Questao4.Mediator;

public class PainelControle {
    private String nome;
    private IMediator centralControle;

    public PainelControle(String nome, IMediator centralControle) {
        this.nome = nome;
        this.centralControle = centralControle;
        this.centralControle.registrarPainelControle(this);
    }

    public void ajustarTemperatura() {
        System.out.println(nome + " ajustando temperatura");
        centralControle.ajustarTemperatura(this);
    }

    public void ajustarIluminacao() {
        System.out.println(nome + " ajustando iluminacao");
        centralControle.ajustarIluminacao(this);
    }

    public void receberAjusteTemperatura() {
        System.out.println(nome + " recebendo ajuste de temperatura");
    }

    public void receberAjusteIluminacao() {
        System.out.println(nome + " recebendo ajuste de iluminacao");
    }
}
