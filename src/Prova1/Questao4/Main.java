package Prova1.Questao4;

public class Main {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem();
        personagem1.setNome("João");

        Personagem personagem2 = personagem1.clone();
        System.out.println(personagem2.getNome());
    }
}
