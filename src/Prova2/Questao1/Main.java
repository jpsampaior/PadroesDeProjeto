package Prova2.Questao1;


import Prova2.Questao1.State.PersonagemBatalha;
import Prova2.Questao1.Strategy.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        IEscolha escolha = null;
        Contexto contexto = new Contexto();
        String maneira = null, operacao;
        PersonagemBatalha personagem = new PersonagemBatalha();

        for(int i = 0; i < 3; i++) {
            System.out.println("O que você deseja fazer? 1 - Atacar 2 - Defender 3 - Fugir");
            operacao = in.nextLine();
            switch (operacao) {
                case "1":
                    escolha = new EscolhaAtaque();
                    System.out.println("Você deseja atacar com qual arma? 1 - Espada 2 - Arco 3 - Machado");
                    maneira = in.nextLine();
                    personagem.atacar();
                    break;
                case "2":
                    escolha = new EscolhaDefesa();
                    System.out.println("Você deseja se defender com qual arma? 1 - Escudo 2 - Armadura 3 - Elmo");
                    maneira = in.nextLine();
                    personagem.defender();
                    break;
                case "3":
                    escolha = new EscolhaFugir();
                    System.out.println("Você deseja fugir de qual forma? 1 - Correndo 2 - Montado em um cavalo 3 - Montado em um dragão");
                    maneira = in.nextLine();
                    personagem.fugir();
                    break;
            }

            if(!personagem.estaParalizado()) {
                contexto.setEscolha(escolha);
                contexto.executarEscolha(maneira);
            }


        }


    }
}
