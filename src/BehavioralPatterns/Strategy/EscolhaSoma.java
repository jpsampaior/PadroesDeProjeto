package BehavioralPatterns.Strategy;

public class EscolhaSoma implements IEscolha{
    @Override
    public void minhaEscolha(String string1, String string2) {
        System.out.println("O resultado da soma foi: " + (Integer.parseInt(string1) + Integer.parseInt(string2)));
    }
}
