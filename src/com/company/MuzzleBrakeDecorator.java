package com.company;

public class MuzzleBrakeDecorator extends AttachmentDecorator{
    public MuzzleBrakeDecorator(Weapon weapon) {
        super(weapon);
    }
    String revealWeaponAttachment(){
        return "Muzzle Brake (less recoil)";
    }
    Integer attachmentDamageBoost(){
        return -1;
    }

    Integer attachmentFireRateBoost(){
        return 0;
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
