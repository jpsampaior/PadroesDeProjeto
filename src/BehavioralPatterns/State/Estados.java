package BehavioralPatterns.State;

class EstadoReproduzindo implements EstadoReproducao {
    @Override
    public void iniciarReproducao() {
        System.out.println("Iniciando a reprodução da música.");
    }

    @Override
    public void pausarReproducao() {
        System.out.println("Pausando a reprodução da música.");
    }

    @Override
    public void retomarReproducao() {
        System.out.println("A música já está reproduzindo.");
    }

    @Override
    public void pararReproducao() {
        System.out.println("Parando a reprodução da música.");
    }
}

class EstadoPausado implements EstadoReproducao {
    @Override
    public void iniciarReproducao() {
        System.out.println("Retomando a reprodução da música.");
    }

    @Override
    public void pausarReproducao() {
        System.out.println("A música já está pausada.");
    }

    @Override
    public void retomarReproducao() {
        System.out.println("Retomando a reprodução da música.");
    }

    @Override
    public void pararReproducao() {
        System.out.println("Parando a reprodução da música.");
    }
}

class EstadoParado implements EstadoReproducao {
    @Override
    public void iniciarReproducao() {
        System.out.println("Iniciando a reprodução da música.");
    }

    @Override
    public void pausarReproducao() {
        System.out.println("A música ainda não está reproduzindo.");
    }

    @Override
    public void retomarReproducao() {
        System.out.println("A música ainda não está reproduzindo.");
    }

    @Override
    public void pararReproducao() {
        System.out.println("A música já está parada.");
    }
}
