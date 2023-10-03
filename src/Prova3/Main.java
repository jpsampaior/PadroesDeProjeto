package Prova3;

import Prova3.Fachada.DbFacade;

public class Main {
    public static void main(String[] args) {
        //Chave certa: 123
        DbFacade db = new DbFacade("123456");
        db.carregarArquivoFoto("foto.jpg");
        db.carregarArquivoVideo("video.mp4");
        db.editarArquivoFoto("foto.jpg");
        db.editarArquivoVideo("video.mp4");
    }
}
