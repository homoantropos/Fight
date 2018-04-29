package Competitions;

import java.util.ArrayList;

class MainJudge {

    String name;
    CategoriesOfJadges category;

    MainJudge(String name, CategoriesOfJadges category) {
        this.name = name;
        this.category = category;
    }

    ArrayList<Judge> panelOfjudgeRegistration () {
        ArrayList<Judge> judgesPanel = new ArrayList<>();
        System.out.println("Додати суддю? оберіть +/-:");
        String choice = ScanningHelper.inputString();
        while (choice.equals("+")) {
            Judge judge = judgeRegistration();
            judgesPanel.add(judge);
            System.out.println("Продовжити? оберіть +/-:");
            choice = ScanningHelper.inputString();
        }
        return judgesPanel;
    }

    Judge judgeRegistration () {
        Secretary secretar = new Secretary();
        String name = secretar.askName();
        Boolean sex = secretar.askSex();
        String town = secretar.askTown();
        System.out.println("Категорія:");
        String categoryName = ScanningHelper.inputString();
        switch (categoryName) {
            case "ІІІ": {
                category = CategoriesOfJadges.THIRD_CATEGORY;
                break;
            }
            case "ІІ": {
                category = CategoriesOfJadges.SECOND_CATEGORY;
                break;
            }
            case "І": {
                category = CategoriesOfJadges.FIRST_CATEGORY;
                break;
            }
            case "НК": {
                category = CategoriesOfJadges.NATIONAL_CATEGORY;
                break;
            }
            case "МК": {
                category = CategoriesOfJadges.INTERNATIONAL_CATEGORY;
                break;
            }
        }
        Judge judge = new Judge(name, sex, town, category);
        return judge;
    }
}


