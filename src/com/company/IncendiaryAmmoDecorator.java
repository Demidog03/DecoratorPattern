package com.company;

public class IncendiaryAmmoDecorator extends AttachmentDecorator{
    public IncendiaryAmmoDecorator(Weapon weapon) {
        super(weapon);
    }
    String revealWeaponAttachment(){
        return "Incendiary ammo (sets fire to opponents)";
    }

    Integer attachmentDamageBoost(){
        return 5;
    }

    Integer attachmentFireRateBoost(){
        return 0;
    }

    public Integer weaponAvgDamage() {
        return super.weaponAvgDamage() + this.attachmentDamageBoost();
    }


    public Integer weaponFireRate() {
        return super.weaponFireRate() + this.attachmentFireRateBoost();
    }

    public String revealWeaponName() {
        return super.revealWeaponName() + " + " + this.revealWeaponAttachment();
    }
}
