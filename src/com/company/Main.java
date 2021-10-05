package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon weapon = new SilencerDecorator(new FrangibleAmmoDecorator(new UZI()));
        System.out.println("Your weapon: " + weapon.revealWeaponName());
        System.out.println("DPS: " + weapon.weaponAvgDamage()* weapon.weaponFireRate()/60);
    }
}
