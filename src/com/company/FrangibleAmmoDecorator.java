package com.company;

public class FrangibleAmmoDecorator extends AttachmentDecorator{
    public FrangibleAmmoDecorator(Weapon weapon) {
        super(weapon);
    }

    String revealWeaponAttachment(){
        return "Frangible ammo (more damage)";
    }

    Integer attachmentDamageBoost(){
        return 10;
    }

    Integer attachmentFireRateBoost(){
        return -105;
    }

    public String revealWeaponName() {
        return super.revealWeaponName() + " + " + this.revealWeaponAttachment();
    }

    public Integer weaponAvgDamage() {
        return super.weaponAvgDamage() + this.attachmentDamageBoost();
    }


    public Integer weaponFireRate() {
        return super.weaponFireRate() + this.attachmentFireRateBoost();
    }
}
