package BehavioralPatterns.Template;

public class Jogo {
    public static void main(String[] args) {
        IAUnidade iaOfensiva = new IAOfensiva();
        IAUnidade iaDefensiva = new IADefensiva();

        System.out.println("Unidade com IA Ofensiva:");
        iaOfensiva.executarIA();

        System.out.println("\nUnidade com IA Defensiva:");
        iaDefensiva.executarIA();
    }
}