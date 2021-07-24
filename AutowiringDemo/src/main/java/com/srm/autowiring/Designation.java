package com.srm.autowiring;

public class Designation {
    private String design;

    public Designation() {
        super();
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    @Override
    public String toString() {
        return " [Designation=" + design + "]";
    }

}
