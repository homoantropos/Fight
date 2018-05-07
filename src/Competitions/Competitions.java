package Competitions;
import Competitions.enums.CategoriesOfJudges;

import java.util.ArrayList;

public class Competitions {


    public static void main(String[] args) {
        FileManager.creatDirectory();

//        System.out.println("Розпочати змагання? Виберіть +/-: ");
//
//        String choice = ScanningHelper.setChoice();
//
//        while (choice.equals("+")) {
//            Secretary secretar = new Secretary();
//            ArrayList<Person> taoperformers = new ArrayList<>();
//            ArrayList<Person> judges = new ArrayList<>();
//
//            System.out.println("Створити склад спортсменів? Виберіть: +/- :");
//
//            choice = ScanningHelper.setChoice();
//
//            while (choice.equals("+")) {
//                taoperformers.add(secretar.taoPerformersRegistration());
//                System.out.println("Додати спортсмена? Виберіть: +/- :");
//                choice = ScanningHelper.setChoice();
//            }
//
//            System.out.println("Склад суддівської колегії:");
//            for (int i = 0; i < 4; i++) {
//                judges.add(secretar.judgesRegistration());
//            }
//
//            for (Person p : taoperformers) {
//                Float d = 0f;
//                System.out.println();
//                System.out.println("Виступає" + " " + p.getName());
//                for (Person j : judges) {
//                    if (j.getSex() == false) {
//                        System.out.println("");
//                        System.out.println("Шановний " + j.getName() + " ваша оцінка:");
//                    } else {
//                        System.out.println("Шановна " + j.getName() + " ваша оцінка:");
//                    }
//                    d = d + ((Judge) j).setDecicion();
//                }
//                    ((TaoPerformer) p).setResult2(d);
//            }
//            TaoPerformer.printTitle();
//            for (Person tp : taoperformers) {
//                System.out.println(((TaoPerformer) tp).toString());
//            }
//        }
    }
}