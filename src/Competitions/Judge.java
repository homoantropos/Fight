package Competitions;

import Competitions.enums.CategoriesOfJudges;

class Judge extends Person {

    private CategoriesOfJudges category;

    Judge (String name, Boolean sex, String town, CategoriesOfJudges category) {
        super(name, sex, town);
        this.category = category;
    }
Judge () {}

    CategoriesOfJudges getCategory() {
        return category;
    }

    void setCategory(CategoriesOfJudges category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return (String.format("%-30s %-20s %3s", getName(), getTown(), category.getCategoryName()));
    }
}