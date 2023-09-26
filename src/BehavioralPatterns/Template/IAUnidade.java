package BehavioralPatterns.Template;

public abstract class IAUnidade {
    public void executarIA() {
        selecionarAlvo();
        mover();
        atacar();
    }

    protected abstract void selecionarAlvo();
    protected abstract void mover();
    protected abstract void atacar();
}
