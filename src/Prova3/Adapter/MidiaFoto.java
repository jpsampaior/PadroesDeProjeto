package Prova3.Adapter;

public class MidiaFoto{
    private String filename;

    public MidiaFoto(String filename) {
        this.filename = filename;
    }

    public void editarArquivo() {
        System.out.println("Editando arquivo de foto");
    }

    public void carregarArquivo() {
        System.out.println("Carregando arquivo de foto");
    }

    public String getFilename() {
        return filename;
    }
}
