package BehavioralPatterns.Memento;

public class PlayerMemento {
    private int hp;
    private int mp;

    public PlayerMemento(int hp, int mp) {
        this.hp = hp;
        this.mp = mp;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }
}
