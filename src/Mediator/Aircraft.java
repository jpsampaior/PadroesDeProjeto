package Mediator;

public class Aircraft {
    private String name;
    private IMediator controlTower;

    public Aircraft(String name, IMediator controlTower) {
        this.name = name;
        this.controlTower = controlTower;
        this.controlTower.registerAircraft(this);
    }

    public void requestLanding() {
        System.out.println(name + " requesting landing authorization");
        controlTower.requestLanding(this);
    }

    public void receiveLandingRequest() {
        System.out.println(name + " received landing request");
    }

    public void confirmLanding() {
        System.out.println(name + " confirming landing");
        controlTower.confirmLanding(this);
    }

    public void completeLanding() {
        System.out.println(name + " completed the landing process");
    }
}
