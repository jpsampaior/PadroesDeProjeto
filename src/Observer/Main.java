package Observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        MyObserver observer1 = new MyObserver(subject);
        MyObserver observer2 = new MyObserver(subject);

        subject.setFlag(1);
        subject.setFlag(2);
        subject.unregister(observer1);
        subject.setFlag(3);
    }
}
