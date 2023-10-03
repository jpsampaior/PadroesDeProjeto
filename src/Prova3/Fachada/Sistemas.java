package Prova3.Fachada;

import Prova3.Adapter.IMidia;
import Prova3.Proxy.AutorizationKey;

class ConnectionSystem {
    private String key;
    public ConnectionSystem(String key) {
        this.key = key;
    }

    void connect() {
        System.out.println("Iniciando conexão com o banco de dados, utilizando a chave: "+key);
    }
}

class LoadSystem {
    void load(IMidia midia) {
        midia.carregarArquivo();
    }
}

class EditSystem {
    private AutorizationKey autorizationKey;

    public EditSystem(String autorizationKey) {
        this.autorizationKey = new AutorizationKey(autorizationKey);
    }

    void edit(IMidia midia) {
        midia.editarArquivo(autorizationKey.getKey());
    }
}


