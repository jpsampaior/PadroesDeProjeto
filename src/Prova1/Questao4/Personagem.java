package Prova1.Questao4;

public class Personagem {
    private String nome;
    private String genero;
    private String altura;
    private String largura;

    public Personagem clone() {
        Personagem pClone = new Personagem();
        pClone.setNome(this.nome);
        pClone.setGenero(this.genero);
        pClone.setAltura(this.altura);
        pClone.setLargura(this.largura);

        return pClone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getLargura() {
        return largura;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }
}
