package Competitions;

import java.io.Serializable;

class Person implements Serializable {

    private String name;
    private Boolean sex;
    private String town;


    Person (String name, Boolean sex, String town) {
        this.name = name;
        this.sex = sex;
        this.town = town;
    }

Person () {}

    String getName() {
        return name;
    }

    void setName (String name) {
        this.name = name;
    }

    Boolean getSex() {
        return sex;
    }

    void setSex (Boolean sex) {
        this.sex = sex;
    }

    String getTown() {
        return town;
    }

    void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return getName() + " " + getTown();
    }

}
