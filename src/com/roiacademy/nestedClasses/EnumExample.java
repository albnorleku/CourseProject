package com.roiacademy.nestedClasses;

public class EnumExample {

    public static void main(String[] args) {

        getGreetFromDayOfTheWeek(WeekDaysEnum.SATURDAY);
        System.out.println(WeekDaysEnum.SATURDAY.name());
        System.out.println(WeekDaysEnum.FRIDAY.getNameInAlbanian());
    }

    public static void getGreetFromDayOfTheWeek(WeekDaysEnum dayOfTheWeek) {
        switch (dayOfTheWeek) {
            case MONDAY: {
                System.out.println("Today is Monday! Boring DAY");
            }
            case SATURDAY: {
                System.out.println("Finally weekend!");
            }
        }
    }
}
