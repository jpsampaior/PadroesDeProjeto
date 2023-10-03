package Prova3.Adapter;

public class MidiaVideo {
    public String filename;

    public MidiaVideo(String filename) {
        this.filename = filename;
    }

    void editarArquivo() {
        System.out.println("Editando arquivo de vídeo...");
    }

    void carregarArquivo() {
        System.out.println("Carregando arquivo de vídeo...");
    }

    public String getFilename() {
        return filename;
    }
}
