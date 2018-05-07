package Competitions;
import Competitions.enums.CategoriesOfJudges;

import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Secretary extends Judge {

    Secretary() {
    }

    TaoPerformer taoPerformersRegistration() {
        String name = askName();
        Boolean sex = askSex();
        String town = askTown();
        LocalDate dOB = askDoB();
        Integer age = askAge(dOB);
        String club = askClub();
        String coach = askCoach();
        String rang = askRang();
        String kindOfProgram = askKindOfProgram();
        String kindOfTao = askKindOfTao();

        TaoPerformer taoperformer = new TaoPerformer(name, sex, town, dOB, age, club, coach, rang, kindOfProgram, kindOfTao);

        return taoperformer;
    }

    Judge judgesRegistration () {
        String name = askName();
        Boolean sex = askSex();
        String town = askTown();
        CategoriesOfJudges category = askCategory();

        Judge judge = new Judge(name, sex, town, category);

        return judge;
    }

    String askName() {
        System.out.println("П. І. по Б.:");
        String name = ScanningHelper.inputString();
        return name;
    }

    Boolean askSex() {
        System.out.println("СТАТЬ ч/ж:");
        Boolean sex = false;
        String choice = ScanningHelper.inputString();
        if (choice.equals("ч")) {
            sex = false;
        } else if (choice.equals("ж")) {
            sex = true;
        } else {
            askSex();
        }
        return sex;
    }

    String askTown() {
        System.out.println("МІСТО:");
        String town = ScanningHelper.inputString();
        return town;
    }

    LocalDate askDoB () {
        System.out.println("Дата народження:");
        System.out.println("Рік:");
        Integer yearOfBirth = ScanningHelper.inputInt();
        System.out.println("місяць:");
        Integer monthOfBirth = ScanningHelper.inputInt();
        System.out.println("день:");
        Integer dayOfBirth = ScanningHelper.inputInt();
        String dOB = dayOfBirth + ", " + monthOfBirth + ", " + yearOfBirth;
        LocalDate doB = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        return doB;
    }

    Integer askAge(LocalDate doB) {
        String dobf = doB.toString()+"T00:00:00Z";
        final long COUNT_MIN_TO_YEARS = 365*24*60*60;
        long countOfyears;
        Instant dob = Instant.parse(dobf);
        countOfyears = (int) (dob.until(Instant.now(), ChronoUnit.SECONDS))/COUNT_MIN_TO_YEARS;
        Integer age = (int) countOfyears;
        return age;
    }

    String askClub() {
        System.out.println("КЛУБ:");
        String club = ScanningHelper.inputString();
            return club;
        }

    String askCoach() {
        System.out.println("ТРЕНЕР:");
        String coach = ScanningHelper.inputString();
        return coach;
        }

    String askRang() {
         System.out.println("Розряд:");
         String rang = ScanningHelper.inputString();
         return rang;
        }

    String askKindOfProgram() {
          String kindOfProgram = "Обов'язкова програма";
          return kindOfProgram;
        }

    String askKindOfTao() {
        System.out.println("ВВЕДІТЬ НАЗВУ ТАО:");
        String kindOfTao = ScanningHelper.inputString();
        return kindOfTao;
        }

    CategoriesOfJudges askCategory() {
        System.out.println("Категорія:");
        String categoryName = ScanningHelper.inputString();
        CategoriesOfJudges category = CategoriesOfJudges.THIRD_CATEGORY;
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
         return category;
         }

     Float setResult (Float dec1, Float dec2, Float dec3, Float dec4){
         Float result = (dec1 + dec2 + dec3 + dec4) / 4;
         return result;
         }
}