package com.company;

public class AK47 implements Weapon{

    @Override
    public String revealWeaponName() {
        return "AK-47";
    }

    @Override
    public Integer weaponAvgDamage() {
        return 38;
    }

    @Override
    public Integer weaponFireRate() {
        return 545;
    }
}
