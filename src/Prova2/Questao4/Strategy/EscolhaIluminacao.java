package Prova2.Questao4.Strategy;

public class EscolhaIluminacao implements IEscolha{
    @Override
    public void minhaEscolha(String escolha) {
        switch (escolha) {
            case "1":
                escolha = "Ligado";
                break;
            case "2":
                escolha = "Desligado";
                break;
        }
        System.out.println("Iluminação escolhida, mudando estado de luzes para: " + escolha + ".");
    }
}
