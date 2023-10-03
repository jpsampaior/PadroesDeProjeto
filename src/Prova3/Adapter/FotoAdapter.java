package Prova3.Adapter;

public class FotoAdapter implements IMidia{
    private MidiaFoto midiaFoto;

    public FotoAdapter(MidiaFoto midiaFoto) {
        this.midiaFoto = midiaFoto;
    }

    @Override
    public void editarArquivo(String key) {
        midiaFoto.editarArquivo();
    }

    @Override
    public void carregarArquivo() {
        midiaFoto.carregarArquivo();
    }
}
