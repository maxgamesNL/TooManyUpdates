package me.maxmods.TooManyUpdates.client.module;

import java.util.ArrayList;
import java.util.List;

public class ModuleManager {

    private static ModuleManager INSTANCE = null;
    List<Module> MODULES = new ArrayList<>();
    List<Category> CATEGORIES = new ArrayList<>();

    public ModuleManager() {
        if(INSTANCE != null){
            throw new IllegalStateException("Module registry already exists");
        }
        INSTANCE = this;
        registerCategories();
        registerModules();
    }

    void registerModule(Module module){
        MODULES.add(module);
    }

    void registerCategory(Category category){
        CATEGORIES.add(category);
    }

    void registerModules(){

    }

    void registerCategories(){

    }

    public static ModuleManager getInstance(){
        if(INSTANCE == null){
            new ModuleManager();
        }
        return INSTANCE;
    }

    public List<Module> getModules(){
        return MODULES;
    }

    public List<Category> getCategories(){
        return CATEGORIES;
    }

    public Module getModule(String name){
        for(Module module : MODULES){
            if(module.getName().equalsIgnoreCase(name)){
                return module;
            }
        }
        return null;
    }

    public Category getCategory(String name){
        for(Category category : CATEGORIES){
            if(category.getName().equalsIgnoreCase(name)){
                return category;
            }
        }
        return null;
    }

}
