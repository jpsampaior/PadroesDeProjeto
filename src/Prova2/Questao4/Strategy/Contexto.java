package Prova2.Questao4.Strategy;

public class Contexto {
    IEscolha Escolha;

    public void setEscolha(IEscolha escolha) {
        this.Escolha = escolha;
    }

    public void executarEscolha(String string1) {
        Escolha.minhaEscolha(string1);
    }
}
