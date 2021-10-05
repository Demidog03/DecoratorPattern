package com.company;

public class ConversionAmmoDecorator extends AttachmentDecorator{
    public ConversionAmmoDecorator(Weapon weapon) {
        super(weapon);
    }
    String revealWeaponAttachment(){
        return "Conversion ammo (more fire rate)";
    }

    Integer attachmentDamageBoost(){
        return 0;
    }

    Integer attachmentFireRateBoost(){
        return 50;
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
