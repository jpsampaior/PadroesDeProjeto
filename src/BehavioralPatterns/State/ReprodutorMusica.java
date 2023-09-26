package BehavioralPatterns.State;

public class ReprodutorMusica {
    private EstadoReproducao estadoAtual;

    public ReprodutorMusica() {
        estadoAtual = new EstadoParado(); // Começa no estado "Parado"
    }

    public void setEstado(EstadoReproducao novoEstado) {
        estadoAtual = novoEstado;
    }

    public void iniciarReproducao() {
        estadoAtual.iniciarReproducao();
        if (estadoAtual instanceof EstadoParado) {
            setEstado(new EstadoReproduzindo());
        }
    }

    public void pausarReproducao() {
        estadoAtual.pausarReproducao();
        if (estadoAtual instanceof EstadoReproduzindo) {
            setEstado(new EstadoPausado());
        }
    }

    public void retomarReproducao() {
        estadoAtual.retomarReproducao();
    }

    public void pararReproducao() {
        estadoAtual.pararReproducao();
        setEstado(new EstadoParado());
    }
}
