package Strategy;

public class Contexto {
    IEscolha Escolha;

    public void setEscolha(IEscolha escolha) {
        this.Escolha = escolha;
    }

    public void executarEscolha(String string1, String string2) {
        Escolha.minhaEscolha(string1, string2);
    }
}
