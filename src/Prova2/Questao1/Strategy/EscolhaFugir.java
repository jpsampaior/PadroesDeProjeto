package Prova2.Questao1.Strategy;

public class EscolhaFugir implements IEscolha{
    @Override
    public void minhaEscolha(String string) {
        switch (string) {
            case "1":
                string = "correndo";
                break;
            case "2":
                string = "cavalgando";
                break;
            case "3":
                string = "voando";
                break;
        }
        System.out.println("Fugindo " + string);
    }
}
