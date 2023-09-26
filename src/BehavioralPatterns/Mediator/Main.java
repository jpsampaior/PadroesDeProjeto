package BehavioralPatterns.Mediator;

public class Main {
    public static void main(String[] args) {
        IMediator controlTower = new ControlTower();

        Aircraft aircraft1 = new Aircraft("Aircraft 1", controlTower);
        Aircraft aircraft2 = new Aircraft("Aircraft 2", controlTower);

        aircraft1.requestLanding();

    }
}
