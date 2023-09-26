package BehavioralPatterns.Observer;

public class MyObserver {
    private ISubject subject;

    public MyObserver(ISubject subject) {
        this.subject = subject;
        this.subject.register(this);
    }

    public void update() {
        System.out.println("Valor de interesse mudou " + subject.getFlag());
    }
}



