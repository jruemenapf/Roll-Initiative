package org.jaru.rollinitiative.model;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * @author Jan
 */
public class Monster {
    private String id;
    private String name;
    private Level level;
    private String role;
    private String race;
    private List<Attack> attacks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public List<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<Attack> attacks) {
        this.attacks = attacks;
    }


    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, name='%s', Level[level='%s', experience='%s'], role='%s', race='%s']",
                id, name, level.getLevel(), level.getExperience(), role, race);
    }
}
