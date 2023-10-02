package Prova2.Questao1.State;

class EstadoNormal implements EstadoPersonagem {
    @Override
    public void atacar() {
        System.out.println("Atacando normalmente");
    }

    @Override
    public void defender() {
        System.out.println("Defendendo normalmente");
    }

    @Override
    public void fugir() {
        System.out.println("Fugindo normalmente");
    }
}

class EstadoEsfraquecido implements EstadoPersonagem {
    @Override
    public void atacar() {
        System.out.println("Atacando esfraquecido");
    }

    @Override
    public void defender() {
        System.out.println("Defendendo esfraquecido");
    }

    @Override
    public void fugir() {
        System.out.println("Fugindo esfraquecido");
    }
}

class EstadoParalizado implements EstadoPersonagem {
    @Override
    public void atacar() {
        System.out.println("Personagem paralizado, ataque não efetuado");
    }

    @Override
    public void defender() {
        System.out.println("Personagem paralizado, defesa não efetuada");
    }

    @Override
    public void fugir() {
        System.out.println("Personagem paralizado, não é possível fugir");
    }
}
