package Prova2.Questao1.Strategy;

public class EscolhaAtaque implements IEscolha{
    @Override
    public void minhaEscolha(String string) {
        switch (string) {
            case "1":
                string = "Espada";
                break;
            case "2":
                string = "Arco";
                break;
            case "3":
                string = "Machado";
                break;
        }
        System.out.println("Atacando com " + string);
    }
}
