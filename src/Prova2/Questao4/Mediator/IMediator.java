package Prova2.Questao4.Mediator;

public interface IMediator {
    void registrarPainelControle(PainelControle painelControle);
    void ajustarTemperatura(PainelControle painelControle);
    void ajustarIluminacao(PainelControle painelControle);
}
