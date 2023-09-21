package Facade;

class InputSystem {
    void handleInput() {
        System.out.println("InputSystem::handleInput");
    }
}
class GraphicsSystem {
    void render() {
        System.out.println("GraphicsSystem::render");
    }
}
class AudioSystem {
    void playSound() {
        System.out.println("AudioSystem::playSound");
    }
}
/*class ServersSystem {
    void connectToServers() {
        System.out.println("ServersSystem::connectToServers");
    }
}

class ConnectionSystem {
    void connect() {
        System.out.println("ConnectionSystem::connect");
    }
}*/