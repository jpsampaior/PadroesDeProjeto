package BehavioralPatterns.Memento;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(100, 50);
        SaveManager saveManager = new SaveManager();

        player.displayStatus();

        saveManager.save(player);

        player.takeDamage(30);
        player.useMana(20);
        player.displayStatus();

        saveManager.restore(player);
        player.displayStatus();
    }
}
}
