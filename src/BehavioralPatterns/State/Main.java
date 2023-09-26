package BehavioralPatterns.State;

public class Main {
    public static void main(String[] args) {
        ReprodutorMusica reprodutor = new ReprodutorMusica();

        reprodutor.iniciarReproducao();
        reprodutor.pausarReproducao();
        reprodutor.iniciarReproducao();
        reprodutor.retomarReproducao();
        reprodutor.pausarReproducao();
        reprodutor.pararReproducao();
        reprodutor.pararReproducao();
    }
}
