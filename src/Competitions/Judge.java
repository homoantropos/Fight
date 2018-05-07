package Competitions;

import Competitions.enums.CategoriesOfJudges;

class Judge extends Person {

    private CategoriesOfJudges category;
    private Float decicion;

    Judge (String name, Boolean sex, String town, CategoriesOfJudges category) {
        super(name, sex, town);
        this.category = category;
        this.decicion = decicion;
    }
Judge () {}

    CategoriesOfJudges getCategory() {
        return category;
    }

    void setCategory(CategoriesOfJudges category) {
        this.category = category;
    }

    Float getDecicion() {
        return decicion;
    }

    void setDecicion(Float decicion) {
        this.decicion = decicion;
    }

    Float setDecicion () {
        System.out.println("оцінка від 1 до 99:");
        int dec = ScanningHelper.inputInt();
        if (dec < 0) {
            setDecicion();
        }
        else if (dec > 99) {
            setDecicion();
        }
        else {
            decicion = dec / 10f;
            return decicion;
        }
        return decicion;
    }

    @Override
    public String toString() {
        return (String.format("%-30s %-20s %3s", getName(), getTown(), category.getCategoryName()));
    }
}