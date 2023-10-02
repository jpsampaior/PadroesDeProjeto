package Prova2.Questao4.Strategy;

public class EscolhaAquecimento implements IEscolha{
    @Override
    public void minhaEscolha(String escolha) {
        System.out.println("Aquecimento escolhido, aumentando temperatura em: " + escolha + " graus.");
    }
}
