package Bridge;
class bow implements IWeapon {
    public void upgrade() {
        System.out.println("Upgrading bow");
    }
    public void manage() {
        System.out.println("Managing bow");
    }
    public void drop() {
        System.out.println("Dropping bow");
    }
}

class dagger implements IWeapon {
    public void upgrade() {
        System.out.println("Upgrading dagger");
    }
    public void manage() {
        System.out.println("Managing dagger");
    }
    public void drop() {
        System.out.println("Dropping dagger");
    }
}
