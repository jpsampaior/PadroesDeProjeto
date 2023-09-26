package Prova1.Questao1;

public class SingletonCriacaoUsuarios {
    private static SingletonCriacaoUsuarios _singletonCriacaoUsuarios;

    static SingletonCriacaoUsuarios getSingletonCriacaoUsuarios() {
        if(_singletonCriacaoUsuarios == null) {
            _singletonCriacaoUsuarios = new SingletonCriacaoUsuarios();
            System.out.println("Classe criada");
        } else {
            System.out.println("Reaproveitamento da classe");
        }

        return _singletonCriacaoUsuarios;
    }

    void criarFuncionario(String nome, int codigo) {
        System.out.println("Criando usuário");
    }
}
