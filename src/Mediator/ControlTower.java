package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ControlTower implements IMediator{
    private List<Aircraft> aircraftList = new ArrayList<>();

    @Override
    public void registerAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }

    @Override
    public void requestLanding(Aircraft aircraft) {
        for(Aircraft anotherAircraft : aircraftList) {
            if(!anotherAircraft.equals(aircraft)) {
                anotherAircraft.receiveLandingRequest();
            }
        }
    }

    @Override
    public void confirmLanding(Aircraft aircraft) {

    }
}
