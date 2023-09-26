package BehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject{
    List<MyObserver> observerList = new ArrayList<MyObserver>();
    private int flag;
    
    @Override
    public void register(MyObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(MyObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update();
        }
    }

    @Override
    public int getFlag() {
        return flag;
    }
    
    public void setFlag(int flag) {
        this.flag = flag;
        notifyObservers();
    }
}
