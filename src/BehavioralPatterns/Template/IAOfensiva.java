package BehavioralPatterns.Template;

public class IAOfensiva extends IAUnidade {
    @Override
    protected void selecionarAlvo() {
        System.out.println("IA Ofensiva: Selecionando alvo mais próximo.");
    }

    @Override
    protected void mover() {
        System.out.println("IA Ofensiva: Movendo-se em direção ao alvo.");
    }

    @Override
    protected void atacar() {
        System.out.println("IA Ofensiva: Atacando o alvo.");
    }
}
