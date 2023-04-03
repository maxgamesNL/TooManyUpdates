package me.maxmods.TooManyUpdates.client.module;

public abstract class Category {
    boolean isLoaded = false;
    String name;

    public Category(String name) {
        this.name = name;
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public String getName() {
        return name;
    }
}
