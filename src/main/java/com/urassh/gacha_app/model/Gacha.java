package com.urassh.gacha_app.model;

public record Gacha(String name, String rarity) {
    public Gacha {
        if (name == null || rarity == null) {
            throw new IllegalArgumentException("Name and rarity must not be null");
        }
    }

    public String toString() {
        return name + " (" + rarity + ")";
    }
}
