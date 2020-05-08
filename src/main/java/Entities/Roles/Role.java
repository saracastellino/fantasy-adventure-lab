package Entities.Roles;

import Entities.Entity;

public abstract class Role extends Entity {

    protected int recoveryLevel;

    public Role(String name) {
        super(name);
    }

    public int getRecoveryLevel() {
        return recoveryLevel;
    }

}
