package Competitions;

enum CategoriesOfJadges {
    THIRD_CATEGORY ("III"),
    SECOND_CATEGORY ("II"),
    FIRST_CATEGORY ("I"),
    NATIONAL_CATEGORY ("НК"),
    INTERNATIONAL_CATEGORY ("МК");

    String categoryName;

    CategoriesOfJadges(String categoryName) {
        this.categoryName = categoryName;
    }

    String getCategoryName() {
        return categoryName;
    }

    void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
