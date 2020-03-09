package com.roiacademy.nestedClasses;

public enum WeekDaysEnum {
    SUNDAY("E diele"),
    MONDAY("E hane"),
    TUESDAY("E marte"),
    WEDNESDAY("E merkure"),
    THURSDAY("E enjte"),
    FRIDAY("E premte"),
    SATURDAY("E shtune");

    private final String nameInAlbanian;

    WeekDaysEnum(String nameInAlbanian) {
        this.nameInAlbanian = nameInAlbanian;
    }

    public String getNameInAlbanian() {
        return nameInAlbanian;
    }
}
