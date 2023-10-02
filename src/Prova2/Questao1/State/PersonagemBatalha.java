package Prova2.Questao1.State;

public class PersonagemBatalha {
    private EstadoPersonagem estadoAtual;
    private boolean estaParalizado;

    public PersonagemBatalha() {
        estadoAtual = new EstadoNormal();
    }

    public void setEstado(EstadoPersonagem novoEstado) {
        estadoAtual = novoEstado;
    }
    public boolean estaParalizado() {
        return estaParalizado;
    }

    public void atacar() {
        estadoAtual.atacar();
        if(estadoAtual instanceof EstadoParalizado || estadoAtual instanceof EstadoEsfraquecido) {
            setEstado(new EstadoNormal());
            estaParalizado = false;
        }
    }

    public void defender() {
        estadoAtual.defender();
        if(estadoAtual instanceof EstadoParalizado || estadoAtual instanceof EstadoEsfraquecido) {
            setEstado(new EstadoNormal());
            estaParalizado = false;
        }
    }

    public void fugir() {
        estadoAtual.fugir();
        if(estadoAtual instanceof EstadoParalizado) {
            setEstado(new EstadoNormal());
            estaParalizado = false;
        }
    }

    public void receberEsfraquecimento() {
        setEstado(new EstadoEsfraquecido());
    }

    public void receberParalisia() {
        setEstado(new EstadoParalizado());
        estaParalizado = true;
    }

}
