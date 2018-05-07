package Competitions.enums;

public enum CategoriesOfJudges {
    THIRD_CATEGORY ("III"),
    SECOND_CATEGORY ("II"),
    FIRST_CATEGORY ("I"),
    NATIONAL_CATEGORY ("НК"),
    INTERNATIONAL_CATEGORY ("МК");

    private String categoryName;

    CategoriesOfJudges(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}