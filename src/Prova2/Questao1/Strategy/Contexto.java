package Prova2.Questao1.Strategy;

public class Contexto {
    IEscolha escolha;

    public void setEscolha(IEscolha escolha) {
        this.escolha = escolha;
    }

    public void executarEscolha(String string) {
        escolha.minhaEscolha(string);
    }
}
