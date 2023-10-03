package Prova3.Fachada;

import Prova3.Adapter.FotoAdapter;
import Prova3.Adapter.MidiaFoto;
import Prova3.Adapter.MidiaVideo;
import Prova3.Adapter.VideoAdapter;

public class DbFacade {
    private ConnectionSystem connectionSystem;
    private LoadSystem loadSystem;
    private EditSystem editSystem;

    public DbFacade(String key) {
        this.connectionSystem = new ConnectionSystem(key);
        this.loadSystem = new LoadSystem();
        this.editSystem = new EditSystem(key);
        this.connectionSystem.connect();
    }

    public void carregarArquivoFoto(String filename) {
        MidiaFoto foto = new MidiaFoto(filename);
        FotoAdapter fotoAdapter = new FotoAdapter(foto);
        this.loadSystem.load(fotoAdapter);
    }

    public void carregarArquivoVideo(String filename) {
        MidiaVideo video = new MidiaVideo(filename);
        VideoAdapter videoAdapter = new VideoAdapter(video);
        this.loadSystem.load(videoAdapter);
    }

    public void editarArquivoFoto(String filename) {
        MidiaFoto foto = new MidiaFoto(filename);
        FotoAdapter fotoAdapter = new FotoAdapter(foto);
        this.editSystem.edit(fotoAdapter);
    }

    public void editarArquivoVideo(String filename) {
        MidiaVideo video = new MidiaVideo(filename);
        VideoAdapter videoAdapter = new VideoAdapter(video);
        this.editSystem.edit(videoAdapter);
    }
}
