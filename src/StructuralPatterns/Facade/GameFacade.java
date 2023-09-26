package StructuralPatterns.Facade;

public class GameFacade {
    private InputSystem inputSystem;
    private GraphicsSystem graphicsSystem;
    private AudioSystem audioSystem;
    public GameFacade() {
        this.inputSystem = new InputSystem();
        this.graphicsSystem = new GraphicsSystem();
        this.audioSystem = new AudioSystem();
    }

    void playGame() {
        inputSystem.handleInput();
        graphicsSystem.render();
        audioSystem.playSound();
        System.out.println("Starting the game...");
    }
}
