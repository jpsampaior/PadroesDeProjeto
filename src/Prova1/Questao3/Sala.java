package Prova1.Questao3;
public class Sala {
    private final String sofa;
    private final String tv;
    private final String mesa;
    private final String cadeiras;
    private final String porcelanato;

    public Sala(String sofa, String tv, String mesa, String cadeiras, String porcelanato) {
        this.sofa = sofa;
        this.tv = tv;
        this.mesa = mesa;
        this.cadeiras = cadeiras;
        this.porcelanato = porcelanato;
    }

    public String getSofa() {
        return sofa;
    }

    public String getTv() {
        return tv;
    }

    public String getMesa() {
        return mesa;
    }

    public String getCadeiras() {
        return cadeiras;
    }

    public String getPorcelanato() {
        return porcelanato;
    }


}
