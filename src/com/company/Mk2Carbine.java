package com.company;

public class Mk2Carbine implements Weapon{
    @Override
    public String revealWeaponName() {
        return "Mk2 Carbine";
    }

    @Override
    public Integer weaponAvgDamage() {
        return 108;
    }

    @Override
    public Integer weaponFireRate() {
        return 88;
    }
}
