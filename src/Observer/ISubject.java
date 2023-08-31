package Observer;

public interface ISubject {
    void register(MyObserver observer);
    void unregister(MyObserver observer);
    void notifyObservers();
    int getFlag();
}
