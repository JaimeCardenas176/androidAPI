package com.example.jaime.androidapi.modelos;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jaime on 12/02/2018.
 */

public class Clouds {
    private Integer all;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Clouds() {
    }

    public Integer getAll() {
        return all;
    }


    public void setAll(Integer all) {
        this.all = all;
    }


    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
