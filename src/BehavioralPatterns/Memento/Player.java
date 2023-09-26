package BehavioralPatterns.Memento;

public class Player {
    private int hp;
    private int mp;

    public Player(int hp, int mp) {
        this.hp = hp;
        this.mp = mp;
    }

    public void takeDamage(int damage) {
        hp -= damage;
    }

    public void useMana(int manaUsed) {
        mp -= manaUsed;
    }

    public PlayerMemento saveState() {
        return new PlayerMemento(hp, mp);
    }

    public void restoreState(PlayerMemento memento) {
        this.hp = memento.getHp();
        this.mp = memento.getMp();
    }

    public void displayStatus() {
        System.out.println("HP: " + hp + " | MP: " + mp);
    }
}
