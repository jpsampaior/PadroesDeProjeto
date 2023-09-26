package BehavioralPatterns.Memento;

public class SaveManager {
    private PlayerMemento memento;

    public void save(Player player) {
        memento = player.saveState();
    }

    public void restore(Player player) {
        player.restoreState(memento);
    }
}
