package Prova2.Questao1.State;

public class Main {
    public static void main(String[] args) {
        PersonagemBatalha personagem = new PersonagemBatalha();

        personagem.atacar();
        personagem.defender();
        personagem.receberEsfraquecimento();
        personagem.atacar();
        personagem.defender();
        personagem.receberParalisia();
        personagem.atacar();
        personagem.defender();
        personagem.receberParalisia();
        personagem.fugir();
    }
}
