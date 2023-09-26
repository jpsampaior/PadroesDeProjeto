package BehavioralPatterns.Template;

public class IADefensiva extends IAUnidade {
    @Override
    protected void selecionarAlvo() {
        System.out.println("IA Defensiva: Avaliando ameaças e selecionando alvo com cautela.");
    }

    @Override
    protected void mover() {
        System.out.println("IA Defensiva: Posicionando-se defensivamente.");
    }

    @Override
    protected void atacar() {
        System.out.println("IA Defensiva: Atacando com prudência.");
    }
}