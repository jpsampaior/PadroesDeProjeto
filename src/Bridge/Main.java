package Bridge;

public class Main {
    public static void main(String[] args) {
        IWeapon dagger = new dagger();
        IWeapon bow = new bow();

        ICharacter mage = new Mage();
        ICharacter bard = new Bard();

        mage.setWeapon(bow);
        bard.setWeapon(dagger);

        mage.attack();
        bard.attack();
    }
}
