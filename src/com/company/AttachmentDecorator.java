package com.company;

public abstract class AttachmentDecorator implements Weapon{
    private Weapon weapon;

    public AttachmentDecorator(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String revealWeaponName() {
        return this.weapon.revealWeaponName();
    }

    @Override
    public Integer weaponAvgDamage() {
        return this.weapon.weaponAvgDamage();
    }

    @Override
    public Integer weaponFireRate() {
        return this.weapon.weaponFireRate();
    }
}
