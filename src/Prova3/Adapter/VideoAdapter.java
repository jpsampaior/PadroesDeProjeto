package Prova3.Adapter;

public class VideoAdapter implements IMidia{
    private MidiaVideo midiaVideo;

    public VideoAdapter(MidiaVideo midiaVideo) {
        this.midiaVideo = midiaVideo;
    }

    @Override
    public void editarArquivo(String key) {
        if(!key.equals("123")) {
            System.out.println("Você não está autorizado à fazer essa ação, atualize a sua chave de acesso!");
        } else {
            midiaVideo.editarArquivo();
        }
    }

    @Override
    public void carregarArquivo() {
        midiaVideo.carregarArquivo();
    }
}
