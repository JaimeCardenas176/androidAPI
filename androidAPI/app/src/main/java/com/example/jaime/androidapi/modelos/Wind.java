package com.example.jaime.androidapi.modelos;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jaime on 12/02/2018.
 */

public class Wind {
    private Double speed;

    private Integer deg;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
