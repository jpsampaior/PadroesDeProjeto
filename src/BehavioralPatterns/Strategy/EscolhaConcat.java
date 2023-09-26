package BehavioralPatterns.Strategy;

public class EscolhaConcat implements IEscolha {
    @Override
    public void minhaEscolha(String string1, String string2) {
        System.out.println("O resultado da concatenação foi: " + string1.concat(string2));
    }
}

