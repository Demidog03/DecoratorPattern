package com.company;

public class SilencerDecorator extends AttachmentDecorator{
    public SilencerDecorator(Weapon weapon) {
        super(weapon);
    }
    String revealWeaponAttachment(){
        return "Silencer(quieter shooting sounds)";
    }

    Integer attachmentDamageBoost(){
        return -3;
    }

    Integer attachmentFireRateBoost(){
        return 0;
    }

    public String revealWeaponName() {
        return super.revealWeaponName() + " + " + this.revealWeaponAttachment();
    }


    public Integer weaponAvgDamage() {
        return super.weaponAvgDamage() + attachmentDamageBoost();
    }


    public Integer weaponFireRate() {
        return super.weaponFireRate() + attachmentFireRateBoost();
    }
}
