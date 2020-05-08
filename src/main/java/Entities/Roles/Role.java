package Entities.Roles;

import Entities.Entity;

public abstract class Role extends Entity {

    private int RecoveryLevel;

    public Role(String name, int healthLevel, int attackLevel, int defenceLevel, int recoveryLevel) {
        super(name, healthLevel, attackLevel, defenceLevel);
        RecoveryLevel = recoveryLevel;
    }

    public int getRecoveryLevel() {
        return RecoveryLevel;
    }

}
