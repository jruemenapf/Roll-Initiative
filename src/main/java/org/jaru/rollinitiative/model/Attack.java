package org.jaru.rollinitiative.model;

import org.springframework.data.annotation.Id;

/**
 * @author Jan
 */
public class Attack {
    private String id;
    private String name;
    private String damage;
    private String description;

    public String getName() {
        return name;
    }

    public Attack(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }


    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, name='%s', damage='%s', description='%s']",
                id, name, damage, description);
    }
}
