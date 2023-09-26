package Prova1.Questao3;

public class SalaBuilder {
    private String sofa;
    private String tv;
    private String mesa;
    private String cadeiras;
    private String porcelanato;

    public SalaBuilder() {

    }

    public SalaBuilder withSofa(String modeloSofa) {
        this.sofa = modeloSofa;
        return this;
    }

    public SalaBuilder withTv(String modeloTv) {
        this.tv = modeloTv;
        return this;
    }

    public SalaBuilder withMesa(String modeloMesa) {
        this.mesa = modeloMesa;
        return this;
    }

    public SalaBuilder withCadeiras(String modeloCadeiras) {
        this.cadeiras = modeloCadeiras;
        return this;
    }

    public SalaBuilder withPorcelanato(String modeloPorcelanato) {
        this.porcelanato = modeloPorcelanato;
        return this;
    }

    public Sala toSala() throws Exception {
        validarAmbiente();
        return new Sala(sofa,tv,mesa,cadeiras,porcelanato);
    }

    public void validarAmbiente() throws Exception {
        if(porcelanato == null) {
            throw new Exception();
        }
    }
}
