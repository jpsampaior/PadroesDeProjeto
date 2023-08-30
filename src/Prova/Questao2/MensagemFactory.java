package Prova.Questao2;

public class MensagemFactory {
    static Mensagem getPlataform(String name) {
        switch (name) {
            case "Email":
                return new Email();
            case "Whatsapp":
                return new Whatsapp();
            case "SMS":
                return new SMS();
        }

        return null;
    }
}
