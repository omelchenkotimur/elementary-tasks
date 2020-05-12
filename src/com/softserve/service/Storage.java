package com.softserve.service;

import java.util.HashMap;
import java.util.Map;

public class Storage {

    private Map<String, Object> storage;

    public Storage() {
        this.storage = new HashMap<>();
    }

    public void create(String key, Object value) throws Exception {
        if (storage.get(key) == null){
            storage.put(key, value);
        }else throw new Exception();
    }

    public void update(String key, Object value) throws Exception {
        if (storage.get(key) != null){
            storage.replace(key, value);
        }else throw new Exception();
    }

    public void delete(String key, Object value) {
        storage.clear();
    }

    public void readAll(){
        for (Map.Entry entry : storage.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "."  + " Value: "
                    + entry.getValue() + ".");
        }
    }

    public void read (String key, Object value){
        System.out.println("Key: " + key + "." + " Value: " + value + ".");
    }
}

//создать папку репозиторий