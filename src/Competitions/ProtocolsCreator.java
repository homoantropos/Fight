package Competitions;

import Competitions.enums.SectionsOfCompetitions;
import Competitions.enums.StagesOfCompetitions;

public class ProtocolsCreator {

    static Protocol protocolCreation () {
        Protocol protocol;
        String name = askNameOfCompetitons();
        String place = askPlaceOfCompetitons();
        String date = askdateOfCompetitons();
        StagesOfCompetitions stage = askStage();
        SectionsOfCompetitions section = askSection();
        protocol = new Protocol (name, place, date, stage, section);
        return protocol;
    }
    static String askNameOfCompetitons () {
        System.out.println("Назва змагань:");
        String nameOfCompetitions = ScanningHelper.inputString();
        return nameOfCompetitions;
    }
    static String askPlaceOfCompetitons () {
        System.out.println("Місце проведення змагань:");
        String placeOfCompetitions = ScanningHelper.inputString();
        return placeOfCompetitions;
    }
    static String askdateOfCompetitons () {
        String dateOfCompetitions;
        System.out.println("Дата проведення змагань:");
        dateOfCompetitions = ScanningHelper.inputString();
        return dateOfCompetitions;
    }
    static StagesOfCompetitions askStage () {
        StagesOfCompetitions stage = StagesOfCompetitions.COMBAT;
        System.out.println("Етап змагань:");
        String choice = ScanningHelper.inputString();
        switch (choice) {
            case "оп" : {
                stage = StagesOfCompetitions.OBLIGATORY_PROGRAM;
                break;
            }
            case "поєдинок" : {
                stage = StagesOfCompetitions.COMBAT;
                break;
            }
            default : askStage();
        }
        return stage;
    }

    static SectionsOfCompetitions askSection () {
        SectionsOfCompetitions section = SectionsOfCompetitions.REAL_FIGHT;
        System.out.println("Розділ змаагань:");
        String choice = ScanningHelper.inputString();
        switch (choice) {
            case "ФТК" : {
                section = SectionsOfCompetitions.FORMAL_TECHNICAL_COMPOSITIONS;
                break;
            }
            case "СФ" : {
                section = SectionsOfCompetitions.SUBMISSION_FIGHT;
                break;
            }
            case "ЛФ" : {
                section = SectionsOfCompetitions.LIMITED_FIGHT;
                break;
            }
            case "РФ" : {
                section = SectionsOfCompetitions.REAL_FIGHT;
                break;
            }
            case "ММА" : {
                section = SectionsOfCompetitions.MMA;
                break;
            }
            default : {
                askSection();
            }
        }
        return section;
    }
}
