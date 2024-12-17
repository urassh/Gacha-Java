package com.urassh.gacha_app.model;

import java.util.Random;

public class GachaProvider {
    private final Gacha[] prizes = {
            new Gacha("Swift", "SSR"),
            new Gacha("Java", "SR"),
            new Gacha("Kotlin", "R"),
            new Gacha("Flutter", "N")
    };

    public String roll() {
        Random random = new Random();
        int index = random.nextInt(prizes.length);
        return prizes[index].toString();
    }
}
