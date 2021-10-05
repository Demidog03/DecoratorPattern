package com.company;

public class UZI implements Weapon{
    @Override
    public String revealWeaponName() {
        return "UZI";
    }

    @Override
    public Integer weaponAvgDamage() {
        return 34;
    }

    @Override
    public Integer weaponFireRate() {
        return 603;
    }
}
