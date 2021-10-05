package com.company;

public class ASVAL implements Weapon{
    @Override
    public String revealWeaponName() {
        return "AS VAL";
    }

    @Override
    public Integer weaponAvgDamage() {
        return 33;
    }

    @Override
    public Integer weaponFireRate() {
        return 885;
    }
}
