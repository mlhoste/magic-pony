package com.mlhoste.magicpony.enumeration;

public enum PonyGender {

    MR("étalon"), MRS("hongre"), MS("jument");
    private final String label;

    private PonyGender(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
