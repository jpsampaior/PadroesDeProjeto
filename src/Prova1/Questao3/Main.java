package Prova1.Questao3;

public class Main {
    public static void main(String[] args) {
        SalaBuilder salaBuilder = new SalaBuilder();
        salaBuilder.withSofa("Sofá cama de 1.30m").withPorcelanato("Branco");

        try{
            Sala sala = salaBuilder.toSala();
            System.out.println(sala.getSofa());
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}