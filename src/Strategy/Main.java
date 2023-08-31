package Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Strategy Pattern");
        Scanner in = new Scanner(System.in);
        IEscolha escolha = null;
        Contexto contexto = new Contexto();
        String entrada1, entrada2, operacao;

        System.out.println("Digite o primeiro valor: ");
        entrada1 = in.nextLine();
        System.out.println("Digite o segundo valor: ");
        entrada2 = in.nextLine();
        System.out.println("O que deseja fazer com os valores? 1 - Concatenar 2 - Somar");
        operacao = in.nextLine();

        if(operacao.equals("1")) {
            escolha = new EscolhaConcat();
        } else if(operacao.equals("2")) {
            escolha = new EscolhaSoma();
        }

        contexto.setEscolha(escolha);
        contexto.executarEscolha(entrada1, entrada2);
    }
}
