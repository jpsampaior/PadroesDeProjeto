package Prova2.Questao4.Strategy;

public class EscolhaResfriamento implements IEscolha{
    @Override
    public void minhaEscolha(String escolha) {
        System.out.println("Resfriamento escolhido, diminuindo temperatura em: " + escolha + " graus.");
    }
}
