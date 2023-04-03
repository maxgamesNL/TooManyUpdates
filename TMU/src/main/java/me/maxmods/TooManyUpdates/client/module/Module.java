package me.maxmods.TooManyUpdates.client.module;

public abstract class Module {
    boolean isEnabled = false;
    String name, description;
    Category category;

    public Module(String name, String description, Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }
    protected abstract void onEnable();
    protected abstract void onDisable();
    public abstract void onTick();
    public abstract void onRenderWorld();
    public abstract void onRenderGui();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        if(enabled){
            onEnable();
        }else{
            onDisable();
        }
    }
}
