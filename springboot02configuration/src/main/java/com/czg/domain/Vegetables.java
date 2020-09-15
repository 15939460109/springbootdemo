package com.czg.domain;

import lombok.Data;

@Data
public class Vegetables {

    private String potato;
    private String eggplant;
    private String greenPepper;

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

    public String getEggplant() {
        return eggplant;
    }

    public void setEggplant(String eggplant) {
        this.eggplant = eggplant;
    }

    public String getGreenPepper() {
        return greenPepper;
    }

    public void setGreenPepper(String greenPepper) {
        this.greenPepper = greenPepper;
    }
}
