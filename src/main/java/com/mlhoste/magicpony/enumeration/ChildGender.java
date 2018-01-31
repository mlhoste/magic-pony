package com.mlhoste.magicpony.enumeration;

public enum ChildGender {

    BOY("garçon"), GIRL("fille");
    private final String label;

    private ChildGender(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
