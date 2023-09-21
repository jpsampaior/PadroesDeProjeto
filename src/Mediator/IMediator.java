package Mediator;

public interface IMediator {
    void registerAircraft(Aircraft aircraft);
    void requestLanding(Aircraft aircraft);
    void confirmLanding(Aircraft aircraft);


}
