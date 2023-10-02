package Prova2.Questao4.Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Contexto contexto = new Contexto();
        IEscolha escolha = null;
        String entrada1 = null, operacao;
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





    }
}
