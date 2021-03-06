package fr.lernejo.navy_battle.game;

import java.util.UUID;

public class Player {
    private final UUID id;
    private final String url;
    private final String message;

    public Player() {
        this.id = null;
        this.url = null;
        this.message = null;
    }

    public Player(UUID id, String url, String message) {
        this.id = id;
        this.url = url;
        this.message = message;
    }

    public UUID getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
