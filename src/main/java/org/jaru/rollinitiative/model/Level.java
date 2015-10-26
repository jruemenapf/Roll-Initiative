package org.jaru.rollinitiative.model;

/**
 * @author jruemenapf, codecentric AG on 16.04.2015.
 */
public enum Level {
    ONE(1, 100), TWO(2, 200), THREE(3, 300), FOUR(4, 400), FIVE(5, 500), SIX(6, 600), SEVEN(7, 700), EIGHT(8, 800), NINE(9, 900), TEN(10, 1000);

    private int level;
    private int experience;

    Level(int level, int experience) {
        this.level = level;
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }
}
