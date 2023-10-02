package Prova2.Questao1.Strategy;

public class EscolhaDefesa implements IEscolha{
    @Override
    public void minhaEscolha(String string) {
        switch (string) {
            case "1":
                string = "Escudo";
                break;
            case "2":
                string = "Armadura";
                break;
            case "3":
                string = "Elmo";
                break;
        }
        System.out.println("Defendendo com " + string);
    }
}
