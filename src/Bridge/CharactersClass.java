package Bridge;

class Bard implements ICharacter {
    private IWeapon weapon;

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
        this.weapon.upgrade();
    }

    @Override
    public void attack() {
        System.out.println("Bard attacks");
        weapon.manage();
        weapon.drop();
    }
}

class Mage implements ICharacter {
    private IWeapon weapon;

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
        this.weapon.upgrade();
    }

    @Override
    public void attack() {
        System.out.println("Mage attacks");
        weapon.manage();
        weapon.drop();
    }
}
