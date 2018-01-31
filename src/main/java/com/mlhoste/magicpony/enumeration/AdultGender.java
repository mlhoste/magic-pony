package com.mlhoste.magicpony.enumeration;

public enum AdultGender {

    MR("M."), MRS("Mme"), MS("Mlle");
    private final String label;

    private AdultGender(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
