package Competitions.enums;

public enum ageGroupsforLimitedFight {
    YOUNGERS (1012),
    SEORYOUTH (1315),
    JUNIORSLF (1618),
    JUNIORSRF (1920),
    ADULT (21);

    private Integer ageGroup;

    ageGroupsforLimitedFight(Integer ageGroup) {
        this.ageGroup = ageGroup;
    }

    public Integer getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(Integer ageGroup) {
        this.ageGroup = ageGroup;
    }


}
