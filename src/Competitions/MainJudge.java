package Competitions;

import Competitions.enums.CategoriesOfJudges;

import java.util.ArrayList;

class MainJudge {

    String name;
    CategoriesOfJudges category;

    MainJudge(String name, CategoriesOfJudges category) {
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
                category = CategoriesOfJudges.THIRD_CATEGORY;
                break;
            }
            case "ІІ": {
                category = CategoriesOfJudges.SECOND_CATEGORY;
                break;
            }
            case "І": {
                category = CategoriesOfJudges.FIRST_CATEGORY;
                break;
            }
            case "НК": {
                category = CategoriesOfJudges.NATIONAL_CATEGORY;
                break;
            }
            case "МК": {
                category = CategoriesOfJudges.INTERNATIONAL_CATEGORY;
                break;
            }
        }
        Judge judge = new Judge(name, sex, town, category);
        return judge;
    }
}


