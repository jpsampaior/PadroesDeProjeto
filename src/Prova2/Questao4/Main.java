package Prova2.Questao4;

import Prova2.Questao4.Mediator.CentralControle;
import Prova2.Questao4.Mediator.IMediator;
import Prova2.Questao4.Mediator.PainelControle;
import Prova2.Questao4.Strategy.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String escolhaPainel;
        PainelControle painelEscolhido = null;
        Contexto contexto = new Contexto();
        IEscolha escolha = null;
        String entrada1 = null, operacao;

        Scanner in = new Scanner(System.in);
        IMediator centralControle = new CentralControle();

        PainelControle painelControle1 = new PainelControle("Painel Cozinha", centralControle);
        PainelControle painelControle2 = new PainelControle("Painel Quarto", centralControle);

        System.out.println("Qual painel você está utlizando? 1 - Painel Cozinha 2 - Painel Quarto");
        escolhaPainel = in.nextLine();
        switch (escolhaPainel) {
            case "1":
                painelEscolhido = painelControle1;
                break;
            case "2":
                painelEscolhido = painelControle2;
                break;
        }

        System.out.println("Qual sistema você deseja controlar? 1 - Temperatura 2 - Iluminação");
        operacao = in.nextLine();
        switch (operacao) {
            case "1":
                System.out.println("Você deseja aumentar ou diminuir a temperatura? 1 - Aumentar 2 - Diminuir");
                entrada1 = in.nextLine();
                switch (entrada1) {
                    case "1":
                        System.out.println("Em quantos graus você deseja aumentar a temperatura?");
                        entrada1 = in.nextLine();
                        escolha = new EscolhaAquecimento();
                        break;
                    case "2":
                        System.out.println("Em quantos graus você deseja diminuir a temperatura?");
                        entrada1 = in.nextLine();
                        escolha = new EscolhaResfriamento();
                        break;
                }
                break;
            case "2":
                System.out.println("Você deseja ligar ou desligar a iluminacao? 1 - Ligar 2 - Desligar");
                entrada1 = in.nextLine();
                escolha = new EscolhaIluminacao();
                break;
        }

        contexto.setEscolha(escolha);
        contexto.executarEscolha(entrada1);

        switch (operacao) {
            case "1":
                painelEscolhido.ajustarTemperatura();
                break;
            case "2":
                painelEscolhido.ajustarIluminacao();
                break;
        }


    }
}
